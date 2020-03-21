package typingsSlinky.koaWebpack.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
  def apply(options: Options): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
}

