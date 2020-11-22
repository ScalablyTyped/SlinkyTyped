package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppIdentity extends js.Object {
  
  // Refers to the Unique GUID representing Application Id in the Azure Active Directory.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Application Name displayed in the Azure Portal.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Unique GUID indicating Service Principal Id in Azure Active Directory for the corresponding App.
  var servicePrincipalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Service Principal Name is the Application name in the tenant.
  var servicePrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object AppIdentity {
  
  @scala.inline
  def apply(): AppIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppIdentity]
  }
  
  @scala.inline
  implicit class AppIdentityOps[Self <: AppIdentity] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setServicePrincipalId(value: NullableOption[String]): Self = this.set("servicePrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePrincipalId: Self = this.set("servicePrincipalId", js.undefined)
    
    @scala.inline
    def setServicePrincipalIdNull: Self = this.set("servicePrincipalId", null)
    
    @scala.inline
    def setServicePrincipalName(value: NullableOption[String]): Self = this.set("servicePrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePrincipalName: Self = this.set("servicePrincipalName", js.undefined)
    
    @scala.inline
    def setServicePrincipalNameNull: Self = this.set("servicePrincipalName", null)
  }
}
