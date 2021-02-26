package typingsSlinky.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents the OAuth credentials returned by an OAuth
  * provider. Implementations specify the details about each auth provider's
  * credential requirements.
  *
  */
@js.native
trait OAuthCredential extends AuthCredential {
  
  /**
    * The OAuth access token associated with the credential if it belongs to
    * an OAuth provider, such as `facebook.com`, `twitter.com`, etc.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * The OAuth ID token associated with the credential if it belongs to an
    * OIDC provider, such as `google.com`.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * The OAuth access token secret associated with the credential if it
    * belongs to an OAuth 1.0 provider, such as `twitter.com`.
    */
  var secret: js.UndefOr[String] = js.native
}
object OAuthCredential {
  
  @scala.inline
  def apply(providerId: String, signInMethod: String, toJSON: () => js.Object): OAuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OAuthCredential]
  }
  
  @scala.inline
  implicit class OAuthCredentialMutableBuilder[Self <: OAuthCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
