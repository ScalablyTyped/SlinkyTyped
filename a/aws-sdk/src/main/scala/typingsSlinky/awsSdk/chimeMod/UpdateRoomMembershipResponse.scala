package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomMembershipResponse extends js.Object {
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
  implicit class UpdateRoomMembershipResponseOps[Self <: UpdateRoomMembershipResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomMembership(value: RoomMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomMembership")(js.undefined)
        ret
    }
  }
  
}

