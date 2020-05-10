package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeviceSyncRequest extends js.Object {
  /**
    * The ARN of the device to sync. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * Request structure to start the device sync. Required.
    */
  var Features: typingsSlinky.awsSdk.alexaforbusinessMod.Features = js.native
  /**
    * The ARN of the room with which the device to sync is associated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object StartDeviceSyncRequest {
  @scala.inline
  def apply(Features: Features): StartDeviceSyncRequest = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceSyncRequest]
  }
  @scala.inline
  implicit class StartDeviceSyncRequestOps[Self <: StartDeviceSyncRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Features")(value.asInstanceOf[js.Any])
        ret
    }
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

