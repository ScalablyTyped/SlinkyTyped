package typingsSlinky.node.http2Mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.data
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http2", "Http2ServerRequest")
@js.native
class Http2ServerRequest protected () extends Readable {
  def this(
    stream: ServerHttp2Stream,
    headers: IncomingHttpHeaders,
    options: ReadableOptions,
    rawHeaders: js.Array[String]
  ) = this()
  
  val aborted: Boolean = js.native
  
  @JSName("addListener")
  def addListener_aborted(
    event: typingsSlinky.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  
  val authority: String = js.native
  
  val complete: Boolean = js.native
  
  val connection: Socket | TLSSocket = js.native
  
  @JSName("emit")
  def emit_aborted(event: typingsSlinky.node.nodeStrings.aborted, hadError: Boolean, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: String): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: Buffer): Boolean = js.native
  
  val headers: IncomingHttpHeaders = js.native
  
  val httpVersion: String = js.native
  
  val httpVersionMajor: Double = js.native
  
  val httpVersionMinor: Double = js.native
  
  val method: String = js.native
  
  @JSName("on")
  def on_aborted(
    event: typingsSlinky.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_aborted(
    event: typingsSlinky.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_aborted(
    event: typingsSlinky.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(
    event: typingsSlinky.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  
  val rawHeaders: js.Array[String] = js.native
  
  val rawTrailers: js.Array[String] = js.native
  
  val scheme: String = js.native
  
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  val socket: Socket | TLSSocket = js.native
  
  val stream: ServerHttp2Stream = js.native
  
  val trailers: IncomingHttpHeaders = js.native
  
  val url: String = js.native
}
