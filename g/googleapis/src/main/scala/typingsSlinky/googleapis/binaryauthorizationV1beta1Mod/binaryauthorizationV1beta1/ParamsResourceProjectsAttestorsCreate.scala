package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAttestorsCreate extends StandardParameters {
  
  /**
    * Required. The attestors ID.
    */
  var attestorId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The parent of this attestor.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAttestor] = js.native
}
object ParamsResourceProjectsAttestorsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAttestorsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAttestorsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAttestorsCreateMutableBuilder[Self <: ParamsResourceProjectsAttestorsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestorId(value: String): Self = StObject.set(x, "attestorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestorIdUndefined: Self = StObject.set(x, "attestorId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAttestor): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
