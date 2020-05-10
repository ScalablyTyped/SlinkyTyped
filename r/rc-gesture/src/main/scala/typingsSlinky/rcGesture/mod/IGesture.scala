package typingsSlinky.rcGesture.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcGesture.rcGestureStrings.all
import typingsSlinky.rcGesture.rcGestureStrings.horizontal
import typingsSlinky.rcGesture.rcGestureStrings.vertical
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGesture extends js.Object {
  var direction: js.UndefOr[all | vertical | horizontal] = js.native
  var enablePinch: js.UndefOr[Boolean] = js.native
  var enableRotate: js.UndefOr[Boolean] = js.native
  var onPan: js.UndefOr[GestureHandler] = js.native
  var onPanCancel: js.UndefOr[GestureHandler] = js.native
  var onPanDown: js.UndefOr[GestureHandler] = js.native
  var onPanEnd: js.UndefOr[GestureHandler] = js.native
  var onPanLeft: js.UndefOr[GestureHandler] = js.native
  var onPanMove: js.UndefOr[GestureHandler] = js.native
  var onPanRight: js.UndefOr[GestureHandler] = js.native
  var onPanStart: js.UndefOr[GestureHandler] = js.native
  var onPanUp: js.UndefOr[GestureHandler] = js.native
  var onPinch: js.UndefOr[GestureHandler] = js.native
  var onPinchCancel: js.UndefOr[GestureHandler] = js.native
  var onPinchEnd: js.UndefOr[GestureHandler] = js.native
  var onPinchIn: js.UndefOr[GestureHandler] = js.native
  var onPinchMove: js.UndefOr[GestureHandler] = js.native
  var onPinchOut: js.UndefOr[GestureHandler] = js.native
  var onPinchStart: js.UndefOr[GestureHandler] = js.native
  var onPress: js.UndefOr[GestureHandler] = js.native
  var onPressUp: js.UndefOr[GestureHandler] = js.native
  var onRotate: js.UndefOr[GestureHandler] = js.native
  var onRotateCancel: js.UndefOr[GestureHandler] = js.native
  var onRotateEnd: js.UndefOr[GestureHandler] = js.native
  var onRotateMove: js.UndefOr[GestureHandler] = js.native
  var onRotateStart: js.UndefOr[GestureHandler] = js.native
  var onSwipe: js.UndefOr[GestureHandler] = js.native
  var onSwipeDown: js.UndefOr[GestureHandler] = js.native
  var onSwipeLeft: js.UndefOr[GestureHandler] = js.native
  var onSwipeRight: js.UndefOr[GestureHandler] = js.native
  var onSwipeUp: js.UndefOr[GestureHandler] = js.native
  var onTap: js.UndefOr[GestureHandler] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
}

object IGesture {
  @scala.inline
  def apply(): IGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGesture]
  }
  @scala.inline
  implicit class IGestureOps[Self <: IGesture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: all | vertical | horizontal): Self = {
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
    def withEnablePinch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePinch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinch")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPan(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanCancel(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanDown(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanEnd(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanLeft(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanMove(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanRight(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanStart(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanUp(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinch(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchCancel(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchEnd(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchIn(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchMove(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchOut(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinchStart(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressUp(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotate(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotateCancel(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotateCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotateEnd(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotateEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotateMove(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotateMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotateStart(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotateStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotateStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipe(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeDown(value: /* s */ IGestureStatus => Unit): Self = {
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
    def withOnSwipeLeft(value: /* s */ IGestureStatus => Unit): Self = {
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
    def withOnSwipeRight(value: /* s */ IGestureStatus => Unit): Self = {
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
    def withOnSwipeUp(value: /* s */ IGestureStatus => Unit): Self = {
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
    @scala.inline
    def withOnTap(value: /* s */ IGestureStatus => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
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

