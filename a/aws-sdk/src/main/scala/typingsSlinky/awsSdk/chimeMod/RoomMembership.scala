package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomMembership extends js.Object {
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
  implicit class RoomMembershipOps[Self <: RoomMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitedBy(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMember(value: Member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Member")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: RoomMembershipRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomId")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(js.undefined)
        ret
    }
  }
  
}

