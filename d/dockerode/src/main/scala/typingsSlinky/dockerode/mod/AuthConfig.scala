package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthConfig extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var password: String = js.native
  
  var serveraddress: String = js.native
  
  var username: String = js.native
}
object AuthConfig {
  
  @scala.inline
  def apply(password: String, serveraddress: String, username: String): AuthConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], serveraddress = serveraddress.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthConfig]
  }
  
  @scala.inline
  implicit class AuthConfigMutableBuilder[Self <: AuthConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeraddress(value: String): Self = StObject.set(x, "serveraddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
