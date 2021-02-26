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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderProps extends StObject {
  
  /**
    * Allow touch on track to move the thumb.
    */
  var allowTouchTrack: js.UndefOr[Boolean] = js.native
  
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
    * The props applied to the thumb
    */
  var thumbProps: js.UndefOr[js.Any] = js.native
  
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
  implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTouchTrack(value: Boolean): Self = StObject.set(x, "allowTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchTrackUndefined: Self = StObject.set(x, "allowTouchTrack", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: TimingAnimationConfig | SpringAnimationConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThumbProps(value: js.Any): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    @scala.inline
    def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setThumbTouchSize(value: Height): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
    
    @scala.inline
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStyleNull: Self = StObject.set(x, "trackStyle", null)
    
    @scala.inline
    def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
