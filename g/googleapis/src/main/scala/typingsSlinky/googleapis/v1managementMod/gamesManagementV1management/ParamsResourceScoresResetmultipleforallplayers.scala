package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceScoresResetmultipleforallplayers extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaScoresResetMultipleForAllRequest] = js.native
}
object ParamsResourceScoresResetmultipleforallplayers {
  
  @scala.inline
  def apply(): ParamsResourceScoresResetmultipleforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresResetmultipleforallplayers]
  }
  
  @scala.inline
  implicit class ParamsResourceScoresResetmultipleforallplayersMutableBuilder[Self <: ParamsResourceScoresResetmultipleforallplayers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaScoresResetMultipleForAllRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
