package typingsSlinky.reactHammerjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hammerjs.HammerInput
import typingsSlinky.hammerjs.HammerListener
import typingsSlinky.hammerjs.Recognizer
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactHammerProps extends js.Object {
  var action: js.UndefOr[HammerListener] = js.native
  var direction: js.UndefOr[
    DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
  ] = js.native
  var onDoubleTap: js.UndefOr[HammerListener] = js.native
  var onPan: js.UndefOr[HammerListener] = js.native
  var onPanCancel: js.UndefOr[HammerListener] = js.native
  var onPanEnd: js.UndefOr[HammerListener] = js.native
  var onPanStart: js.UndefOr[HammerListener] = js.native
  var onPinch: js.UndefOr[HammerListener] = js.native
  var onPinchCancel: js.UndefOr[HammerListener] = js.native
  var onPinchEnd: js.UndefOr[HammerListener] = js.native
  var onPinchIn: js.UndefOr[HammerListener] = js.native
  var onPinchOut: js.UndefOr[HammerListener] = js.native
  var onPinchStart: js.UndefOr[HammerListener] = js.native
  var onPress: js.UndefOr[HammerListener] = js.native
  var onPressUp: js.UndefOr[HammerListener] = js.native
  var onRotate: js.UndefOr[HammerListener] = js.native
  var onRotateCancel: js.UndefOr[HammerListener] = js.native
  var onRotateEnd: js.UndefOr[HammerListener] = js.native
  var onRotateMove: js.UndefOr[HammerListener] = js.native
  var onRotateStart: js.UndefOr[HammerListener] = js.native
  var onSwipe: js.UndefOr[HammerListener] = js.native
  var onTap: js.UndefOr[HammerListener] = js.native
  var options: js.UndefOr[HammerOptionsWithRecognizers] = js.native
  var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ReactHammerProps {
  @scala.inline
  def apply(): ReactHammerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactHammerProps]
  }
  @scala.inline
  implicit class ReactHammerPropsOps[Self <: ReactHammerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: /* event */ HammerInput => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(
      value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
    ): Self = {
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
    def withOnDoubleTap(value: /* event */ HammerInput => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPan(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPanCancel(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPanEnd(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPanStart(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinch(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinchCancel(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinchEnd(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinchIn(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinchOut(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPinchStart(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPress(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnPressUp(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnRotate(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnRotateCancel(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnRotateEnd(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnRotateMove(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnRotateStart(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnSwipe(value: /* event */ HammerInput => Unit): Self = {
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
    def withOnTap(value: /* event */ HammerInput => Unit): Self = {
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
    def withOptions(value: HammerOptionsWithRecognizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizeWith(value: StringDictionary[Recognizer | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizeWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeWith")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

