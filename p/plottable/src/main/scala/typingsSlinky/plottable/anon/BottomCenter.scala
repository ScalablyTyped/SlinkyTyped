package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomCenter extends js.Object {
  var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
  var top: typingsSlinky.plottable.plottableStrings.top = js.native
}

object BottomCenter {
  @scala.inline
  def apply(bottom: bottom, center: center, top: top): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomCenter]
  }
  @scala.inline
  implicit class BottomCenterOps[Self <: BottomCenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

