package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InformationalUrl extends js.Object {
  
  // CDN URL to the application's logo, Read-only.
  var logoUrl: js.UndefOr[String] = js.native
  
  // Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
  var marketingUrl: js.UndefOr[String] = js.native
  
  // Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
  var privacyStatementUrl: js.UndefOr[String] = js.native
  
  // Link to the application's support page. For example, https://www.contoso.com/app/support
  var supportUrl: js.UndefOr[String] = js.native
  
  // Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
  var termsOfServiceUrl: js.UndefOr[String] = js.native
}
object InformationalUrl {
  
  @scala.inline
  def apply(): InformationalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationalUrl]
  }
  
  @scala.inline
  implicit class InformationalUrlOps[Self <: InformationalUrl] (val x: Self) extends AnyVal {
    
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
    def setLogoUrl(value: String): Self = this.set("logoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoUrl: Self = this.set("logoUrl", js.undefined)
    
    @scala.inline
    def setMarketingUrl(value: String): Self = this.set("marketingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingUrl: Self = this.set("marketingUrl", js.undefined)
    
    @scala.inline
    def setPrivacyStatementUrl(value: String): Self = this.set("privacyStatementUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyStatementUrl: Self = this.set("privacyStatementUrl", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: String): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportUrl: Self = this.set("supportUrl", js.undefined)
    
    @scala.inline
    def setTermsOfServiceUrl(value: String): Self = this.set("termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfServiceUrl: Self = this.set("termsOfServiceUrl", js.undefined)
  }
}
