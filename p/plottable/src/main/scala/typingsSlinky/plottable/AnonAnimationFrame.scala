package typingsSlinky.plottable

import typingsSlinky.plottable.plottableStrings.animationFrame
import typingsSlinky.plottable.plottableStrings.immediate
import typingsSlinky.plottable.plottableStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationFrame extends js.Object {
  var animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame
  var immediate: typingsSlinky.plottable.plottableStrings.immediate
  var timeout: typingsSlinky.plottable.plottableStrings.timeout
}

object AnonAnimationFrame {
  @scala.inline
  def apply(animationFrame: animationFrame, immediate: immediate, timeout: timeout): AnonAnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = animationFrame.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationFrame]
  }
}

