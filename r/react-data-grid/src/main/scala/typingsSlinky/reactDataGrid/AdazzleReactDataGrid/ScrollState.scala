package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollState extends js.Object {
  var colOverscanEndIdx: Double = js.native
  var colOverscanStartIdx: Double = js.native
  var colVisibleEndIdx: Double = js.native
  var colVisibleStartIdx: Double = js.native
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var lastFrozenColumnIndex: Double = js.native
  var rowOverscanEndIdx: Double = js.native
  var rowOverscanStartIdx: Double = js.native
  var rowVisibleEndIdx: Double = js.native
  var rowVisibleStartIdx: Double = js.native
  var scrollDirection: SCROLL_DIRECTION = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
}

object ScrollState {
  @scala.inline
  def apply(
    colOverscanEndIdx: Double,
    colOverscanStartIdx: Double,
    colVisibleEndIdx: Double,
    colVisibleStartIdx: Double,
    height: Double,
    isScrolling: Boolean,
    lastFrozenColumnIndex: Double,
    rowOverscanEndIdx: Double,
    rowOverscanStartIdx: Double,
    rowVisibleEndIdx: Double,
    rowVisibleStartIdx: Double,
    scrollDirection: SCROLL_DIRECTION,
    scrollLeft: Double,
    scrollTop: Double
  ): ScrollState = {
    val __obj = js.Dynamic.literal(colOverscanEndIdx = colOverscanEndIdx.asInstanceOf[js.Any], colOverscanStartIdx = colOverscanStartIdx.asInstanceOf[js.Any], colVisibleEndIdx = colVisibleEndIdx.asInstanceOf[js.Any], colVisibleStartIdx = colVisibleStartIdx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], lastFrozenColumnIndex = lastFrozenColumnIndex.asInstanceOf[js.Any], rowOverscanEndIdx = rowOverscanEndIdx.asInstanceOf[js.Any], rowOverscanStartIdx = rowOverscanStartIdx.asInstanceOf[js.Any], rowVisibleEndIdx = rowVisibleEndIdx.asInstanceOf[js.Any], rowVisibleStartIdx = rowVisibleStartIdx.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollState]
  }
  @scala.inline
  implicit class ScrollStateOps[Self <: ScrollState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColOverscanEndIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colOverscanEndIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColOverscanStartIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colOverscanStartIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColVisibleEndIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colVisibleEndIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColVisibleStartIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colVisibleStartIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFrozenColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFrozenColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowOverscanEndIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowOverscanEndIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowOverscanStartIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowOverscanStartIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowVisibleEndIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVisibleEndIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowVisibleStartIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVisibleStartIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDirection(value: SCROLL_DIRECTION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(value.asInstanceOf[js.Any])
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

