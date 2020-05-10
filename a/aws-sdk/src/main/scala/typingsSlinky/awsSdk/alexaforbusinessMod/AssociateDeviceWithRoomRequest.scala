package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDeviceWithRoomRequest extends js.Object {
  /**
    * The ARN of the device to associate to a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the room with which to associate the device. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object AssociateDeviceWithRoomRequest {
  @scala.inline
  def apply(): AssociateDeviceWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
  }
  @scala.inline
  implicit class AssociateDeviceWithRoomRequestOps[Self <: AssociateDeviceWithRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(js.undefined)
        ret
    }
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

