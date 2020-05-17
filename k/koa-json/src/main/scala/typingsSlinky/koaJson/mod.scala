package typingsSlinky.koaJson

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaJson.anon.Param
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Param): Middleware[DefaultState, DefaultContext] = js.native
}

