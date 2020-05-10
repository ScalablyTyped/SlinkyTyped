package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateDeviceFromRoomRequest extends js.Object {
  /**
    * The ARN of the device to disassociate from a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}

object DisassociateDeviceFromRoomRequest {
  @scala.inline
  def apply(): DisassociateDeviceFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
  }
  @scala.inline
  implicit class DisassociateDeviceFromRoomRequestOps[Self <: DisassociateDeviceFromRoomRequest] (val x: Self) extends AnyVal {
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
  }
  
}

