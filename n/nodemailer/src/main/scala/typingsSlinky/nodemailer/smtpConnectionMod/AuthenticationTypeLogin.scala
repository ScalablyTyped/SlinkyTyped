package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.LOGIN
import typingsSlinky.nodemailer.nodemailerStrings.Login_
import typingsSlinky.nodemailer.nodemailerStrings.login__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationTypeLogin
  extends Credentials
     with AuthenticationType {
  
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[login__ | Login_ | LOGIN] = js.native
}
object AuthenticationTypeLogin {
  
  @scala.inline
  def apply(pass: String, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
  
  @scala.inline
  implicit class AuthenticationTypeLoginMutableBuilder[Self <: AuthenticationTypeLogin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: login__ | Login_ | LOGIN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
