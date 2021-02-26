package typingsSlinky.bent

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.bent.bentStrings.buffer
import typingsSlinky.bent.bentStrings.close
import typingsSlinky.bent.bentStrings.data
import typingsSlinky.bent.bentStrings.drain
import typingsSlinky.bent.bentStrings.end
import typingsSlinky.bent.bentStrings.error
import typingsSlinky.bent.bentStrings.finish
import typingsSlinky.bent.bentStrings.json
import typingsSlinky.bent.bentStrings.pause
import typingsSlinky.bent.bentStrings.pipe
import typingsSlinky.bent.bentStrings.readable
import typingsSlinky.bent.bentStrings.resume
import typingsSlinky.bent.bentStrings.string
import typingsSlinky.bent.bentStrings.unpipe
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.Chunk
import typingsSlinky.node.anon.End
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.TransformCallback
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = js.native
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  // Method or url first
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = js.native
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  // Type first
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply(`type`: string, args: Options*): RequestFunction[String] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply[T /* <: ValidResponse */](args: Options*): RequestFunction[T] = js.native
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply[T /* <: Json */](baseUrl: String, `type`: json, args: Options*): // tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  @JSImport("bent", JSImport.Namespace)
  @js.native
  def apply[T /* <: Json */](`type`: json, args: Options*): RequestFunction[T] = js.native
  
  @JSImport("bent", "StatusError")
  @js.native
  class StatusError () extends Error {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var headers: StringDictionary[js.Any] = js.native
    
    def json(): js.Promise[Json] = js.native
    
    var responseBody: js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var statusCode: Double = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  type BaseUrl = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bent.mod.NodeResponse
    - typingsSlinky.bent.mod.FetchResponse
  */
  trait BentResponse extends StObject
  
  /* Inlined std.Response & {  statusCode :number} */
  @js.native
  trait FetchResponse extends BentResponse {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
    
    val bodyUsed: Boolean = js.native
    
    def formData(): js.Promise[FormData] = js.native
    
    val headers: org.scalajs.dom.experimental.Headers = js.native
    
    def json(): js.Promise[_] = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    var statusCode: Double = js.native
    
    val statusText: String = js.native
    
    def text(): js.Promise[String] = js.native
    
    val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
    
    val `type`: ResponseType = js.native
    
    val url: String = js.native
  }
  object FetchResponse {
    
    @scala.inline
    def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: org.scalajs.dom.experimental.Headers,
      json: () => js.Promise[_],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusCode: Double,
      statusText: String,
      text: () => js.Promise[String],
      trailer: js.Promise[org.scalajs.dom.experimental.Headers],
      `type`: ResponseType,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @scala.inline
    implicit class FetchResponseMutableBuilder[Self <: FetchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaders(value: org.scalajs.dom.experimental.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: () => js.Promise[_]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrailer(value: js.Promise[org.scalajs.dom.experimental.Headers]): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bent.bentStrings.GET
    - typingsSlinky.bent.bentStrings.POST
    - typingsSlinky.bent.bentStrings.DELETE
    - typingsSlinky.bent.bentStrings.PUT
    - typingsSlinky.bent.bentStrings.PATCH
    - typingsSlinky.bent.bentStrings.HEAD
    - typingsSlinky.bent.bentStrings.OPTIONS
    - typingsSlinky.bent.bentStrings.CONNECT
    - typingsSlinky.bent.bentStrings.TRACE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def CONNECT: typingsSlinky.bent.bentStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.bent.bentStrings.CONNECT]
    
    @scala.inline
    def DELETE: typingsSlinky.bent.bentStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.bent.bentStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.bent.bentStrings.GET = "GET".asInstanceOf[typingsSlinky.bent.bentStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.bent.bentStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.bent.bentStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typingsSlinky.bent.bentStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.bent.bentStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.bent.bentStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.bent.bentStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.bent.bentStrings.POST = "POST".asInstanceOf[typingsSlinky.bent.bentStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.bent.bentStrings.PUT = "PUT".asInstanceOf[typingsSlinky.bent.bentStrings.PUT]
    
    @scala.inline
    def TRACE: typingsSlinky.bent.bentStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.bent.bentStrings.TRACE]
  }
  
  type Json = (StringDictionary[js.Any] with NumberDictionary[js.Any]) | js.Array[js.Any]
  
  /* Inlined node.stream.PassThrough & {  statusCode :number,   statusMessage :string,   headers :bent.bent.Headers, arrayBuffer (): std.Promise<node.Buffer>, text (): std.Promise<string>, json (): std.Promise<bent.bent.Json>} */
  @js.native
  trait NodeResponse extends BentResponse {
    
    def _destroy(error: js.Error, callback: js.Function1[js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _flush(callback: TransformCallback): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
    
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
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def arrayBuffer(): js.Promise[Buffer] = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
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
    
    def getMaxListeners(): Double = js.native
    
    var headers: Headers = js.native
    
    def isPaused(): Boolean = js.native
    
    def json(): js.Promise[Json] = js.native
    
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
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
    
    def text(): js.Promise[String] = js.native
    
    def uncork(): Unit = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: typingsSlinky.node.NodeJS.ReadableStream): this.type = js.native
    
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
    def write(
      chunk: js.Any,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
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
  }
  
  type Options = HttpMethod | StatusCode | Headers | BaseUrl
  
  type RequestBody = String | Stream | Buffer | js.typedarray.ArrayBuffer | Json
  
  type RequestFunction[T /* <: ValidResponse */] = js.Function3[
    /* url */ String, 
    /* body */ js.UndefOr[RequestBody], 
    /* headers */ js.UndefOr[Headers], 
    js.Promise[T]
  ]
  
  type StatusCode = Double
  
  type ValidResponse = BentResponse | String | Buffer | js.typedarray.ArrayBuffer | Json
}
