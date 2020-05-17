package typingsSlinky.combinedStream.mod

import typingsSlinky.combinedStream.combinedStreamStrings.close
import typingsSlinky.combinedStream.combinedStreamStrings.data
import typingsSlinky.combinedStream.combinedStreamStrings.end
import typingsSlinky.combinedStream.combinedStreamStrings.error
import typingsSlinky.combinedStream.combinedStreamStrings.pause
import typingsSlinky.combinedStream.combinedStreamStrings.resume
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedStream
  extends Stream
     with Options {
  var _currentStream: Stream | Buffer | String | Null = js.native
  // private properties
  var _released: Boolean = js.native
  // @TODO it should be a type of Array<'delayed-stream' instance | Buffer | string>
  var _streams: js.Array[Stream | Buffer | String] = js.native
  val dataSize: Double = js.native
  @JSName("maxDataSize")
  var maxDataSize_CombinedStream: Double = js.native
  @JSName("pauseStreams")
  var pauseStreams_CombinedStream: Boolean = js.native
  val readable: Boolean = js.native
  val writable: Boolean = js.native
  def _checkDataSize(): Unit = js.native
  def _emitError(error: js.Error): Unit = js.native
  def _getNext(): Unit = js.native
  def _handleErrors(stream: EventEmitter): Unit = js.native
  def _pipeNext(): Unit = js.native
  def _reset(): Unit = js.native
  def _updateDataSize(): Unit = js.native
  def append(stream: Appendable): this.type = js.native
  def destroy(): Unit = js.native
  def end(): Unit = js.native
  // events
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, cb: js.Function0[Unit]): this.type = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def write(data: js.Any): Unit = js.native
}

