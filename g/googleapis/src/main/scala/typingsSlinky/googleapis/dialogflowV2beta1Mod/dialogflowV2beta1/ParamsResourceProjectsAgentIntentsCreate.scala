package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAgentIntentsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The resource view to apply to the returned intent.
    */
  var intentView: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language of training phrases, parameters and rich messages
    * defined in `intent`. If not specified, the agent's default language is
    * used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Required. The agent to create a intent for. Format: `projects/<Project
    * ID>/agent`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
}
object ParamsResourceProjectsAgentIntentsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentIntentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentIntentsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentIntentsCreateMutableBuilder[Self <: ParamsResourceProjectsAgentIntentsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIntentView(value: String): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Intent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
