package typingsSlinky.rsocketWebsocketServer

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketCore.rsocketserverMod.TransportServer
import typingsSlinky.ws.mod.Server
import typingsSlinky.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketserverMod {
  
  @JSImport("rsocket-websocket-server/RSocketWebSocketServer", "RSocketWebSocketServer")
  @js.native
  class RSocketWebSocketServer protected () extends TransportServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
    def this(
      options: ServerOptions,
      encoders: js.UndefOr[scala.Nothing],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[_],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
  }
}
