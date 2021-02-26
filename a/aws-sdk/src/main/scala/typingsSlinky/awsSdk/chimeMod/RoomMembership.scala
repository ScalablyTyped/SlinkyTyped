package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomMembership extends StObject {
  
  /**
    * The identifier of the user that invited the room member.
    */
  var InvitedBy: js.UndefOr[NonEmptyString] = js.native
  
  var Member: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Member] = js.native
  
  /**
    * The membership role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
  
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The room membership update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.native
}
object RoomMembership {
  
  @scala.inline
  def apply(): RoomMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomMembership]
  }
  
  @scala.inline
  implicit class RoomMembershipMutableBuilder[Self <: RoomMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitedBy(value: NonEmptyString): Self = StObject.set(x, "InvitedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedByUndefined: Self = StObject.set(x, "InvitedBy", js.undefined)
    
    @scala.inline
    def setMember(value: Member): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomIdUndefined: Self = StObject.set(x, "RoomId", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
