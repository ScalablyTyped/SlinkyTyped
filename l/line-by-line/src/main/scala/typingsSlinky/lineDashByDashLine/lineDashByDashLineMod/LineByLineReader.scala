package typingsSlinky.lineDashByDashLine.lineDashByDashLineMod

import typingsSlinky.lineDashByDashLine.lineDashByDashLineStrings.end
import typingsSlinky.lineDashByDashLine.lineDashByDashLineStrings.error
import typingsSlinky.lineDashByDashLine.lineDashByDashLineStrings.line
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLineReader extends EventEmitter {
  /**
    * Stops emitting "line" events, closes the file or stream, and emits the "end" event.
    */
  def close(): Unit = js.native
  /**
    * Emitted if all lines are read.
    * @param event
    * @param listener
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted if an error occured.
    * @param event
    * @param listener A listener that receives the error object.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted on every line read.
    * @param event
    * @param listener A listener that receives the line without the line terminator.
    */
  @JSName("on")
  def on_line(event: line, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
  /**
    * Call this method to stop emitting "line" events.
    */
  def pause(): Unit = js.native
  /**
    * After calling this method, "line" events get emitted again.
    */
  def resume(): Unit = js.native
}

