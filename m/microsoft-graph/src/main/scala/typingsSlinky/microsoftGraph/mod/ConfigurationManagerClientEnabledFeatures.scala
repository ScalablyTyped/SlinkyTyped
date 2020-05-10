package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationManagerClientEnabledFeatures extends js.Object {
  // Whether compliance policy is managed by Intune
  var compliancePolicy: js.UndefOr[Boolean] = js.native
  // Whether device configuration is managed by Intune
  var deviceConfiguration: js.UndefOr[Boolean] = js.native
  // Whether inventory is managed by Intune
  var inventory: js.UndefOr[Boolean] = js.native
  // Whether modern application is managed by Intune
  var modernApps: js.UndefOr[Boolean] = js.native
  // Whether resource access is managed by Intune
  var resourceAccess: js.UndefOr[Boolean] = js.native
  // Whether Windows Update for Business is managed by Intune
  var windowsUpdateForBusiness: js.UndefOr[Boolean] = js.native
}

object ConfigurationManagerClientEnabledFeatures {
  @scala.inline
  def apply(): ConfigurationManagerClientEnabledFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationManagerClientEnabledFeatures]
  }
  @scala.inline
  implicit class ConfigurationManagerClientEnabledFeaturesOps[Self <: ConfigurationManagerClientEnabledFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliancePolicy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliancePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliancePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliancePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withInventory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(js.undefined)
        ret
    }
    @scala.inline
    def withModernApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modernApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModernApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modernApps")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsUpdateForBusiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsUpdateForBusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsUpdateForBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsUpdateForBusiness")(js.undefined)
        ret
    }
  }
  
}

