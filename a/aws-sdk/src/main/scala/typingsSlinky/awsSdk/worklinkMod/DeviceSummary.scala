package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSummary extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[Id] = js.native
  /**
    * The status of the device.
    */
  var DeviceStatus: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DeviceStatus] = js.native
}

object DeviceSummary {
  @scala.inline
  def apply(): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSummary]
  }
  @scala.inline
  implicit class DeviceSummaryOps[Self <: DeviceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatus(value: DeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatus")(js.undefined)
        ret
    }
  }
  
}

