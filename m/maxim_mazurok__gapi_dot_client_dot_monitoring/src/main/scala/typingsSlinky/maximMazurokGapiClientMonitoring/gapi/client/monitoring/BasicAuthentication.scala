package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicAuthentication extends StObject {
  
  /** The password to use when authenticating with the HTTP server. */
  var password: js.UndefOr[String] = js.native
  
  /** The username to use when authenticating with the HTTP server. */
  var username: js.UndefOr[String] = js.native
}
object BasicAuthentication {
  
  @scala.inline
  def apply(): BasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAuthentication]
  }
  
  @scala.inline
  implicit class BasicAuthenticationMutableBuilder[Self <: BasicAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
