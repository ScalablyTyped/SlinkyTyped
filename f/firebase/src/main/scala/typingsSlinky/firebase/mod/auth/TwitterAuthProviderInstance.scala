package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
@JSImport("firebase", "auth.TwitterAuthProvider_Instance")
@js.native
class TwitterAuthProviderInstance () extends AuthProvider {
  
  /**
    * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'lang'.
    * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
    * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
