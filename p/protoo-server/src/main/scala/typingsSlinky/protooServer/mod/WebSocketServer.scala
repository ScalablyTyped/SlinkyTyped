package typingsSlinky.protooServer.mod

import typingsSlinky.node.httpMod.Server
import typingsSlinky.protooServer.protooServerStrings.connectionrequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protoo-server", "WebSocketServer")
@js.native
class WebSocketServer protected () extends js.Object {
  def this(server: Server) = this()
  def this(server: typingsSlinky.node.httpsMod.Server) = this()
  def this(server: Server, options: WebSocketServerOptions) = this()
  def this(server: typingsSlinky.node.httpsMod.Server, options: WebSocketServerOptions) = this()
  
  @JSName("on")
  def on_connectionrequest(eventType: connectionrequest, callback: ConnectionRequestCb): Unit = js.native
  
  def stop(): Unit = js.native
}
