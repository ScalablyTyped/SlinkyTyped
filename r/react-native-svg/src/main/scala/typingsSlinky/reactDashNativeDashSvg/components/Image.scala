package typingsSlinky.reactDashNativeDashSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeTouchEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NodeHandle
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.FillRule
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.ImageProps
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.NumberProp
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.`box-none`
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.`box-only`
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.auto
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Image] {
  @JSImport("react-native-svg", "Image")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, height, width */
  def apply(
    clipPath: String = null,
    clipRule: FillRule = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    href: ImageSourcePropType = null,
    mask: String = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    opacity: NumberProp = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    preserveAspectRatio: String = null,
    x: NumberProp = null,
    xlinkHref: ImageSourcePropType = null,
    y: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Image] = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xlinkHref != null) __obj.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Image] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Image](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ImageProps
}

