package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Height
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Left
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Right
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandlerGestureEvent
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandlerProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanGestureHandler
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
    ] {
  @JSImport("react-native-gesture-handler", "PanGestureHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    activeOffsetX: Double | js.Array[Double] = null,
    activeOffsetY: Double | js.Array[Double] = null,
    avgTouches: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    failOffsetX: Double | js.Array[Double] = null,
    failOffsetY: Double | js.Array[Double] = null,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    maxDeltaX: Int | Double = null,
    maxDeltaY: Int | Double = null,
    maxPointers: Int | Double = null,
    minDeltaX: Int | Double = null,
    minDeltaY: Int | Double = null,
    minDist: Int | Double = null,
    minOffsetX: Int | Double = null,
    minOffsetY: Int | Double = null,
    minPointers: Int | Double = null,
    minVelocity: Int | Double = null,
    minVelocityX: Int | Double = null,
    minVelocityY: Int | Double = null,
    onGestureEvent: /* event */ PanGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ PanGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
  ] = {
    val __obj = js.Dynamic.literal()
    if (activeOffsetX != null) __obj.updateDynamic("activeOffsetX")(activeOffsetX.asInstanceOf[js.Any])
    if (activeOffsetY != null) __obj.updateDynamic("activeOffsetY")(activeOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(avgTouches)) __obj.updateDynamic("avgTouches")(avgTouches.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (failOffsetX != null) __obj.updateDynamic("failOffsetX")(failOffsetX.asInstanceOf[js.Any])
    if (failOffsetY != null) __obj.updateDynamic("failOffsetY")(failOffsetY.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (maxDeltaX != null) __obj.updateDynamic("maxDeltaX")(maxDeltaX.asInstanceOf[js.Any])
    if (maxDeltaY != null) __obj.updateDynamic("maxDeltaY")(maxDeltaY.asInstanceOf[js.Any])
    if (maxPointers != null) __obj.updateDynamic("maxPointers")(maxPointers.asInstanceOf[js.Any])
    if (minDeltaX != null) __obj.updateDynamic("minDeltaX")(minDeltaX.asInstanceOf[js.Any])
    if (minDeltaY != null) __obj.updateDynamic("minDeltaY")(minDeltaY.asInstanceOf[js.Any])
    if (minDist != null) __obj.updateDynamic("minDist")(minDist.asInstanceOf[js.Any])
    if (minOffsetX != null) __obj.updateDynamic("minOffsetX")(minOffsetX.asInstanceOf[js.Any])
    if (minOffsetY != null) __obj.updateDynamic("minOffsetY")(minOffsetY.asInstanceOf[js.Any])
    if (minPointers != null) __obj.updateDynamic("minPointers")(minPointers.asInstanceOf[js.Any])
    if (minVelocity != null) __obj.updateDynamic("minVelocity")(minVelocity.asInstanceOf[js.Any])
    if (minVelocityX != null) __obj.updateDynamic("minVelocityX")(minVelocityX.asInstanceOf[js.Any])
    if (minVelocityY != null) __obj.updateDynamic("minVelocityY")(minVelocityY.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PanGestureHandlerProperties
}

