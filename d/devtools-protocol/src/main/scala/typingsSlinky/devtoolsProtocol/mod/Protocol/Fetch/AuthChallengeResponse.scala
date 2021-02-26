package typingsSlinky.devtoolsProtocol.mod.Protocol.Fetch

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.CancelAuth
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.Default
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.ProvideCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthChallengeResponse extends StObject {
  
  /**
    * The password to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The decision on what to do in response to the authorization challenge.  Default means
    * deferring to the default behavior of the net stack, which will likely either the Cancel
    * authentication or display a popup dialog box. (AuthChallengeResponseResponse enum)
    */
  var response: Default | CancelAuth | ProvideCredentials = js.native
  
  /**
    * The username to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var username: js.UndefOr[String] = js.native
}
object AuthChallengeResponse {
  
  @scala.inline
  def apply(response: Default | CancelAuth | ProvideCredentials): AuthChallengeResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthChallengeResponse]
  }
  
  @scala.inline
  implicit class AuthChallengeResponseMutableBuilder[Self <: AuthChallengeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setResponse(value: Default | CancelAuth | ProvideCredentials): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
