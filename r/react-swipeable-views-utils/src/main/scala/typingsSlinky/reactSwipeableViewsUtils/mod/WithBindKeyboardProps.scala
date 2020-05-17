package typingsSlinky.reactSwipeableViewsUtils.mod

import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithBindKeyboardProps extends js.Object {
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.native
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  var slidecount: js.UndefOr[Double] = js.native
}

object WithBindKeyboardProps {
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithBindKeyboardProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    __obj.asInstanceOf[WithBindKeyboardProps]
  }
  @scala.inline
  implicit class WithBindKeyboardPropsOps[Self <: WithBindKeyboardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAxis(
      value: typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x | `x-reverse` | y | `y-reverse`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidecount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidecount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidecount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidecount")(js.undefined)
        ret
    }
  }
  
}

