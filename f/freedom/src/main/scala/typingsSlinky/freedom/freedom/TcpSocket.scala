package typingsSlinky.freedom.freedom

import typingsSlinky.freedom.freedomStrings.onConnection
import typingsSlinky.freedom.freedomStrings.onData
import typingsSlinky.freedom.freedomStrings.onDisconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TcpSocket {
  
  @js.native
  trait ConnectInfo extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var socket: Double = js.native
  }
  object ConnectInfo {
    
    @scala.inline
    def apply(host: String, port: Double, socket: Double): ConnectInfo = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectInfo]
    }
    
    @scala.inline
    implicit class ConnectInfoMutableBuilder[Self <: ConnectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisconnectInfo extends StObject {
    
    var errcode: String = js.native
    
    var message: String = js.native
  }
  object DisconnectInfo {
    
    @scala.inline
    def apply(errcode: String, message: String): DisconnectInfo = {
      val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectInfo]
    }
    
    @scala.inline
    implicit class DisconnectInfoMutableBuilder[Self <: DisconnectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrcode(value: String): Self = StObject.set(x, "errcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadInfo extends StObject {
    
    var data: js.typedarray.ArrayBuffer = js.native
  }
  object ReadInfo {
    
    @scala.inline
    def apply(data: js.typedarray.ArrayBuffer): ReadInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadInfo]
    }
    
    @scala.inline
    implicit class ReadInfoMutableBuilder[Self <: ReadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  // The TcpSocket class (freedom['core.TcpSocket'])
  @js.native
  trait Socket extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(hostname: String, port: Double): js.Promise[Unit] = js.native
    
    def getInfo(): js.Promise[SocketInfo] = js.native
    
    def listen(address: String, port: Double): js.Promise[Unit] = js.native
    
    def off(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
    @JSName("off")
    def off_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
    
    def on(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
    // TcpSockets have 3 types of events:
    @JSName("on")
    def on_onConnection(`type`: onConnection, f: js.Function1[/* i */ ConnectInfo, Unit]): Unit = js.native
    @JSName("on")
    def on_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
    @JSName("on")
    def on_onDisconnect(`type`: onDisconnect, f: js.Function1[/* i */ DisconnectInfo, Unit]): Unit = js.native
    
    def pause(): js.Promise[Unit] = js.native
    @JSName("pause")
    var pause_Original: Method0[Unit] = js.native
    
    def resume(): js.Promise[Unit] = js.native
    @JSName("resume")
    var resume_Original: Method0[Unit] = js.native
    
    def secure(): js.Promise[Unit] = js.native
    
    def write(a: js.typedarray.ArrayBuffer): js.Promise[WriteInfo] = js.native
    @JSName("write")
    var write_Original: Method1[js.typedarray.ArrayBuffer, WriteInfo] = js.native
  }
  
  @js.native
  trait SocketInfo extends StObject {
    
    var connected: Boolean = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var localPort: js.UndefOr[Double] = js.native
    
    var peerAddress: js.UndefOr[String] = js.native
    
    var peerPort: js.UndefOr[Double] = js.native
  }
  object SocketInfo {
    
    @scala.inline
    def apply(connected: Boolean): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    @scala.inline
    implicit class SocketInfoMutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      @scala.inline
      def setPeerPort(value: Double): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
    }
  }
  
  @js.native
  trait WriteInfo extends StObject {
    
    var bytesWritten: Double = js.native
  }
  object WriteInfo {
    
    @scala.inline
    def apply(bytesWritten: Double): WriteInfo = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteInfo]
    }
    
    @scala.inline
    implicit class WriteInfoMutableBuilder[Self <: WriteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}
