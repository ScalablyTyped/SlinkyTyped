package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOperatingSystemSummary extends js.Object {
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.native
  // Number of iOS device count.
  var iosCount: js.UndefOr[Double] = js.native
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[Double] = js.native
  // Number of unknown device count.
  var unknownCount: js.UndefOr[Double] = js.native
  // Number of Windows device count.
  var windowsCount: js.UndefOr[Double] = js.native
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[Double] = js.native
}

object DeviceOperatingSystemSummary {
  @scala.inline
  def apply(): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
  @scala.inline
  implicit class DeviceOperatingSystemSummaryOps[Self <: DeviceOperatingSystemSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIosCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMacOSCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOSCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacOSCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOSCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsMobileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMobileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsMobileCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMobileCount")(js.undefined)
        ret
    }
  }
  
}

