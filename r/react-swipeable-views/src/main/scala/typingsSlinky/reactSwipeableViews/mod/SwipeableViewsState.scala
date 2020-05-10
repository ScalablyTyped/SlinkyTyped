package typingsSlinky.reactSwipeableViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableViewsState extends js.Object {
  var displaySameSlide: js.UndefOr[Boolean] = js.native
  var heightLatest: js.UndefOr[Double] = js.native
  var indexCurrent: js.UndefOr[Double] = js.native
  var indexLatest: js.UndefOr[Double] = js.native
  var isDragging: js.UndefOr[Boolean] = js.native
  var isFirstRender: js.UndefOr[Boolean] = js.native
}

object SwipeableViewsState {
  @scala.inline
  def apply(): SwipeableViewsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableViewsState]
  }
  @scala.inline
  implicit class SwipeableViewsStateOps[Self <: SwipeableViewsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplaySameSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySameSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaySameSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySameSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightLatest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLatest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFirstRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFirstRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstRender")(js.undefined)
        ret
    }
  }
  
}

