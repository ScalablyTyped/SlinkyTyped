package typingsSlinky.koaConvert

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koa.mod.Next
import typingsSlinky.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[_, _, _]]): Middleware[DefaultState, DefaultContext] = js.native
}

