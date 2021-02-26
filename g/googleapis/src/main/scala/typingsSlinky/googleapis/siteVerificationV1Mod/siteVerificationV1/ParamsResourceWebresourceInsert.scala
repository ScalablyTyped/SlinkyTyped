package typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceWebresourceInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSiteVerificationWebResourceResource] = js.native
  
  /**
    * The method to use for verifying a site or domain.
    */
  var verificationMethod: js.UndefOr[String] = js.native
}
object ParamsResourceWebresourceInsert {
  
  @scala.inline
  def apply(): ParamsResourceWebresourceInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceWebresourceInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceWebresourceInsertMutableBuilder[Self <: ParamsResourceWebresourceInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSiteVerificationWebResourceResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
  }
}
