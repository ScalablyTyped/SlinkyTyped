package typingsSlinky.next.libUtilsMod

import typingsSlinky.next.anon.MaxAge
import typingsSlinky.next.nextStrings.close
import typingsSlinky.next.nextStrings.drain
import typingsSlinky.next.nextStrings.error
import typingsSlinky.next.nextStrings.finish
import typingsSlinky.next.nextStrings.pipe
import typingsSlinky.next.nextStrings.unpipe
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.Chunk
import typingsSlinky.node.anon.End
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingHttpHeader
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.http.ServerResponse & {  send :next.next/dist/next-server/lib/utils.Send<T>,   json :next.next/dist/next-server/lib/utils.Send<T>, status (statusCode : number): next.next/dist/next-server/lib/utils.NextApiResponse<T>, redirect (url : string): next.next/dist/next-server/lib/utils.NextApiResponse<T>, redirect (status : number, url : string): next.next/dist/next-server/lib/utils.NextApiResponse<T>, setPreviewData (data : object | string, options : {  maxAge :number | undefined} | undefined): next.next/dist/next-server/lib/utils.NextApiResponse<T>, clearPreviewData (): next.next/dist/next-server/lib/utils.NextApiResponse<T>} */
@js.native
trait NextApiResponse[T] extends js.Object {
  
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  
  def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  
  def _write(
    chunk: js.Any,
    encoding: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. drain
    * 3. error
    * 4. finish
    * 5. pipe
    * 6. unpipe
    */
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def addTrailers(headers: js.Array[js.Tuple2[String, String]]): Unit = js.native
  def addTrailers(headers: OutgoingHttpHeaders): Unit = js.native
  
  def assignSocket(socket: Socket): Unit = js.native
  
  var chunkedEncoding: Boolean = js.native
  
  def clearPreviewData(): NextApiResponse[T] = js.native
  
  /**
    * @deprecate Use `socket` instead.
    */
  var connection: Socket | Null = js.native
  
  def cork(): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(error: js.Error): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def detachSocket(socket: Socket): Unit = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  def end(data: String): Unit = js.native
  def end(data: String, cb: js.Function0[Unit]): Unit = js.native
  def end(data: js.typedarray.Uint8Array): Unit = js.native
  def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: BufferEncoding): Unit = js.native
  def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  
  def eventNames(): js.Array[String | js.Symbol] = js.native
  
  /**
    * @deprecated Use `writableEnded` instead.
    */
  var finished: Boolean = js.native
  
  def flushHeaders(): Unit = js.native
  
  def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]] = js.native
  
  def getHeaderNames(): js.Array[String] = js.native
  
  def getHeaders(): OutgoingHttpHeaders = js.native
  
  def getMaxListeners(): Double = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  var headersSent: Boolean = js.native
  
  /**
    * Send data `json` data in response
    */
  var json: Send[T] = js.native
  
  def listenerCount(event: String): Double = js.native
  def listenerCount(event: js.Symbol): Double = js.native
  
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  def redirect(status: Double, url: String): NextApiResponse[T] = js.native
  def redirect(url: String): NextApiResponse[T] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  
  def removeHeader(name: String): Unit = js.native
  
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  /**
    * Send data `any` data in response
    */
  var send: Send[T] = js.native
  
  var sendDate: Boolean = js.native
  
  def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
  def setHeader(name: String, value: Double): Unit = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
  
  def setPreviewData(data: String): NextApiResponse[T] = js.native
  def setPreviewData(data: String, options: MaxAge): NextApiResponse[T] = js.native
  /**
    * Set preview data for Next.js' prerender mode
    */
  def setPreviewData(data: js.Object): NextApiResponse[T] = js.native
  def setPreviewData(data: js.Object, options: MaxAge): NextApiResponse[T] = js.native
  
  def setTimeout(msecs: Double): this.type = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
  
  var shouldKeepAlive: Boolean = js.native
  
  var socket: Socket | Null = js.native
  
  def status(statusCode: Double): NextApiResponse[T] = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
  
  def uncork(): Unit = js.native
  
  var upgrading: Boolean = js.native
  
  var useChunkedEncodingByDefault: Boolean = js.native
  
  val writable: Boolean = js.native
  
  val writableCorked: Double = js.native
  
  val writableEnded: Boolean = js.native
  
  val writableFinished: Boolean = js.native
  
  val writableHighWaterMark: Double = js.native
  
  val writableLength: Double = js.native
  
  val writableObjectMode: Boolean = js.native
  
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: js.Any): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: BufferEncoding,
    cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def write(
    str: String,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def write(str: String, encoding: BufferEncoding): Boolean = js.native
  def write(
    str: String,
    encoding: BufferEncoding,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  
  // https://github.com/nodejs/node/blob/master/test/parallel/test-http-write-callbacks.js#L53
  // no args in writeContinue callback
  def writeContinue(): Unit = js.native
  def writeContinue(callback: js.Function0[Unit]): Unit = js.native
  
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: OutgoingHttpHeaders): this.type = js.native
  
  def writeProcessing(): Unit = js.native
}
