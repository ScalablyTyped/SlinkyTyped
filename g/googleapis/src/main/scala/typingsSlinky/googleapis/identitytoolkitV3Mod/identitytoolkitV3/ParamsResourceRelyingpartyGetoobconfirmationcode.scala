package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRelyingpartyGetoobconfirmationcode extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRelyingparty] = js.native
}
object ParamsResourceRelyingpartyGetoobconfirmationcode {
  
  @scala.inline
  def apply(): ParamsResourceRelyingpartyGetoobconfirmationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyGetoobconfirmationcode]
  }
  
  @scala.inline
  implicit class ParamsResourceRelyingpartyGetoobconfirmationcodeMutableBuilder[Self <: ParamsResourceRelyingpartyGetoobconfirmationcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaRelyingparty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
