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
import typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RotationGestureHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandler] {
  @JSImport("react-native-gesture-handler", "RotationGestureHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    onGestureEvent: /* event */ RotationGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ RotationGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandler] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandler] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeGestureHandler.mod.RotationGestureHandler](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RotationGestureHandlerProperties
}

