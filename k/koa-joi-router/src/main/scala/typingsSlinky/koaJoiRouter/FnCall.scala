package typingsSlinky.koaJoiRouter

import typingsSlinky.koaRouter.mod.IMiddleware
import typingsSlinky.koaRouter.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: String, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: js.RegExp, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
}

