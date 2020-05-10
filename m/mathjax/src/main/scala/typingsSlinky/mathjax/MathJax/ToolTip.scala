package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolTip extends js.Object {
  /*The delay (in milliseconds) before the tooltop is cleared after the mouse moves out of the maction element.*/
  var delayClear: Double = js.native
  /*The delay (in milliseconds) before the tooltip is posted after the mouse is moved over the maction element.*/
  var delayPost: Double = js.native
  /*The X offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetX: Double = js.native
  /*The Y offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetY: Double = js.native
}

object ToolTip {
  @scala.inline
  def apply(delayClear: Double, delayPost: Double, offsetX: Double, offsetY: Double): ToolTip = {
    val __obj = js.Dynamic.literal(delayClear = delayClear.asInstanceOf[js.Any], delayPost = delayPost.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolTip]
  }
  @scala.inline
  implicit class ToolTipOps[Self <: ToolTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayClear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayPost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

