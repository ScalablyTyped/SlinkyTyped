package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceResultsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResultsGetRequest] = js.native
  
  /**
    * External URL ID for the survey.
    */
  var surveyUrlId: js.UndefOr[String] = js.native
}
object ParamsResourceResultsGet {
  
  @scala.inline
  def apply(): ParamsResourceResultsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResultsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceResultsGetMutableBuilder[Self <: ParamsResourceResultsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaResultsGetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSurveyUrlId(value: String): Self = StObject.set(x, "surveyUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyUrlIdUndefined: Self = StObject.set(x, "surveyUrlId", js.undefined)
  }
}
