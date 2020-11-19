package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagedconfigurationsforuserPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the managed configuration (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var managedConfigurationForUserId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaManagedConfiguration] = js.native
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceManagedconfigurationsforuserPatch {
  
  @scala.inline
  def apply(): ParamsResourceManagedconfigurationsforuserPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationsforuserPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceManagedconfigurationsforuserPatchOps[Self <: ParamsResourceManagedconfigurationsforuserPatch] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForUserId(value: String): Self = this.set("managedConfigurationForUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurationForUserId: Self = this.set("managedConfigurationForUserId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaManagedConfiguration): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
