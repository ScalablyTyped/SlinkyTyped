package typingsSlinky.pusherChatkitClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @js.native
  trait PusherUser extends StObject {
    
    var avatarURL: js.UndefOr[String] = js.native
    
    var createdAt: String = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var presence: PusherUserPresence = js.native
    
    var updatedAt: String = js.native
  }
  object PusherUser {
    
    @scala.inline
    def apply(createdAt: String, id: String, name: String, presence: PusherUserPresence, updatedAt: String): PusherUser = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherUser]
    }
    
    @scala.inline
    implicit class PusherUserMutableBuilder[Self <: PusherUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatarURL(value: String): Self = StObject.set(x, "avatarURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarURLUndefined: Self = StObject.set(x, "avatarURL", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresence(value: PusherUserPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.online
    - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.offline
    - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.unknown
  */
  trait PusherUserPresence extends StObject
  object PusherUserPresence {
    
    @scala.inline
    def offline: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.offline = "offline".asInstanceOf[typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.offline]
    
    @scala.inline
    def online: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.online = "online".asInstanceOf[typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.online]
    
    @scala.inline
    def unknown: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.unknown = "unknown".asInstanceOf[typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.unknown]
  }
}
