package typingsSlinky.katex.autoRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderMathInElementSpecificOptionsDelimiters extends js.Object {
  /**
    * A boolean of whether the math in the expression should be rendered in display mode or not
    */
  var display: Boolean = js.native
  /**
    * A string which starts the math expression (i.e. the left delimiter)
    */
  var left: String = js.native
  /**
    * A string which ends the math expression (i.e. the right delimiter)
    */
  var right: String = js.native
}

object RenderMathInElementSpecificOptionsDelimiters {
  @scala.inline
  def apply(display: Boolean, left: String, right: String): RenderMathInElementSpecificOptionsDelimiters = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMathInElementSpecificOptionsDelimiters]
  }
  @scala.inline
  implicit class RenderMathInElementSpecificOptionsDelimitersOps[Self <: RenderMathInElementSpecificOptionsDelimiters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

