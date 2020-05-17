package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.anon.Height
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.horizontal
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.spring
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.timing
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends js.Object {
  /**
    * Set to true if you want to use the default 'spring' animation
    *
    * @default false
    */
  var animateTransitions: js.UndefOr[Boolean] = js.native
  /**
    * Used to configure the animation parameters. These are the same parameters in the Animated library.
    *
    * @default undefined
    */
  var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.native
  /**
    * Set to 'spring' or 'timing' to use one of those two types of animations with the default animation properties.
    *
    * @default 'timing'
    */
  var animationType: js.UndefOr[spring | timing] = js.native
  /**
    * Set this to true to visually see the thumb touch rect in green.
    *
    * @default false
    */
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  /**
    * If true the user won't be able to move the slider
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The color used for the track to the right of the button
    *
    * @default '#b3b3b3'
    */
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial maximum value of the slider
    *
    * @default 1
    */
  var maximumValue: js.UndefOr[Double] = js.native
  /**
    * The color used for the track to the left of the button
    *
    * @default '#3f3f3f'
    */
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial minimum value of the slider
    *
    * @default	0
    */
  var minimumValue: js.UndefOr[Double] = js.native
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released)
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback called when the user starts changing the value (e.g. when the slider is pressed)
    */
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback continuously called while the user is dragging the slider
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Choose the orientation
    *
    * @default horizontal
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Step value of the slider. The value should be between 0 and maximumValue - minimumValue)
    *
    * @default 0
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * The style applied to the slider container
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The style applied to the thumb
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The color used for the thumb
    *
    * @default '#343434'
    */
  var thumbTintColor: js.UndefOr[String] = js.native
  /**
    * The size of the touch area that allows moving the thumb. The touch area has the same center as the visible thumb.
    * This allows to have a visually small thumb while still allowing the user to move it easily.
    *
    * @default "{width: 40, height: 40}"
    */
  var thumbTouchSize: js.UndefOr[Height] = js.native
  /**
    * The style applied to the track
    */
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Initial value of the slider
    *
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateTransitions(value: Boolean): Self = {
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
    def withAnimationConfig(value: TimingAnimationConfig | SpringAnimationConfig): Self = {
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
    def withAnimationType(value: spring | timing): Self = {
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
    def withDebugTouchArea(value: Boolean): Self = {
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
    def withDisabled(value: Boolean): Self = {
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
    def withMaximumTrackTintColor(value: String): Self = {
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
    def withMaximumValue(value: Double): Self = {
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
    def withMinimumTrackTintColor(value: String): Self = {
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
    def withMinimumValue(value: Double): Self = {
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
    def withOnSlidingComplete(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSlidingComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlidingStart(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSlidingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
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
    def withStep(value: Double): Self = {
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
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withThumbStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withThumbStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStyle")(null)
        ret
    }
    @scala.inline
    def withThumbTintColor(value: String): Self = {
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
    def withThumbTouchSize(value: Height): Self = {
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
    def withTrackStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withTrackStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(null)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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

