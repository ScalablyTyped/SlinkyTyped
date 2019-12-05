package typingsSlinky.koaDashConvert

import typingsSlinky.koa.koaMod.Context
import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import typingsSlinky.koa.koaMod.Next
import typingsSlinky.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object koaDashConvertMod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[_, _, _]]): Middleware[DefaultState, DefaultContext] = js.native
}

