package typingsSlinky.koaDashWebsocket.koaDashWebsocketMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", "Server")
@js.native
class Server[StateT, CustomT] protected () extends js.Object {
  def this(app: typingsSlinky.koa.koaMod.^[StateT, CustomT]) = this()
  var app: App[StateT, CustomT] = js.native
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  var server: js.UndefOr[typingsSlinky.ws.wsMod.Server] = js.native
  def listen(options: ServerOptions): typingsSlinky.ws.wsMod.Server = js.native
  def onConnection(socket: typingsSlinky.ws.wsMod.^, request: IncomingMessage): Unit = js.native
  def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
}

