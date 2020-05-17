package typingsSlinky.koaViews.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaViews.anon.AutoRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-views", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, opts: AutoRender): Middleware[DefaultState, DefaultContext] = js.native
}

