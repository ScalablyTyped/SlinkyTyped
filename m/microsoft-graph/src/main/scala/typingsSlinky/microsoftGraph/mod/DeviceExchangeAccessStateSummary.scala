package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceExchangeAccessStateSummary extends js.Object {
  // Total count of devices with Exchange Access State: Allowed.
  var allowedDeviceCount: js.UndefOr[Double] = js.native
  // Total count of devices with Exchange Access State: Blocked.
  var blockedDeviceCount: js.UndefOr[Double] = js.native
  // Total count of devices with Exchange Access State: Quarantined.
  var quarantinedDeviceCount: js.UndefOr[Double] = js.native
  // Total count of devices for which no Exchange Access State could be found.
  var unavailableDeviceCount: js.UndefOr[Double] = js.native
  // Total count of devices with Exchange Access State: Unknown.
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}

object DeviceExchangeAccessStateSummary {
  @scala.inline
  def apply(): DeviceExchangeAccessStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceExchangeAccessStateSummary]
  }
  @scala.inline
  implicit class DeviceExchangeAccessStateSummaryOps[Self <: DeviceExchangeAccessStateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockedDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarantinedDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarantinedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarantinedDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarantinedDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnavailableDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailableDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnavailableDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailableDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownDeviceCount")(js.undefined)
        ret
    }
  }
  
}

