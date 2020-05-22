package typingsSlinky.nextReactDevOverlay.anon

import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typingsSlinky.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typingsSlinky.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expanded extends OriginalStackFrame {
  var error: `true`
  var expanded: `false`
  var external: `false`
  var originalCodeFrame: Null
  var originalStackFrame: Null
  var reason: String
  var sourceStackFrame: StackFrame
}

object Expanded {
  @scala.inline
  def apply(
    error: `true`,
    expanded: `false`,
    external: `false`,
    originalCodeFrame: Null,
    originalStackFrame: Null,
    reason: String,
    sourceStackFrame: StackFrame
  ): Expanded = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
}

