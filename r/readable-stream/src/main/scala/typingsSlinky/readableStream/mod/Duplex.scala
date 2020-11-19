package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.nodeStrings.data
import typingsSlinky.node.nodeStrings.end
import typingsSlinky.node.nodeStrings.pause
import typingsSlinky.node.nodeStrings.readable
import typingsSlinky.node.nodeStrings.resume
import typingsSlinky.readableStream.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typingsSlinky.node.eventsMod.EventEmitter because Already inherited
- typingsSlinky.node.childProcessMod.StdioNull because Already inherited
- typingsSlinky.node.streamMod.internal because Already inherited
- typingsSlinky.node.streamMod.Stream because Already inherited
- typingsSlinky.node.streamMod.Readable because Inheritance from two classes. Inlined _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_pause, addListener_readable, addListener_resume, emit_close, emit_data, emit_end, emit_error, emit_pause, emit_readable, emit_resume, on_close, on_data, on_end, on_error, on_pause, on_readable, on_resume, once_close, once_data, once_end, once_error, once_pause, once_readable, once_resume, pipe, pipe, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, readableEncoding, readableEnded, readableFlowing, readableHighWaterMark, readableLength, readableObjectMode, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
- typingsSlinky.node.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write, write
- typingsSlinky.readableStream.mod._Readable because Inheritance from two classes. Inlined _readableState, destroy, destroy, destroy, destroy, _undestroy */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
class Duplex ()
  extends Writable
     with ReadableStream {
  def this(options: DuplexOptions) = this()
  
  def _read(): Unit = js.native
  def _read(size: Double): Unit = js.native
  
  var _readableState: ReadableState = js.native
  
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  var allowHalfOpen: Boolean = js.native
  
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_pause(event: pause): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  
  def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def pipe[S /* <: WritableStream */](dest: S, pipeOpts: End): S = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: typingsSlinky.node.anon.End): T = js.native
  /* InferMemberOverrides */
  @JSName("pipe")
  def pipe_T_WritableStream_T[T /* <: WritableStream */](destination: T): T = js.native
  
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  
  val readableEncoding: BufferEncoding | Null = js.native
  
  val readableEnded: Boolean = js.native
  
  val readableFlowing: Boolean | Null = js.native
  
  val readableHighWaterMark: Double = js.native
  
  val readableLength: Double = js.native
  
  val readableObjectMode: Boolean = js.native
  
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  @JSName("unshift")
  def unshift_Boolean(chunk: js.Any): Boolean = js.native
  
  def write(
    chunk: js.Any,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
}
/* static members */
@JSImport("readable-stream", "Duplex")
@js.native
object Duplex extends js.Object {
  
  /**
    * This is a dummy function required to retain type compatibility to node.
    * @deprecated DO NOT USE
    */
  def from(source: js.Any): js.Any = js.native
}
