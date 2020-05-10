package typingsSlinky.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridState extends js.Object {
  var isScrolling: Boolean = js.native
  var scrollDirectionHorizontal: ScrollDirection = js.native
  var scrollDirectionVertical: ScrollDirection = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
}

object GridState {
  @scala.inline
  def apply(
    isScrolling: Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double
  ): GridState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollDirectionHorizontal = scrollDirectionHorizontal.asInstanceOf[js.Any], scrollDirectionVertical = scrollDirectionVertical.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridState]
  }
  @scala.inline
  implicit class GridStateOps[Self <: GridState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDirectionHorizontal(value: ScrollDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirectionHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDirectionVertical(value: ScrollDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirectionVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

