package typingsSlinky.rsocketDashWebsocketDashServer

import typingsSlinky.rsocketDashCore.rSocketEncodingMod.Encoders
import typingsSlinky.rsocketDashWebsocketDashServer.rSocketWebSocketServerMod.RSocketWebSocketServer
import typingsSlinky.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server", JSImport.Namespace)
@js.native
object rsocketDashWebsocketDashServerMod extends js.Object {
  @js.native
  class default protected () extends RSocketWebSocketServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
  
}

