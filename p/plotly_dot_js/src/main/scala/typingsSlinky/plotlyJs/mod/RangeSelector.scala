package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.anon.PartialRangeSelectorButto
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelector extends Label {
  var activecolor: String = js.native
  var borderwidth: Double = js.native
  var buttons: js.Array[PartialRangeSelectorButto] = js.native
  var visible: Boolean = js.native
  var x: Double = js.native
  var xanchor: auto | left | center | right = js.native
  var y: Double = js.native
  var yanchor: auto | top | middle | bottom = js.native
}

object RangeSelector {
  @scala.inline
  def apply(
    activecolor: String,
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    buttons: js.Array[PartialRangeSelectorButto],
    font: PartialFont,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): RangeSelector = {
    val __obj = js.Dynamic.literal(activecolor = activecolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelector]
  }
  @scala.inline
  implicit class RangeSelectorOps[Self <: RangeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivecolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[PartialRangeSelectorButto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXanchor(value: auto | left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYanchor(value: auto | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

