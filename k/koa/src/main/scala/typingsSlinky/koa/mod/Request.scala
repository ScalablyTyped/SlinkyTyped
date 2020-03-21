package typingsSlinky.koa.mod

import typingsSlinky.accepts.mod.Accepts
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends BaseRequest {
  var accept: Accepts = js.native
  var app: Application[DefaultState, DefaultContext] = js.native
  var ctx: Context = js.native
  var originalUrl: String = js.native
  var req: IncomingMessage = js.native
  var res: ServerResponse = js.native
  var response: Response = js.native
}

