package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomMembershipRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: NonEmptyString = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object DeleteRoomMembershipRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): DeleteRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomMembershipRequest]
  }
  @scala.inline
  implicit class DeleteRoomMembershipRequestOps[Self <: DeleteRoomMembershipRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

