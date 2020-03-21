package typingsSlinky.reactNativeGestureHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.AnonBottom
import typingsSlinky.reactNativeGestureHandler.AnonBottomHeight
import typingsSlinky.reactNativeGestureHandler.AnonHeight
import typingsSlinky.reactNativeGestureHandler.AnonLeft
import typingsSlinky.reactNativeGestureHandler.AnonRight
import typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerStateChangeEvent
import typingsSlinky.reactNativeGestureHandler.mod.RawButtonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RawButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RawButton] {
  @JSImport("react-native-gesture-handler", "RawButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    accessibilityLabel: String = null,
    disallowInterruption: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    onGestureEvent: /* event */ NativeViewGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit = null,
    shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    testID: String = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RawButton] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(disallowInterruption)) __obj.updateDynamic("disallowInterruption")(disallowInterruption.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldActivateOnStart)) __obj.updateDynamic("shouldActivateOnStart")(shouldActivateOnStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RawButton] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeGestureHandler.mod.RawButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RawButtonProperties
}

