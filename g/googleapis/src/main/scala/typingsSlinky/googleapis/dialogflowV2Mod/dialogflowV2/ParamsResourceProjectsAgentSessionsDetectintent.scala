package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAgentSessionsDetectintent extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2DetectIntentRequest] = js.native
  
  /**
    * Required. The name of the session this query is sent to. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>`. It's up to the API
    * caller to choose an appropriate session ID. It can be a random number or
    * some type of user identifier (preferably hashed). The length of the
    * session ID must not exceed 36 bytes.
    */
  var session: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsAgentSessionsDetectintent {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentSessionsDetectintent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentSessionsDetectintent]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentSessionsDetectintentMutableBuilder[Self <: ParamsResourceProjectsAgentSessionsDetectintent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudDialogflowV2DetectIntentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
