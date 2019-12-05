package typingsSlinky.namedDashRoutes.namedDashRoutesMod

import typingsSlinky.express.expressMod.Express
import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.express.expressMod.Response
import typingsSlinky.express.expressMod.Router
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedRouter extends js.Object {
  def add(method: String, path: String, callbacks: js.Array[RequestHandler[ParamsDictionary]]): Unit = js.native
  def add(
    method: String,
    path: String,
    callbacks: js.Array[RequestHandler[ParamsDictionary]],
    options: Partial[RouteOptions]
  ): Unit = js.native
  def add(method: String, path: String, callbacks: RequestHandler[ParamsDictionary]): Unit = js.native
  def add(
    method: String,
    path: String,
    callbacks: RequestHandler[ParamsDictionary],
    options: Partial[RouteOptions]
  ): Unit = js.native
  def build(name: String): String = js.native
  def build(name: String, params: RouteParams): String = js.native
  def build(name: String, params: RouteParams, method: String): String = js.native
  def dispatch(req: Request[ParamsDictionary]): Unit = js.native
  def dispatch(req: Request[ParamsDictionary], res: Response): Unit = js.native
  def dispatch(req: Request[ParamsDictionary], res: Response, next: NextFunction): Unit = js.native
  def extendExpress(app: Express): NamedRouter = js.native
  def extendExpress(app: Router): NamedRouter = js.native
  def `match`(req: Request[ParamsDictionary]): Boolean | js.Object = js.native
  def param(callback: RequestHandler[ParamsDictionary]): NamedRouter = js.native
  def param(name: String, callback: RequestHandler[ParamsDictionary]): NamedRouter = js.native
  def registerAppHelpers(app: Express): NamedRouter = js.native
}

