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
import typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlingGestureHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandler] {
  @JSImport("react-native-gesture-handler", "FlingGestureHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    direction: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    numberOfPointers: Int | Double = null,
    onGestureEvent: /* event */ FlingGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ FlingGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandler] = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (numberOfPointers != null) __obj.updateDynamic("numberOfPointers")(numberOfPointers.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandler] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeGestureHandler.mod.FlingGestureHandler](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlingGestureHandlerProperties
}

