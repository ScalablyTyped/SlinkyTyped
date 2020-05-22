package typingsSlinky.node.http2Mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings._empty
import typingsSlinky.node.nodeStrings.close
import typingsSlinky.node.nodeStrings.drain
import typingsSlinky.node.nodeStrings.error
import typingsSlinky.node.nodeStrings.finish
import typingsSlinky.node.nodeStrings.pipe
import typingsSlinky.node.nodeStrings.unpipe
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2ServerResponse")
@js.native
class Http2ServerResponse protected () extends Stream {
  def this(stream: ServerHttp2Stream) = this()
  val connection: Socket | TLSSocket = js.native
  val finished: Boolean = js.native
  val headersSent: Boolean = js.native
  var sendDate: Boolean = js.native
  val socket: Socket | TLSSocket = js.native
  var statusCode: Double = js.native
  var statusMessage: _empty = js.native
  val stream: ServerHttp2Stream = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def addTrailers(trailers: OutgoingHttpHeaders): Unit = js.native
  def createPushResponse(
    headers: OutgoingHttpHeaders,
    callback: js.Function2[/* err */ js.Error | Null, /* res */ this.type, Unit]
  ): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  def end(): Unit = js.native
  def end(callback: js.Function0[Unit]): Unit = js.native
  def end(data: String): Unit = js.native
  def end(data: String, callback: js.Function0[Unit]): Unit = js.native
  def end(data: String, encoding: BufferEncoding): Unit = js.native
  def end(data: String, encoding: BufferEncoding, callback: js.Function0[Unit]): Unit = js.native
  def end(data: js.typedarray.Uint8Array): Unit = js.native
  def end(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding, callback: js.Function0[Unit]): Unit = js.native
  def getHeader(name: String): String = js.native
  def getHeaderNames(): js.Array[String] = js.native
  def getHeaders(): OutgoingHttpHeaders = js.native
  def hasHeader(name: String): Boolean = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def removeHeader(name: String): Unit = js.native
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
  def setHeader(name: String, value: Double): Unit = js.native
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: String): Boolean = js.native
  def write(chunk: String, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: String, encoding: BufferEncoding): Boolean = js.native
  def write(chunk: String, encoding: BufferEncoding, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(
    chunk: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Boolean = js.native
  def writeContinue(): Unit = js.native
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String, headers: OutgoingHttpHeaders): this.type = js.native
}

