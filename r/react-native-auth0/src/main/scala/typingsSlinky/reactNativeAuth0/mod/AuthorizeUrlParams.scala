package typingsSlinky.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeUrlParams extends StObject {
  
  var redirectUri: String = js.native
  
  var responseType: String = js.native
  
  var state: String = js.native
}
object AuthorizeUrlParams {
  
  @scala.inline
  def apply(redirectUri: String, responseType: String, state: String): AuthorizeUrlParams = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeUrlParams]
  }
  
  @scala.inline
  implicit class AuthorizeUrlParamsMutableBuilder[Self <: AuthorizeUrlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
