package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBackendservicesGethealth extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the BackendService resource to which the queried instance
    * belongs.
    */
  var backendService: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResourceGroupReference] = js.native
}
object ParamsResourceBackendservicesGethealth {
  
  @scala.inline
  def apply(): ParamsResourceBackendservicesGethealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendservicesGethealth]
  }
  
  @scala.inline
  implicit class ParamsResourceBackendservicesGethealthMutableBuilder[Self <: ParamsResourceBackendservicesGethealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaResourceGroupReference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
