package typingsSlinky.perfectScrollbar.mod.PerfectScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var handlers: js.UndefOr[js.Array[String]] = js.native
  var maxScrollbarLength: js.UndefOr[Double] = js.native
  var minScrollbarLength: js.UndefOr[Double] = js.native
  var scrollXMarginOffset: js.UndefOr[Double] = js.native
  var scrollYMarginOffset: js.UndefOr[Double] = js.native
  var scrollingThreshold: js.UndefOr[Double] = js.native
  var suppressScrollX: js.UndefOr[Boolean] = js.native
  var suppressScrollY: js.UndefOr[Boolean] = js.native
  var swipeEasing: js.UndefOr[Boolean] = js.native
  var useBothWheelAxes: js.UndefOr[Boolean] = js.native
  var wheelPropagation: js.UndefOr[Boolean] = js.native
  var wheelSpeed: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScrollbarLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScrollbarLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScrollbarLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScrollbarLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScrollbarLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollbarLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScrollbarLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollbarLength")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollXMarginOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollXMarginOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollXMarginOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollXMarginOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollYMarginOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollYMarginOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollYMarginOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollYMarginOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressScrollX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressScrollY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBothWheelAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBothWheelAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBothWheelAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBothWheelAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSpeed")(js.undefined)
        ret
    }
  }
  
}

