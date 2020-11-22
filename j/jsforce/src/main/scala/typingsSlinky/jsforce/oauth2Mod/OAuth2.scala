package typingsSlinky.jsforce.oauth2Mod

import typingsSlinky.jsforce.anon.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/oauth2", "OAuth2")
@js.native
class OAuth2 () extends js.Object {
  def this(options: OAuth2Options) = this()
  
  def authenticate(username: String, password: String): js.Promise[TokenResponse] = js.native
  def authenticate(
    username: String,
    password: String,
    callback: js.Function2[/* err */ js.Error, /* tokenResponse */ TokenResponse, Unit]
  ): js.Promise[TokenResponse] = js.native
  
  var authzServiceUrl: String = js.native
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
  
  def getAuthorizationUrl(params: Scope): String = js.native
  
  var loginUrl: String = js.native
  
  var redirectUri: String = js.native
  
  def refreshToken(code: String): js.Promise[TokenResponse] = js.native
  def refreshToken(code: String, callback: js.Function2[/* err */ js.Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
  
  def requestToken(code: String): js.Promise[TokenResponse] = js.native
  def requestToken(code: String, callback: js.Function2[/* err */ js.Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
  
  var revokeServiceUrl: String = js.native
  
  def revokeToken(accessToken: String): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def revokeToken(accessToken: String, callback: js.Function1[/* err */ js.Error, Unit]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  var tokenServiceUrl: String = js.native
}
