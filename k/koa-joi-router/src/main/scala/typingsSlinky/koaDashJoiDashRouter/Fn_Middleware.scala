package typingsSlinky.koaDashJoiDashRouter

import typingsSlinky.koaDashRouter.koaDashRouterMod.IMiddleware
import typingsSlinky.koaDashRouter.koaDashRouterMod.Router
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Middleware extends js.Object {
  def apply(middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: String, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: RegExp, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
}

