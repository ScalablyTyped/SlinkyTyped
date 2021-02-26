package typingsSlinky.ethersprojectProviders

import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.ws.mod.ClientOptions
import typingsSlinky.ws.mod.ServerOptions
import typingsSlinky.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wsMod {
  
  // WebSocket socket.
  @JSImport("@ethersproject/providers/lib/ws", "WebSocket")
  @js.native
  class WebSocket protected () extends ^ {
    def this(address: String) = this()
    def this(address: URL_) = this()
    def this(address: String, options: ClientRequestArgs) = this()
    def this(address: String, options: ClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: URL_, options: ClientRequestArgs) = this()
    def this(address: URL_, options: ClientOptions) = this()
    def this(address: URL_, protocols: String) = this()
    def this(address: URL_, protocols: js.Array[String]) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: String, protocols: String, options: ClientRequestArgs) = this()
    def this(address: String, protocols: String, options: ClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: String, options: ClientOptions) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
  }
  object WebSocket {
    
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CLOSED")
    @js.native
    def CLOSED: Double = js.native
    @scala.inline
    def CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CLOSING")
    @js.native
    def CLOSING: Double = js.native
    @scala.inline
    def CLOSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CONNECTING")
    @js.native
    def CONNECTING: Double = js.native
    @scala.inline
    def CONNECTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.OPEN")
    @js.native
    def OPEN: Double = js.native
    @scala.inline
    def OPEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    // WebSocket Server
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.Server")
    @js.native
    class Server ()
      extends typingsSlinky.ws.mod.Server {
      def this(options: ServerOptions) = this()
      def this(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
    
    // WebSocket stream
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.createWebSocketStream")
    @js.native
    def createWebSocketStream(websocket: typingsSlinky.ws.mod.WebSocket): Duplex = js.native
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.createWebSocketStream")
    @js.native
    def createWebSocketStream(websocket: typingsSlinky.ws.mod.WebSocket, options: DuplexOptions): Duplex = js.native
  }
}
