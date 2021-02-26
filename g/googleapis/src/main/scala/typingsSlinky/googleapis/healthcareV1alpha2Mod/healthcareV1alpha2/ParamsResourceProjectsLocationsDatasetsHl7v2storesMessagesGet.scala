package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The resource name of the HL7v2 message to retrieve.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies which parts of the Message resource should be returned in the
    * response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGetMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
