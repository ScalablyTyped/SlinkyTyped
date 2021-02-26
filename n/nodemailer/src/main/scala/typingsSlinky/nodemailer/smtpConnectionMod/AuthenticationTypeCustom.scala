package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.CUSTOM
import typingsSlinky.nodemailer.nodemailerStrings.Custom_
import typingsSlinky.nodemailer.nodemailerStrings.custom__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationTypeCustom
  extends Credentials
     with AuthenticationType {
  
  var method: String = js.native
  
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: custom__ | Custom_ | CUSTOM = js.native
}
object AuthenticationTypeCustom {
  
  @scala.inline
  def apply(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
  
  @scala.inline
  implicit class AuthenticationTypeCustomMutableBuilder[Self <: AuthenticationTypeCustom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: custom__ | Custom_ | CUSTOM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
