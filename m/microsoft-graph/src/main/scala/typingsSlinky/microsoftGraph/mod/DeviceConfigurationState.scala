package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationState extends Entity {
  // The name of the policy for this policyBase
  var displayName: js.UndefOr[String] = js.native
  // Platform type that the policy applies to
  var platformType: js.UndefOr[PolicyPlatformType] = js.native
  // Count of how many setting a policy holds
  var settingCount: js.UndefOr[Double] = js.native
  var settingStates: js.UndefOr[js.Array[DeviceConfigurationSettingState]] = js.native
  // The compliance state of the policy
  var state: js.UndefOr[ComplianceStatus] = js.native
  // The version of the policy
  var version: js.UndefOr[Double] = js.native
}

object DeviceConfigurationState {
  @scala.inline
  def apply(): DeviceConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationState]
  }
  @scala.inline
  implicit class DeviceConfigurationStateOps[Self <: DeviceConfigurationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: PolicyPlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingStates(value: js.Array[DeviceConfigurationSettingState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingStates")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ComplianceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

