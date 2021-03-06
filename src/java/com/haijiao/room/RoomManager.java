/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haijiao.room;

import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/**
 *
 * @author fish
 */
public class RoomManager {
    private static Map<String, Room> rooms = new TreeMap();
    public static String createRoom(){
        String id = UUID.randomUUID().toString();
        Room newRoom = new Room(id);
        rooms.put(id, newRoom);
        return id;
    }
    
    public static void deleteRoom(String id){
        rooms.remove(id);
    }
    
    public static Room getRoom(String id){
        return rooms.get(id);
    }
}
