package typingsSlinky.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic OAuth provider.
  *
  * @example
  * ```javascript
  * // Using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // This gives you the OAuth Access Token for that provider.
  *     var token = result.credential.accessToken;
  *   }
  *   var user = result.user;
  * });
  *
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.OAuthProvider('google.com');
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithRedirect(provider);
  * ```
  * @example
  * ```javascript
  * // Using a popup.
  * var provider = new firebase.auth.OAuthProvider('google.com');
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithPopup(provider).then(function(result) {
  *  // This gives you the OAuth Access Token for that provider.
  *  var token = result.credential.accessToken;
  *  // The signed-in user info.
  *  var user = result.user;
  * });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  * @param providerId The associated provider ID, such as `github.com`.
  */
@js.native
trait OAuthProvider extends AuthProvider {
  
  /**
    * @param scope Provider OAuth scope to add.
    */
  def addScope(scope: String): AuthProvider = js.native
  
  /**
    * Creates a Firebase credential from a generic OAuth provider's access token or
    * ID token. The raw nonce is required when an ID token with a nonce field is
    * provided. The SHA-256 hash of the raw nonce must match the nonce field in
    * the ID token.
    *
    * @example
    * ```javascript
    * // `googleUser` from the onsuccess Google Sign In callback.
    * // Initialize a generate OAuth provider with a `google.com` providerId.
    * var provider = new firebase.auth.OAuthProvider('google.com');
    * var credential = provider.credential({
    *   idToken: googleUser.getAuthResponse().id_token,
    * });
    * firebase.auth().signInWithCredential(credential)
    * ```
    *
    * @param optionsOrIdToken Either the options object containing
    *     the ID token, access token and raw nonce or the ID token string.
    * @param accessToken The OAuth access token.
    */
  def credential(): OAuthCredential = js.native
  def credential(optionsOrIdToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: String, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: Null, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions, accessToken: String): OAuthCredential = js.native
  
  /**
    * Sets the OAuth custom parameters to pass in an OAuth request for popup
    * and redirect sign-in operations.
    * For a detailed list, check the
    * reserved required OAuth 2.0 parameters such as `client_id`, `redirect_uri`,
    * `scope`, `response_type` and `state` are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
