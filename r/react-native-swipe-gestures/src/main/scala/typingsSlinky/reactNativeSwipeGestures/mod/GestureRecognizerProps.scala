package typingsSlinky.reactNativeSwipeGestures.mod

import typingsSlinky.reactNative.mod.PanResponderGestureState
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureRecognizerProps extends ViewProps {
  var config: js.UndefOr[GestureRecognizerConfig] = js.native
  var onSwipe: js.UndefOr[
    js.Function2[/* gestureName */ String, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  var onSwipeDown: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeLeft: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeRight: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeUp: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
}

object GestureRecognizerProps {
  @scala.inline
  def apply(): GestureRecognizerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureRecognizerProps]
  }
  @scala.inline
  implicit class GestureRecognizerPropsOps[Self <: GestureRecognizerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: GestureRecognizerConfig): Self = {
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
    def withOnSwipe(value: (/* gestureName */ String, /* gestureState */ PanResponderGestureState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeDown(value: /* gestureState */ PanResponderGestureState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeLeft(value: /* gestureState */ PanResponderGestureState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeRight(value: /* gestureState */ PanResponderGestureState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeUp(value: /* gestureState */ PanResponderGestureState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeUp")(js.undefined)
        ret
    }
  }
  
}

