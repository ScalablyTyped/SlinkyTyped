package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsDeidentifytemplatesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Resource name of organization and deidentify template to be updated, for
    * example `organizations/433245324/deidentifyTemplates/432452342` or
    * projects/project-id/deidentifyTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] = js.native
}
object ParamsResourceOrganizationsDeidentifytemplatesPatch {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsDeidentifytemplatesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsDeidentifytemplatesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsDeidentifytemplatesPatchMutableBuilder[Self <: ParamsResourceOrganizationsDeidentifytemplatesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
