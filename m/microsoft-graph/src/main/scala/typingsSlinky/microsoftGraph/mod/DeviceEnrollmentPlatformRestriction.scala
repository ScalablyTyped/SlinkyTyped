package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentPlatformRestriction extends js.Object {
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.native
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[Boolean] = js.native
}

object DeviceEnrollmentPlatformRestriction {
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionOps[Self <: DeviceEnrollmentPlatformRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOsMaximumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMaximumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsMaximumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMaximumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOsMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMinimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMinimumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalDeviceEnrollmentBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalDeviceEnrollmentBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalDeviceEnrollmentBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalDeviceEnrollmentBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformBlocked")(js.undefined)
        ret
    }
  }
  
}

