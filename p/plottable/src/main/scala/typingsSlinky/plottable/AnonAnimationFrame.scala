package typingsSlinky.plottable

import typingsSlinky.plottable.plottableStrings.animationFrame
import typingsSlinky.plottable.plottableStrings.immediate
import typingsSlinky.plottable.plottableStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationFrame extends js.Object {
  var animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
  var immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
  var timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
}

object AnonAnimationFrame {
  @scala.inline
  def apply(animationFrame: animationFrame, immediate: immediate, timeout: timeout): AnonAnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = animationFrame.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationFrame]
  }
  @scala.inline
  implicit class AnonAnimationFrameOps[Self <: AnonAnimationFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationFrame(value: animationFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImmediate(value: immediate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: timeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

