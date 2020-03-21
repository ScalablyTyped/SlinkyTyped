package typingsSlinky.rsocketWebsocketServer

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketCore.rsocketserverMod.TransportServer
import typingsSlinky.rsocketFlowable.mod.Flowable
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server/RSocketWebSocketServer", JSImport.Namespace)
@js.native
object rsocketwebsocketserverMod extends js.Object {
  @js.native
  class RSocketWebSocketServer protected () extends TransportServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
    /* CompleteClass */
    override def start(): Flowable[DuplexConnection] = js.native
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
}

