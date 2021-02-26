package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.anon.AccessToken_
import typingsSlinky.deezerSdk.deezerSdkStrings.connected
import typingsSlinky.deezerSdk.deezerSdkStrings.not_authorized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
@js.native
trait LoginResponse extends StObject {
  
  var authResponse: AccessToken_ = js.native
  
  var status: connected | not_authorized = js.native
  
  var userID: String = js.native
}
object LoginResponse {
  
  @scala.inline
  def apply(authResponse: AccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  
  @scala.inline
  implicit class LoginResponseMutableBuilder[Self <: LoginResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthResponse(value: AccessToken_): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: connected | not_authorized): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
