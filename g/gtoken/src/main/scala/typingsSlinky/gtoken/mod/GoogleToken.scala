package typingsSlinky.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gtoken", "GoogleToken")
@js.native
/**
  * Create a GoogleToken.
  *
  * @param options  Configuration object.
  */
class GoogleToken () extends js.Object {
  def this(options: TokenOptions) = this()
  
  def accessToken: js.UndefOr[String] = js.native
  
  var additionalClaims: js.UndefOr[js.Object] = js.native
  
  /**
    * Configure the GoogleToken for re-use.
    * @param  {object} options Configuration object.
    */
  var configure: js.Any = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var ensureEmail: js.Any = js.native
  
  var expiresAt: js.UndefOr[Double] = js.native
  
  /**
    * Given a keyFile, extract the key and client email if available
    * @param keyFile Path to a json, pem, or p12 file that contains the key.
    * @returns an object with privateKey and clientEmail properties
    */
  def getCredentials(keyFile: String): js.Promise[Credentials] = js.native
  
  /**
    * Returns a cached token or retrieves a new one from Google.
    *
    * @param callback The callback function.
    */
  def getToken(): js.Promise[TokenData] = js.native
  def getToken(callback: GetTokenCallback): Unit = js.native
  def getToken(callback: GetTokenCallback, opts: GetTokenOptions): Unit = js.native
  def getToken(opts: GetTokenOptions): js.Promise[TokenData] = js.native
  
  var getTokenAsync: js.Any = js.native
  
  /**
    * Returns whether the token has expired.
    *
    * @return true if the token has expired, false otherwise.
    */
  def hasExpired(): Boolean = js.native
  
  def idToken: js.UndefOr[String] = js.native
  
  var iss: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var keyFile: js.UndefOr[String] = js.native
  
  var rawToken: js.UndefOr[TokenData] = js.native
  
  def refreshToken: js.UndefOr[String] = js.native
  
  /**
    * Request the token from Google.
    */
  var requestToken: js.Any = js.native
  
  /**
    * Revoke the token if one is set.
    *
    * @param callback The callback function.
    */
  def revokeToken(): js.Promise[Unit] = js.native
  def revokeToken(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  var revokeTokenAsync: js.Any = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sub: js.UndefOr[String] = js.native
  
  var tokenExpires: js.UndefOr[Double] = js.native
  
  def tokenType: js.UndefOr[String] = js.native
}
