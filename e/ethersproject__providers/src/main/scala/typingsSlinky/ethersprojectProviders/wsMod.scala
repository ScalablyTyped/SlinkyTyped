package typingsSlinky.ethersprojectProviders

import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.ws.mod.ClientOptions
import typingsSlinky.ws.mod.ServerOptions
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/ws", JSImport.Namespace)
@js.native
object wsMod extends js.Object {
  
  // WebSocket socket.
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
  /* static members */
  @js.native
  object WebSocket extends js.Object {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
    
    // WebSocket stream
    def createWebSocketStream(websocket: typingsSlinky.ws.mod.WebSocket): Duplex = js.native
    def createWebSocketStream(websocket: typingsSlinky.ws.mod.WebSocket, options: DuplexOptions): Duplex = js.native
    
    // WebSocket Server
    @js.native
    class Server ()
      extends typingsSlinky.ws.mod.Server {
      def this(options: ServerOptions) = this()
      def this(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
  }
}
