package typingsSlinky.pusherChatkitClient

import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomMod {
  
  @js.native
  trait PusherReadCursor extends StObject {
    
    var position: Double = js.native
    
    var room: PusherRoom = js.native
    
    var `type`: Double = js.native
    
    var updatedAt: String = js.native
    
    var user: PusherUser = js.native
  }
  object PusherReadCursor {
    
    @scala.inline
    def apply(position: Double, room: PusherRoom, `type`: Double, updatedAt: String, user: PusherUser): PusherReadCursor = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherReadCursor]
    }
    
    @scala.inline
    implicit class PusherReadCursorMutableBuilder[Self <: PusherReadCursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoom(value: PusherRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: PusherUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PusherRoom extends StObject {
    
    var createdAt: String = js.native
    
    var createdByUserId: String = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var id: String = js.native
    
    var isPrivate: Boolean = js.native
    
    var lastMessageAt: String = js.native
    
    var name: String = js.native
    
    var unreadCount: Double = js.native
    
    var updatedAt: String = js.native
    
    var users: js.Array[PusherUser] = js.native
  }
  object PusherRoom {
    
    @scala.inline
    def apply(
      createdAt: String,
      createdByUserId: String,
      id: String,
      isPrivate: Boolean,
      lastMessageAt: String,
      name: String,
      unreadCount: Double,
      updatedAt: String,
      users: js.Array[PusherUser]
    ): PusherRoom = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], lastMessageAt = lastMessageAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherRoom]
    }
    
    @scala.inline
    implicit class PusherRoomMutableBuilder[Self <: PusherRoom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUserId(value: String): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastMessageAt(value: String): Self = StObject.set(x, "lastMessageAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnreadCount(value: Double): Self = StObject.set(x, "unreadCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[PusherUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: PusherUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
