package typingsSlinky.koaWebsocket.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-websocket", "Server")
@js.native
class Server[StateT, CustomT] protected () extends js.Object {
  def this(app: typingsSlinky.koa.mod.^[StateT, CustomT]) = this()
  
  var app: App[DefaultState, DefaultContext] = js.native
  
  def listen(options: ServerOptions): typingsSlinky.ws.mod.Server = js.native
  
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  
  def onConnection(socket: typingsSlinky.ws.mod.^, request: IncomingMessage): Unit = js.native
  
  var server: js.UndefOr[typingsSlinky.ws.mod.Server] = js.native
  
  def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
}
