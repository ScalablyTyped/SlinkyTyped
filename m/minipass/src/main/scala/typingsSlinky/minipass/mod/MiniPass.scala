package typingsSlinky.minipass.mod

import typingsSlinky.minipass.anon.End
import typingsSlinky.minipass.minipassStrings.close
import typingsSlinky.minipass.minipassStrings.data
import typingsSlinky.minipass.minipassStrings.drain
import typingsSlinky.minipass.minipassStrings.end
import typingsSlinky.minipass.minipassStrings.finish
import typingsSlinky.minipass.minipassStrings.prefinish
import typingsSlinky.minipass.minipassStrings.readable
import typingsSlinky.minipass.minipassStrings.resume
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniPass
  extends EventEmitter
     with WritableStream {
  
  def addEventHandler(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  var buffer: js.Any = js.native
  
  val bufferLength: Double = js.native
  
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_prefinish(event: prefinish): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  
  val emittedEnd: Boolean = js.native
  
  var encoding: String | Null = js.native
  
  def end(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: String): Unit = js.native
  def end(chunk: js.Any, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: Null, cb: js.Function0[Unit]): Unit = js.native
  
  val flowing: Boolean = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def pause(): Unit = js.native
  
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  var pipes: js.Any = js.native
  
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def read(): js.Any = js.native
  def read(size: Double): js.Any = js.native
  
  var readable: Boolean = js.native
  
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_prefinish(event: prefinish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  def resume(): Unit = js.native
  
  def setEncoding(): Unit = js.native
  def setEncoding(encoding: String): Unit = js.native
  
  def write(chunk: js.Any): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function0[Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: String): Boolean = js.native
  def write(chunk: js.Any, encoding: String, cb: js.Function0[Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: Null, cb: js.Function0[Unit]): Boolean = js.native
}
