package typingsSlinky.passportOauth2.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-oauth2", "InternalOAuthError")
@js.native
class InternalOAuthError protected () extends Error {
  def this(message: String, err: js.Any) = this()
  
  var oauthError: js.Any = js.native
}
