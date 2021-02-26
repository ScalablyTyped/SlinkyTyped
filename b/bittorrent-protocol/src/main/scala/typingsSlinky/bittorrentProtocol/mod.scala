package typingsSlinky.bittorrentProtocol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.`keep-alive`
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.bitfield
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.cancel
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.choke
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.download
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.extended
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.handshake
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.have
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.interested
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.piece
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.port
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.request
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.tcpIncoming
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.tcpOutgoing
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.timeout
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.unchoke
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.uninterested
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.unknownmessage
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.upload
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.webSeed
import typingsSlinky.bittorrentProtocol.bittorrentProtocolStrings.webrtc
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bittorrent-protocol", JSImport.Namespace)
  @js.native
  class ^ () extends Wire
  @JSImport("bittorrent-protocol", JSImport.Namespace)
  @js.native
  val ^ : BittorrentProtocol = js.native
  
  @js.native
  trait BittorrentProtocol extends Instantiable0[Wire] {
    
    def apply(): Wire = js.native
  }
  
  @js.native
  trait Extension extends StObject {
    
    var name: String = js.native
    
    var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[js.Any], Unit]] = js.native
    
    var onHandshake: js.UndefOr[
        js.Function3[
          /* infoHash */ String, 
          /* peerId */ String, 
          /* extensions */ StringDictionary[Boolean], 
          Unit
        ]
      ] = js.native
    
    var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(name: String): Extension = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExtendedHandshake(value: /* handshake */ StringDictionary[js.Any] => Unit): Self = StObject.set(x, "onExtendedHandshake", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExtendedHandshakeUndefined: Self = StObject.set(x, "onExtendedHandshake", js.undefined)
      
      @scala.inline
      def setOnHandshake(
        value: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Unit
      ): Self = StObject.set(x, "onHandshake", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnHandshakeUndefined: Self = StObject.set(x, "onHandshake", js.undefined)
      
      @scala.inline
      def setOnMessage(value: /* buf */ Buffer => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    }
  }
  
  @js.native
  trait ExtensionConstructor extends Instantiable1[/* wire */ Wire, Extension]
  
  @js.native
  trait Request extends StObject {
    
    def callback(): Unit = js.native
    
    var length: Double = js.native
    
    var offset: Double = js.native
    
    var piece: Double = js.native
  }
  object Request {
    
    @scala.inline
    def apply(callback: () => Unit, length: Double, offset: Double, piece: Double): Request = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiece(value: Double): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wire
    extends Duplex
       with /* key */ StringDictionary[js.Any] {
    
    // connection type
    val amChoking: Boolean = js.native
    
    // are we choking the peer?
    val amInterested: Boolean = js.native
    
    def bitfield(bitfield: js.Any): Unit = js.native
    // TODO: bitfield can be also a bitfield instance
    def bitfield(bitfield: Buffer): Unit = js.native
    
    def cancel(index: Double, offset: Double, length: Double): Unit = js.native
    
    def choke(): Unit = js.native
    
    def extended(ext: String, obj: js.Any): Unit = js.native
    def extended(ext: Double, obj: js.Any): Unit = js.native
    
    val extendedMapping: NumberDictionary[String] = js.native
    
    def handshake(infoHash: String, peerId: String): Unit = js.native
    def handshake(infoHash: String, peerId: String, extensions: js.Any): Unit = js.native
    def handshake(infoHash: String, peerId: Buffer): Unit = js.native
    def handshake(infoHash: String, peerId: Buffer, extensions: js.Any): Unit = js.native
    def handshake(infoHash: Buffer, peerId: String): Unit = js.native
    def handshake(infoHash: Buffer, peerId: String, extensions: js.Any): Unit = js.native
    def handshake(infoHash: Buffer, peerId: Buffer): Unit = js.native
    def handshake(infoHash: Buffer, peerId: Buffer, extensions: js.Any): Unit = js.native
    
    def have(index: Double): Unit = js.native
    
    def interested(): Unit = js.native
    
    def on(event: extended, listener: js.Function2[/* ext */ handshake | String, /* buf */ js.Any, Unit]): Unit = js.native
    // TODO: bitfield is a bitfield instance
    @JSName("on")
    def on_bitfield(event: bitfield, listener: js.Function1[/* bitfield */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_cancel(
      event: cancel,
      listener: js.Function3[/* index */ Double, /* offset */ Double, /* length */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_choke(event: choke, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_download(event: download, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_handshake(
      event: handshake,
      listener: js.Function3[/* infoHash */ String, /* peerId */ String, /* extensions */ js.Array[Extension], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_have(event: have, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_interested(event: interested, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_keepalive(event: `keep-alive`, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_piece(
      event: piece,
      listener: js.Function3[/* index */ Double, /* offset */ Double, /* buffer */ Buffer, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_port(event: port, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_request(
      event: request,
      listener: js.Function4[
          /* index */ Double, 
          /* offset */ Double, 
          /* length */ Double, 
          /* respond */ js.Function0[Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unchoke(event: unchoke, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_uninterested(event: uninterested, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unknownmessage(event: unknownmessage, listener: js.Function1[/* buffer */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_upload(event: upload, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    
    // are we interested in the peer?
    val peerChoking: Boolean = js.native
    
    val peerExtendedMapping: StringDictionary[Double] = js.native
    
    val peerId: String = js.native
    
    // remote peer id (hex string)
    val peerIdBuffer: Buffer = js.native
    
    // is the peer choking us?
    val peerInterested: Boolean = js.native
    
    val peerRequests: js.Array[Request] = js.native
    
    def piece(index: Double, offset: Double, buffer: Buffer): Unit = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def port(port: Double): Unit = js.native
    
    def request[T /* <: js.Any */](index: Double, offset: Double, length: Double): T | Unit = js.native
    def request[T /* <: js.Any */](index: Double, offset: Double, length: Double, cb: js.Function1[/* err */ js.Error, T]): T | Unit = js.native
    
    // is the peer interested in us?
    val requests: js.Array[Request] = js.native
    
    def setKeepAlive(enable: Boolean): Unit = js.native
    
    def setTimeout(ms: Double): Unit = js.native
    def setTimeout(ms: Double, unref: Boolean): Unit = js.native
    
    // remote peer id (Buffer)
    val `type`: webrtc | tcpIncoming | tcpOutgoing | webSeed = js.native
    
    def unchoke(): Unit = js.native
    
    def uninterested(): Unit = js.native
    
    def use(ext: ExtensionConstructor): Unit = js.native
  }
  
  type _To = BittorrentProtocol
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BittorrentProtocol = ^
}
