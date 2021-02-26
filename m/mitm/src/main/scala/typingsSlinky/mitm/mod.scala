package typingsSlinky.mitm

import typingsSlinky.mitm.mitmStrings.connect
import typingsSlinky.mitm.mitmStrings.connection
import typingsSlinky.mitm.mitmStrings.request
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mitm", JSImport.Namespace)
  @js.native
  def apply(): Mitm = js.native
  
  @js.native
  trait BypassableSocket extends Socket {
    
    def bypass(): Unit = js.native
  }
  
  type Callback = SocketConnectCallback | SocketConnectionCallback | HttpCallback
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mitm.mitmStrings.connect
    - typingsSlinky.mitm.mitmStrings.connection
    - typingsSlinky.mitm.mitmStrings.request
  */
  trait Event extends StObject
  object Event {
    
    @scala.inline
    def connect: typingsSlinky.mitm.mitmStrings.connect = "connect".asInstanceOf[typingsSlinky.mitm.mitmStrings.connect]
    
    @scala.inline
    def connection: typingsSlinky.mitm.mitmStrings.connection = "connection".asInstanceOf[typingsSlinky.mitm.mitmStrings.connection]
    
    @scala.inline
    def request: typingsSlinky.mitm.mitmStrings.request = "request".asInstanceOf[typingsSlinky.mitm.mitmStrings.request]
  }
  
  type HttpCallback = js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]
  
  @js.native
  trait Mitm extends StObject {
    
    def disable(): Unit = js.native
    
    def on(event: Event, callback: Callback): Unit = js.native
    @JSName("on")
    def on_connect(event: connect, callback: SocketConnectCallback): Unit = js.native
    @JSName("on")
    def on_connection(event: connection, callback: SocketConnectionCallback): Unit = js.native
    @JSName("on")
    def on_request(event: request, callback: HttpCallback): Unit = js.native
  }
  
  type SocketConnectCallback = js.Function2[/* socket */ BypassableSocket, /* opts */ SocketOptions, Unit]
  
  type SocketConnectionCallback = js.Function2[/* socket */ Socket, /* opts */ SocketOptions, Unit]
  
  @js.native
  trait SocketOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var localPort: js.UndefOr[String] = js.native
    
    var port: Double = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(port: Double): SocketOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
