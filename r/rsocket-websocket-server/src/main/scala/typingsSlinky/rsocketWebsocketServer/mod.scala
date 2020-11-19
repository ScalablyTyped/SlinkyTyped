package typingsSlinky.rsocketWebsocketServer

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketWebsocketServer.rsocketwebsocketserverMod.RSocketWebSocketServer
import typingsSlinky.ws.mod.Server
import typingsSlinky.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-websocket-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected () extends RSocketWebSocketServer {
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
