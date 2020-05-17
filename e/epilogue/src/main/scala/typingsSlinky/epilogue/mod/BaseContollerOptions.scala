package typingsSlinky.epilogue.mod

import typingsSlinky.epilogue.anon.Model
import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContollerOptions extends js.Object {
  @JSName("app")
  var app_Original: Express = js.native
  var endpoint: String = js.native
  var include: js.Array[Model | String] = js.native
  var model: js.Any = js.native
  var resource: Resource_ = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, Query], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, Query], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

