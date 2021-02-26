package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.anon.Expire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
@js.native
trait LoginStatus extends StObject {
  
  var authResponse: Expire = js.native
  
  var status: ConnectionStatus = js.native
}
object LoginStatus {
  
  @scala.inline
  def apply(authResponse: Expire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatus]
  }
  
  @scala.inline
  implicit class LoginStatusMutableBuilder[Self <: LoginStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthResponse(value: Expire): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
