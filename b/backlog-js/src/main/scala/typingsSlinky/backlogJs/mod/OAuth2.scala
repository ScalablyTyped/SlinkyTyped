package typingsSlinky.backlogJs.mod

import typingsSlinky.backlogJs.anon.Code
import typingsSlinky.backlogJs.anon.Host
import typingsSlinky.backlogJs.anon.RefreshToken
import typingsSlinky.backlogJs.mod.Entity.OAuth2.AccessToken
import typingsSlinky.backlogJs.mod.Option.OAuth2.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backlog-js", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
  def this(credentials: Credentials) = this()
  def this(credentials: Credentials, timeout: Double) = this()
  
  var credentials: js.Any = js.native
  
  def getAccessToken(options: Code): js.Promise[AccessToken] = js.native
  
  def getAuthorizationURL(options: Host): String = js.native
  
  def refreshAccessToken(options: RefreshToken): js.Promise[AccessToken] = js.native
  
  var timeout: js.Any = js.native
}
