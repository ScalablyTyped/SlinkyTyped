package typingsSlinky.epilogue.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeOptions extends js.Object {
  @JSName("app")
  var app_Original: Express = js.native
  var base: js.UndefOr[String] = js.native
  var sequelize: Sequelize = js.native
  var updateMethod: js.UndefOr[String] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

