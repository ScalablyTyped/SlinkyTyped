package typingsSlinky.node.http2Mod

import typingsSlinky.node.anon.Origin
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.stream
import typingsSlinky.node.tlsMod.TLSSocket
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerHttp2Session extends Http2Session {
  
  @JSName("addListener")
  def addListener_connect(
    event: typingsSlinky.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def altsvc(alt: String, originOrStream: String): Unit = js.native
  def altsvc(alt: String, originOrStream: Double): Unit = js.native
  def altsvc(alt: String, originOrStream: AlternativeServiceOptions): Unit = js.native
  def altsvc(alt: String, originOrStream: URL_): Unit = js.native
  
  @JSName("emit")
  def emit_connect(event: typingsSlinky.node.nodeStrings.connect, session: ServerHttp2Session, socket: Socket): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: typingsSlinky.node.nodeStrings.connect, session: ServerHttp2Session, socket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_stream(event: stream, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  
  @JSName("on")
  def on_connect(
    event: typingsSlinky.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_connect(
    event: typingsSlinky.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def origin(args: (String | URL_ | Origin)*): Unit = js.native
  
  @JSName("prependListener")
  def prependListener_connect(
    event: typingsSlinky.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typingsSlinky.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  val server: Http2Server | Http2SecureServer = js.native
}
