package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10EnterpriseModernAppManagementConfiguration extends DeviceConfiguration {
  // Indicates whether or not to uninstall a fixed list of built-in Windows apps.
  var uninstallBuiltInApps: js.UndefOr[Boolean] = js.native
}

object Windows10EnterpriseModernAppManagementConfiguration {
  @scala.inline
  def apply(): Windows10EnterpriseModernAppManagementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10EnterpriseModernAppManagementConfiguration]
  }
  @scala.inline
  implicit class Windows10EnterpriseModernAppManagementConfigurationOps[Self <: Windows10EnterpriseModernAppManagementConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUninstallBuiltInApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallBuiltInApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallBuiltInApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallBuiltInApps")(js.undefined)
        ret
    }
  }
  
}

