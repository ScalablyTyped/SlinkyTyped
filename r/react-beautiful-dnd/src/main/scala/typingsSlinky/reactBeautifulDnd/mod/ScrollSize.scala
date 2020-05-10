package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSize extends js.Object {
  var scrollHeight: Double = js.native
  var scrollWidth: Double = js.native
}

object ScrollSize {
  @scala.inline
  def apply(scrollHeight: Double, scrollWidth: Double): ScrollSize = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSize]
  }
  @scala.inline
  implicit class ScrollSizeOps[Self <: ScrollSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

