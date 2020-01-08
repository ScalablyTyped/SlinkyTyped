package typingsSlinky.reactDashNativeDashElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.SpringAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.TimingAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashElements.Anon_Height
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.SliderProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.horizontal
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.spring
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.timing
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Slider
    ] {
  @JSImport("react-native-elements", "Slider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    animationConfig: TimingAnimationConfig | SpringAnimationConfig = null,
    animationType: spring | timing = null,
    debugTouchArea: js.UndefOr[Boolean] = js.undefined,
    maximumTrackTintColor: String = null,
    maximumValue: Int | Double = null,
    minimumTrackTintColor: String = null,
    minimumValue: Int | Double = null,
    onSlidingComplete: /* value */ Double => Unit = null,
    onSlidingStart: /* value */ Double => Unit = null,
    onValueChange: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    step: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    thumbStyle: StyleProp[ViewStyle] = null,
    thumbTintColor: String = null,
    thumbTouchSize: Anon_Height = null,
    trackStyle: StyleProp[ViewStyle] = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Slider
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugTouchArea)) __obj.updateDynamic("debugTouchArea")(debugTouchArea.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(js.Any.fromFunction1(onSlidingComplete))
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(js.Any.fromFunction1(onSlidingStart))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor.asInstanceOf[js.Any])
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Slider
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Slider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SliderProps
}

