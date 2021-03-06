package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagementRemarketingaudienceUpdate extends StandardParameters {
  
  /**
    * The account ID of the remarketing audience to update.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the remarketing audience to update.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemarketingAudience] = js.native
  
  /**
    * The web property ID of the remarketing audience to update.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object ParamsResourceManagementRemarketingaudienceUpdate {
  
  @scala.inline
  def apply(): ParamsResourceManagementRemarketingaudienceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudienceUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementRemarketingaudienceUpdateMutableBuilder[Self <: ParamsResourceManagementRemarketingaudienceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaRemarketingAudience): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
