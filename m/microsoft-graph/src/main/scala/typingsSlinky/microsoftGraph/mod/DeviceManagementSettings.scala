package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementSettings extends js.Object {
  // The number of days a device is allowed to go without checking in to remain compliant. Valid values 0 to 120
  var deviceComplianceCheckinThresholdDays: js.UndefOr[Double] = js.native
  // Is feature enabled or not for scheduled action for rule.
  var isScheduledActionEnabled: js.UndefOr[Boolean] = js.native
  // Device should be noncompliant when there is no compliance policy targeted when this is true
  var secureByDefault: js.UndefOr[Boolean] = js.native
}

object DeviceManagementSettings {
  @scala.inline
  def apply(): DeviceManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementSettings]
  }
  @scala.inline
  implicit class DeviceManagementSettingsOps[Self <: DeviceManagementSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceComplianceCheckinThresholdDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceCheckinThresholdDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceComplianceCheckinThresholdDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceCheckinThresholdDays")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScheduledActionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScheduledActionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScheduledActionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScheduledActionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureByDefault")(js.undefined)
        ret
    }
  }
  
}

