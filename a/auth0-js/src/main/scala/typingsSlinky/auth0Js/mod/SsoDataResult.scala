package typingsSlinky.auth0Js.mod

import typingsSlinky.auth0Js.anon.Name
import typingsSlinky.auth0Js.auth0JsBooleans.`false`
import typingsSlinky.auth0Js.auth0JsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0Js.mod.SsoSessionFoundResult
  - typingsSlinky.auth0Js.mod.SsoSessionNotFoundResult
*/
trait SsoDataResult extends StObject
object SsoDataResult {
  
  @scala.inline
  def SsoSessionFoundResult(
    lastUsedClientID: String,
    lastUsedConnection: Name,
    lastUsedUserID: String,
    lastUsedUsername: String,
    sessionClients: js.Array[String],
    sso: `true`
  ): typingsSlinky.auth0Js.mod.SsoSessionFoundResult = {
    val __obj = js.Dynamic.literal(lastUsedClientID = lastUsedClientID.asInstanceOf[js.Any], lastUsedConnection = lastUsedConnection.asInstanceOf[js.Any], lastUsedUserID = lastUsedUserID.asInstanceOf[js.Any], lastUsedUsername = lastUsedUsername.asInstanceOf[js.Any], sessionClients = sessionClients.asInstanceOf[js.Any], sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0Js.mod.SsoSessionFoundResult]
  }
  
  @scala.inline
  def SsoSessionNotFoundResult(sso: `false`): typingsSlinky.auth0Js.mod.SsoSessionNotFoundResult = {
    val __obj = js.Dynamic.literal(sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0Js.mod.SsoSessionNotFoundResult]
  }
}
