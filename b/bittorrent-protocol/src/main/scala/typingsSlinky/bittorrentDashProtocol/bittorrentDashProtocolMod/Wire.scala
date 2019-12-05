package typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.`keep-alive`
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.bitfield
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.cancel
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.choke
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.download
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.extended
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.handshake
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.have
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.interested
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.piece
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.port
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.request
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.tcpIncoming
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.tcpOutgoing
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.timeout
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.unchoke
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.uninterested
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.unknownmessage
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.upload
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.webSeed
import typingsSlinky.bittorrentDashProtocol.bittorrentDashProtocolStrings.webrtc
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wire extends Duplex {
   // connection type
  val amChoking: Boolean = js.native
   // are we choking the peer?
  val amInterested: Boolean = js.native
  val extendedMapping: NumberDictionary[String] = js.native
   // are we interested in the peer?
  val peerChoking: Boolean = js.native
  val peerExtendedMapping: StringDictionary[Double] = js.native
  val peerId: String = js.native
   // remote peer id (hex string)
  val peerIdBuffer: Buffer = js.native
   // is the peer choking us?
  val peerInterested: Boolean = js.native
  val peerRequests: js.Array[Request] = js.native
   // is the peer interested in us?
  val requests: js.Array[Request] = js.native
   // remote peer id (Buffer)
  val `type`: webrtc | tcpIncoming | tcpOutgoing | webSeed = js.native
  def bitfield(bitfield: js.Any): Unit = js.native
  // TODO: bitfield can be also a bitfield instance
  def bitfield(bitfield: Buffer): Unit = js.native
  def cancel(index: Double, offset: Double, length: Double): Unit = js.native
  def choke(): Unit = js.native
  def extend(ext: String, obj: js.Any): Unit = js.native
  def extend(ext: Double, obj: js.Any): Unit = js.native
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
  def piece(index: Double, offset: Double, buffer: Buffer): Unit = js.native
  def port(port: Double): Unit = js.native
  def request[T /* <: js.Any */](index: Double, offset: Double, length: Double): T | Unit = js.native
  def request[T /* <: js.Any */](index: Double, offset: Double, length: Double, cb: js.Function1[/* err */ js.Error, T]): T | Unit = js.native
  def setKeepAlive(enable: Boolean): Unit = js.native
  def setTimeout(ms: Double): Unit = js.native
  def setTimeout(ms: Double, unref: Boolean): Unit = js.native
  def unchoke(): Unit = js.native
  def uninterested(): Unit = js.native
  def use(ext: ExtensionConstructor): Unit = js.native
}

