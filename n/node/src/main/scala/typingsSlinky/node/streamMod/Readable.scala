package typingsSlinky.node.streamMod

import typingsSlinky.node.AnonEnd
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.nodeStrings.close
import typingsSlinky.node.nodeStrings.data
import typingsSlinky.node.nodeStrings.end
import typingsSlinky.node.nodeStrings.error
import typingsSlinky.node.nodeStrings.pause
import typingsSlinky.node.nodeStrings.readable
import typingsSlinky.node.nodeStrings.resume
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends Stream
     with ReadableStream {
  def this(opts: ReadableOptions) = this()
  var destroyed: Boolean = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def _read(size: Double): Unit = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. data
    * 3. end
    * 4. error
    * 5. pause
    * 6. readable
    * 7. resume
    */
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def destroy(): Unit = js.native
  def destroy(error: js.Error): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_pause(event: pause): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
}

/* static members */
@JSImport("stream", "Readable")
@js.native
object Readable extends js.Object {
  def from(iterable: AsyncIterable[_]): Readable = js.native
  def from(iterable: AsyncIterable[_], options: ReadableOptions): Readable = js.native
  /**
    * A utility method for creating Readable Streams out of iterators.
    */
  def from(iterable: js.Iterable[_]): Readable = js.native
  def from(iterable: js.Iterable[_], options: ReadableOptions): Readable = js.native
}

