package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.TVViewPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityProps because Already inherited
- typingsSlinky.reactNative.mod.Touchable because Already inherited
- typingsSlinky.reactNative.mod.GestureResponderHandlers because Already inherited
- typingsSlinky.reactNative.mod.ViewPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.ViewPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.ViewProps because Already inherited
- typingsSlinky.reactNative.mod.SliderPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityStates, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined thumbTintColor */ @js.native
trait SliderProps extends SliderPropsIOS {
  /**
    * If true the user won't be able to move the slider.
    * Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The color used for the track to the right of the button.
    * Overrides the default blue gradient image.
    */
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial maximum value of the slider. Default value is 1.
    */
  var maximumValue: js.UndefOr[Double] = js.native
  /**
    * The color used for the track to the left of the button.
    * Overrides the default blue gradient image.
    */
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial minimum value of the slider. Default value is 0.
    */
  var minimumValue: js.UndefOr[Double] = js.native
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released).
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback continuously called while the user is dragging the slider.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Step value of the slider. The value should be between 0 and (maximumValue - minimumValue). Default value is 0.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Color of the foreground switch grip.
    */
  var thumbTintColor: js.UndefOr[String] = js.native
  /**
    * Initial value of the slider. The value should be between minimumValue
    * and maximumValue, which default to 0 and 1 respectively.
    * Default value is 0.
    * This is not a controlled component, you don't need to update
    * the value during dragging.
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

