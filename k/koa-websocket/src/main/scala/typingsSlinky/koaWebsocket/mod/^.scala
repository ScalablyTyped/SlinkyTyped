package typingsSlinky.koaWebsocket.mod

import typingsSlinky.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[StateT, CustomT](app: typingsSlinky.koa.mod.^[StateT, CustomT]): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typingsSlinky.koa.mod.^[StateT, CustomT],
    wsOptions: js.UndefOr[scala.Nothing],
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: typingsSlinky.koa.mod.^[StateT, CustomT], wsOptions: typingsSlinky.ws.mod.ServerOptions): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typingsSlinky.koa.mod.^[StateT, CustomT],
    wsOptions: typingsSlinky.ws.mod.ServerOptions,
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = js.native
}

