package typingsSlinky.reactNativeAuth0.mod

import typingsSlinky.reactNativeAuth0.reactNativeAuth0Strings.code
import typingsSlinky.reactNativeAuth0.reactNativeAuth0Strings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordlessWithEmailParams extends StObject {
  
  var authParams: js.UndefOr[AuthParams] = js.native
  
  var email: String = js.native
  
  var send: js.UndefOr[link | code] = js.native
}
object PasswordlessWithEmailParams {
  
  @scala.inline
  def apply(email: String): PasswordlessWithEmailParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithEmailParams]
  }
  
  @scala.inline
  implicit class PasswordlessWithEmailParamsMutableBuilder[Self <: PasswordlessWithEmailParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthParams(value: AuthParams): Self = StObject.set(x, "authParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthParamsUndefined: Self = StObject.set(x, "authParams", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: link | code): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
  }
}
