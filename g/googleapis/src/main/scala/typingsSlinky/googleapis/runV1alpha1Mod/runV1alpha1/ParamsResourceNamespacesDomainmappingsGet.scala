package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceNamespacesDomainmappingsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the domain mapping being retrieved. If needed, replace
    * {namespace_id} with the project ID.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceNamespacesDomainmappingsGet {
  
  @scala.inline
  def apply(): ParamsResourceNamespacesDomainmappingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesDomainmappingsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceNamespacesDomainmappingsGetMutableBuilder[Self <: ParamsResourceNamespacesDomainmappingsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
