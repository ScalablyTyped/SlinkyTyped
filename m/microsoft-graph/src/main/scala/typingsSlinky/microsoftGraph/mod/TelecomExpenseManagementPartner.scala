package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelecomExpenseManagementPartner extends Entity {
  
  // Whether the partner's AAD app has been authorized to access Intune.
  var appAuthorized: js.UndefOr[Boolean] = js.native
  
  // Display name of the TEM partner.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether Intune's connection to the TEM service is currently enabled or disabled.
  var enabled: js.UndefOr[Boolean] = js.native
  
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.native
  
  // URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
  var url: js.UndefOr[NullableOption[String]] = js.native
}
object TelecomExpenseManagementPartner {
  
  @scala.inline
  def apply(): TelecomExpenseManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelecomExpenseManagementPartner]
  }
  
  @scala.inline
  implicit class TelecomExpenseManagementPartnerOps[Self <: TelecomExpenseManagementPartner] (val x: Self) extends AnyVal {
    
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
    def setAppAuthorized(value: Boolean): Self = this.set("appAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppAuthorized: Self = this.set("appAuthorized", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setLastConnectionDateTime(value: String): Self = this.set("lastConnectionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastConnectionDateTime: Self = this.set("lastConnectionDateTime", js.undefined)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
  }
}
