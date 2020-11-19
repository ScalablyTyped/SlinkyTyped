package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagementCustomdimensionsPatch extends StandardParameters {
  
  /**
    * Account ID for the custom dimension to update.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Custom dimension ID for the custom dimension to update.
    */
  var customDimensionId: js.UndefOr[String] = js.native
  
  /**
    * Force the update and ignore any warnings related to the custom dimension
    * being linked to a custom data source / data set.
    */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomDimension] = js.native
  
  /**
    * Web property ID for the custom dimension to update.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object ParamsResourceManagementCustomdimensionsPatch {
  
  @scala.inline
  def apply(): ParamsResourceManagementCustomdimensionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustomdimensionsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementCustomdimensionsPatchOps[Self <: ParamsResourceManagementCustomdimensionsPatch] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCustomDimensionId(value: String): Self = this.set("customDimensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDimensionId: Self = this.set("customDimensionId", js.undefined)
    
    @scala.inline
    def setIgnoreCustomDataSourceLinks(value: Boolean): Self = this.set("ignoreCustomDataSourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCustomDataSourceLinks: Self = this.set("ignoreCustomDataSourceLinks", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCustomDimension): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
