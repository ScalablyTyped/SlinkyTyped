package typingsSlinky.nextReactDevOverlay.busMod

import typingsSlinky.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnhandledError extends BusEvent {
  var frames: js.Array[StackFrame]
  var reason: js.Error
  var `type`: /* "unhandled-error" */ String
}

object UnhandledError {
  @scala.inline
  def apply(frames: js.Array[StackFrame], reason: js.Error, `type`: /* "unhandled-error" */ String): UnhandledError = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnhandledError]
  }
}

