package typingsSlinky.rsocketWebsocketServer

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketWebsocketServer.rsocketwebsocketserverMod.RSocketWebSocketServer
import typingsSlinky.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends RSocketWebSocketServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
  
}

