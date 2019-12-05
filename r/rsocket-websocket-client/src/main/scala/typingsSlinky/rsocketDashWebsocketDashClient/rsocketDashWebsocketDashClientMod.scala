package typingsSlinky.rsocketDashWebsocketDashClient

import typingsSlinky.rsocketDashCore.rSocketEncodingMod.Encoders
import typingsSlinky.rsocketDashWebsocketDashClient.rSocketWebSocketClientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-client", JSImport.Namespace)
@js.native
object rsocketDashWebsocketDashClientMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.rsocketDashWebsocketDashClient.rSocketWebSocketClientMod.default {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[_]) = this()
  }
  
}

