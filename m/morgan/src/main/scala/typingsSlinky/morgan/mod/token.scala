package typingsSlinky.morgan.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("morgan", "token")
@js.native
object token extends js.Object {
  
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, callback: TokenCallbackFn[Request, Response]): Morgan[Request, Response] = js.native
}
