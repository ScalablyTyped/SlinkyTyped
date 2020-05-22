package typingsSlinky.nextReactDevOverlay.busMod

import typingsSlinky.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnhandledRejection extends BusEvent {
  var frames: js.Array[StackFrame]
  var reason: js.Error
  var `type`: /* "unhandled-rejection" */ String
}

object UnhandledRejection {
  @scala.inline
  def apply(frames: js.Array[StackFrame], reason: js.Error, `type`: /* "unhandled-rejection" */ String): UnhandledRejection = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnhandledRejection]
  }
}

