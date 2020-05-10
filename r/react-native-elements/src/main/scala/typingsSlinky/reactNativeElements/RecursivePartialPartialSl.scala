package typingsSlinky.reactNativeElements

import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.horizontal
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.spring
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.timing
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.SliderProps>> */
@js.native
trait RecursivePartialPartialSl extends js.Object {
  var animateTransitions: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var animationConfig: js.UndefOr[RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]] = js.native
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[spring | timing]]] = js.native
  var debugTouchArea: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var maximumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var maximumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var minimumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var minimumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onSlidingComplete: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var onSlidingStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var onValueChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var orientation: js.UndefOr[RecursivePartial[js.UndefOr[horizontal | vertical]]] = js.native
  var step: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var thumbStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var thumbTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var thumbTouchSize: js.UndefOr[RecursivePartial[js.UndefOr[AnonHeight]]] = js.native
  var trackStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
}

object RecursivePartialPartialSl {
  @scala.inline
  def apply(): RecursivePartialPartialSl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialSl]
  }
  @scala.inline
  implicit class RecursivePartialPartialSlOps[Self <: RecursivePartialPartialSl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateTransitions(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationConfig(value: RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationType(value: RecursivePartial[js.UndefOr[spring | timing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugTouchArea(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugTouchArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugTouchArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugTouchArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTrackTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTrackTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTrackTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTrackTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumTrackTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTrackTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlidingComplete(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSlidingComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlidingStart(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSlidingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: RecursivePartial[js.UndefOr[horizontal | vertical]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbTouchSize(value: RecursivePartial[js.UndefOr[AnonHeight]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTouchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbTouchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTouchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

