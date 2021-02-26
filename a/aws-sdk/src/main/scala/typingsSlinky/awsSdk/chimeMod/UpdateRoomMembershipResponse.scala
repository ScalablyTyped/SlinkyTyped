package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoomMembershipResponse extends StObject {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typingsSlinky.awsSdk.chimeMod.RoomMembership] = js.native
}
object UpdateRoomMembershipResponse {
  
  @scala.inline
  def apply(): UpdateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit class UpdateRoomMembershipResponseMutableBuilder[Self <: UpdateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomMembership(value: RoomMembership): Self = StObject.set(x, "RoomMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomMembershipUndefined: Self = StObject.set(x, "RoomMembership", js.undefined)
  }
}
