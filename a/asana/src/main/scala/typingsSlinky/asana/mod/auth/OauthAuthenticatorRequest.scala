package typingsSlinky.asana.mod.auth

import typingsSlinky.asana.anon.Authorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthenticatorRequest extends StObject {
  
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: Authorization = js.native
}
object OauthAuthenticatorRequest {
  
  @scala.inline
  def apply(headers: Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
  
  @scala.inline
  implicit class OauthAuthenticatorRequestMutableBuilder[Self <: OauthAuthenticatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Authorization): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
