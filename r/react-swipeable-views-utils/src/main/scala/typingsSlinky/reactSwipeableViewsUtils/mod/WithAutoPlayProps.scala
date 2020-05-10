package typingsSlinky.reactSwipeableViewsUtils.mod

import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.decremental
import typingsSlinky.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.incremental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithAutoPlayProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[incremental | decremental] = js.native
  var index: Double = js.native
  var interval: js.UndefOr[Double] = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  var slideCount: js.UndefOr[Double] = js.native
}

object WithAutoPlayProps {
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithAutoPlayProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    __obj.asInstanceOf[WithAutoPlayProps]
  }
  @scala.inline
  implicit class WithAutoPlayPropsOps[Self <: WithAutoPlayProps] (val x: Self) extends AnyVal {
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
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: incremental | decremental): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(js.undefined)
        ret
    }
  }
  
}

