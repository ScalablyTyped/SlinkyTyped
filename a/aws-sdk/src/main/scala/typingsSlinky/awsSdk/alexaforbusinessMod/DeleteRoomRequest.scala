package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomRequest extends js.Object {
  /**
    * The ARN of the room to delete. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object DeleteRoomRequest {
  @scala.inline
  def apply(): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRoomRequest]
  }
  @scala.inline
  implicit class DeleteRoomRequestOps[Self <: DeleteRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(js.undefined)
        ret
    }
  }
  
}

