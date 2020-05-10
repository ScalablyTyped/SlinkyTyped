package typingsSlinky.bullArena.mod

import typingsSlinky.bullArena.mod.BullArena.MiddlewareListenOptions
import typingsSlinky.bullArena.mod.BullArena.MiddlewareOptions
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bull-arena", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

