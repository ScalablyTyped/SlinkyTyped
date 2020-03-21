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
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TapGestureHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandler] {
  @JSImport("react-native-gesture-handler", "TapGestureHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    maxDelayMs: Int | Double = null,
    maxDeltaX: Int | Double = null,
    maxDeltaY: Int | Double = null,
    maxDist: Int | Double = null,
    maxDurationMs: Int | Double = null,
    minPointers: Int | Double = null,
    numberOfTaps: Int | Double = null,
    onGestureEvent: /* event */ TapGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ TapGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandler] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (maxDelayMs != null) __obj.updateDynamic("maxDelayMs")(maxDelayMs.asInstanceOf[js.Any])
    if (maxDeltaX != null) __obj.updateDynamic("maxDeltaX")(maxDeltaX.asInstanceOf[js.Any])
    if (maxDeltaY != null) __obj.updateDynamic("maxDeltaY")(maxDeltaY.asInstanceOf[js.Any])
    if (maxDist != null) __obj.updateDynamic("maxDist")(maxDist.asInstanceOf[js.Any])
    if (maxDurationMs != null) __obj.updateDynamic("maxDurationMs")(maxDurationMs.asInstanceOf[js.Any])
    if (minPointers != null) __obj.updateDynamic("minPointers")(minPointers.asInstanceOf[js.Any])
    if (numberOfTaps != null) __obj.updateDynamic("numberOfTaps")(numberOfTaps.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandler] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandler](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TapGestureHandlerProperties
}

