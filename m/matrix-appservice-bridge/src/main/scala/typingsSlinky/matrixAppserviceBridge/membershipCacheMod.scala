package typingsSlinky.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object membershipCacheMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/membership-cache", "MembershipCache")
  @js.native
  class MembershipCache () extends StObject {
    
    /**
      * Gets the *cached* state of a user's membership for a room.
      * This DOES NOT check to verify the value is correct (i.e the
      * room may have state reset and left the user from the room).
      *
      * This only caches users from the appservice.
      *
      * @param roomId Room id to check the state of.
      * @param userId The userid to check the state of.
      * @returns The membership state of the user, e.g. "joined"
      */
    def getMemberEntry(roomId: String, userId: String): UserMembership = js.native
    
    /**
      * Gets the *cached* state of a user's membership for a room.
      * This DOES NOT check to verify the value is correct (i.e the
      * room may have state reset and left the user from the room).
      *
      * This only caches users from the appservice.
      *
      * @param roomId Room id to check the state of.
      * @param userId The userid to check the state of.
      * @returns The member's profile information.
      */
    def getMemberProfile(roomId: String, userId: String): UserProfile = js.native
    
    def getMembersForRoom(roomId: String): js.Array[String] | Null = js.native
    def getMembersForRoom(roomId: String, filterFor: UserMembership): js.Array[String] | Null = js.native
    
    /**
      * Is a user considered registered with the homeserver.
      * @param userId A Matrix userId
      */
    def isUserRegistered(userId: String): Boolean = js.native
    
    var membershipMap: js.Any = js.native
    
    var registeredUsers: js.Any = js.native
    
    /**
      * Set the *cached* state of a user's membership for a room.
      * Use this to optimise intents so that they do not attempt
      * to join a room if we know they are joined.
      * This DOES NOT set the actual membership of the room.
      *
      * This only caches users from the appservice.
      * @param roomId Room id to set the state of.
      * @param userId The userid to set the state of.
      * @param membership The membership value to set for the user
      *                       e.g joined.
      */
    def setMemberEntry(roomId: String, userId: String, membership: UserMembership, profile: UserProfile): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.join
    - typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.invite
    - typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.leave
    - typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.ban
    - scala.Null
  */
  type UserMembership = _UserMembership | Null
  
  @js.native
  trait UserProfile extends StObject {
    
    var avatar_url: js.UndefOr[String] = js.native
    
    var displayname: js.UndefOr[String] = js.native
  }
  object UserProfile {
    
    @scala.inline
    def apply(): UserProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProfile]
    }
    
    @scala.inline
    implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      @scala.inline
      def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    }
  }
  
  trait _UserMembership extends StObject
}
