package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosStoreAppAssignmentSettings extends MobileAppAssignmentSettings {
  
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[String] = js.native
}
object IosStoreAppAssignmentSettings {
  
  @scala.inline
  def apply(): IosStoreAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosStoreAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class IosStoreAppAssignmentSettingsOps[Self <: IosStoreAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVpnConfigurationId(value: String): Self = this.set("vpnConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConfigurationId: Self = this.set("vpnConfigurationId", js.undefined)
  }
}
