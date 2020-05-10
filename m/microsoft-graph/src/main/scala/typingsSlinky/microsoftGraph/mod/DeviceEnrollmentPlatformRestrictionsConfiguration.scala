package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented
  var androidRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var iosRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var macOSRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var windowsMobileRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var windowsRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
}

object DeviceEnrollmentPlatformRestrictionsConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionsConfigurationOps[Self <: DeviceEnrollmentPlatformRestrictionsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidRestriction(value: DeviceEnrollmentPlatformRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withIosRestriction(value: DeviceEnrollmentPlatformRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withMacOSRestriction(value: DeviceEnrollmentPlatformRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOSRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacOSRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOSRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsMobileRestriction(value: DeviceEnrollmentPlatformRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMobileRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsMobileRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMobileRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsRestriction(value: DeviceEnrollmentPlatformRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsRestriction")(js.undefined)
        ret
    }
  }
  
}

