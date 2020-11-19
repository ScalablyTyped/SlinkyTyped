package typingsSlinky.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeUrlParams extends js.Object {
  
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
  implicit class AuthorizeUrlParamsOps[Self <: AuthorizeUrlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
