package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReportingSettings extends js.Object {
  /** Whether displays reporting is enabled. */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.native
  /** Whether hardware status reporting is enabled. */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.native
  /** Whether memory info reporting is enabled. */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.native
  /** Whether network info reporting is enabled. */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.native
  /** Whether power management event reporting is enabled. */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.native
  /** Whether software info reporting is enabled. */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.native
}

object StatusReportingSettings {
  @scala.inline
  def apply(): StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReportingSettings]
  }
  @scala.inline
  implicit class StatusReportingSettingsOps[Self <: StatusReportingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayInfoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInfoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInfoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInfoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareStatusEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareStatusEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareStatusEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareStatusEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInfoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInfoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInfoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInfoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerManagementEventsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerManagementEventsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerManagementEventsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerManagementEventsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareInfoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareInfoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareInfoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareInfoEnabled")(js.undefined)
        ret
    }
  }
  
}

