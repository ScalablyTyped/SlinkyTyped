package typingsSlinky.oauth2orize.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareRequest extends IncomingMessage {
  
  var oauth2: js.UndefOr[OAuth2] = js.native
  
  var user: js.UndefOr[js.Any] = js.native
}
