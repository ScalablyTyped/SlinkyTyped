package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosVppAppAssignmentSettings extends MobileAppAssignmentSettings {
  // Whether or not to use device licensing.
  var useDeviceLicensing: js.UndefOr[Boolean] = js.native
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[String] = js.native
}

object IosVppAppAssignmentSettings {
  @scala.inline
  def apply(): IosVppAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppAppAssignmentSettings]
  }
  @scala.inline
  implicit class IosVppAppAssignmentSettingsOps[Self <: IosVppAppAssignmentSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseDeviceLicensing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeviceLicensing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDeviceLicensing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeviceLicensing")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConfigurationId")(js.undefined)
        ret
    }
  }
  
}

