package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStatusInfo extends js.Object {
  /**
    * The latest available information about the connection status of a device. 
    */
  var ConnectionStatus: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ConnectionStatus] = js.native
  /**
    * The time (in epoch) when the device connection status changed.
    */
  var ConnectionStatusUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceStatusDetails] = js.native
}

object DeviceStatusInfo {
  @scala.inline
  def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  @scala.inline
  implicit class DeviceStatusInfoOps[Self <: DeviceStatusInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionStatus(value: ConnectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStatusUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatusUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStatusUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatusUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatusDetails(value: DeviceStatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatusDetails")(js.undefined)
        ret
    }
  }
  
}

