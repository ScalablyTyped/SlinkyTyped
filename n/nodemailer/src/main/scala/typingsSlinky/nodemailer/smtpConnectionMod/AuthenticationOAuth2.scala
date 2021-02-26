package typingsSlinky.nodemailer.smtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationOAuth2 extends StObject {
  
  /**  if set then forces smtp-connection to use XOAuth2 for authentication */
  var oauth2: OAuth2 = js.native
}
object AuthenticationOAuth2 {
  
  @scala.inline
  def apply(oauth2: OAuth2): AuthenticationOAuth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationOAuth2]
  }
  
  @scala.inline
  implicit class AuthenticationOAuth2MutableBuilder[Self <: AuthenticationOAuth2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOauth2(value: OAuth2): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
  }
}
