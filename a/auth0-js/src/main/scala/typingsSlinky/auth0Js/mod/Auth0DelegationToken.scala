package typingsSlinky.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0DelegationToken extends StObject {
  
  /** The length of time in seconds the token is valid for. */
  var expiresIn: Double = js.native
  
  /** The JWT for delegated access.  */
  var idToken: String = js.native
  
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: String = js.native
}
object Auth0DelegationToken {
  
  @scala.inline
  def apply(expiresIn: Double, idToken: String, tokenType: String): Auth0DelegationToken = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0DelegationToken]
  }
  
  @scala.inline
  implicit class Auth0DelegationTokenMutableBuilder[Self <: Auth0DelegationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
