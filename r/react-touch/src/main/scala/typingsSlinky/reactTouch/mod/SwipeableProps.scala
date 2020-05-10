package typingsSlinky.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableProps extends js.Object {
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.native
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object SwipeableProps {
  @scala.inline
  def apply(): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProps]
  }
  @scala.inline
  implicit class SwipeablePropsOps[Self <: SwipeableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SwipeableConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeLeft(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeRight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
  }
  
}

