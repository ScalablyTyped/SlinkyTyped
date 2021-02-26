package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEnterprisesCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The enterprise token appended to the callback URL.
    */
  var enterpriseToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Google Cloud Platform project which will own the
    * enterprise.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnterprise] = js.native
  
  /**
    * The name of the SignupUrl used to sign up for the enterprise.
    */
  var signupUrlName: js.UndefOr[String] = js.native
}
object ParamsResourceEnterprisesCreate {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesCreateMutableBuilder[Self <: ParamsResourceEnterprisesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseToken(value: String): Self = StObject.set(x, "enterpriseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseTokenUndefined: Self = StObject.set(x, "enterpriseToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEnterprise): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSignupUrlName(value: String): Self = StObject.set(x, "signupUrlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignupUrlNameUndefined: Self = StObject.set(x, "signupUrlName", js.undefined)
  }
}
