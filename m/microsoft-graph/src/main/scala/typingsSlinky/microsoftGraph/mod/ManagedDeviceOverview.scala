package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDeviceOverview extends Entity {
  // Distribution of Exchange Access State in Intune
  var deviceExchangeAccessStateSummary: js.UndefOr[DeviceExchangeAccessStateSummary] = js.native
  // Device operating system summary.
  var deviceOperatingSystemSummary: js.UndefOr[DeviceOperatingSystemSummary] = js.native
  // The number of devices enrolled in both MDM and EAS
  var dualEnrolledDeviceCount: js.UndefOr[Double] = js.native
  // Total enrolled device count. Does not include PC devices managed via Intune PC Agent
  var enrolledDeviceCount: js.UndefOr[Double] = js.native
  // The number of devices enrolled in MDM
  var mdmEnrolledCount: js.UndefOr[Double] = js.native
}

object ManagedDeviceOverview {
  @scala.inline
  def apply(): ManagedDeviceOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceOverview]
  }
  @scala.inline
  implicit class ManagedDeviceOverviewOps[Self <: ManagedDeviceOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceExchangeAccessStateSummary(value: DeviceExchangeAccessStateSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceExchangeAccessStateSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceExchangeAccessStateSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceExchangeAccessStateSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceOperatingSystemSummary(value: DeviceOperatingSystemSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOperatingSystemSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceOperatingSystemSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOperatingSystemSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDualEnrolledDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dualEnrolledDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDualEnrolledDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dualEnrolledDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrolledDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrolledDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMdmEnrolledCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmEnrolledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdmEnrolledCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmEnrolledCount")(js.undefined)
        ret
    }
  }
  
}

