package typingsSlinky.rsocketDashWebsocketDashServer

import typingsSlinky.rsocketDashCore.rSocketEncodingMod.Encoders
import typingsSlinky.rsocketDashCore.rSocketServerMod.TransportServer
import typingsSlinky.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server/RSocketWebSocketServer", JSImport.Namespace)
@js.native
object rSocketWebSocketServerMod extends js.Object {
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

