package typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Height
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Left
import typingsSlinky.reactDashNativeDashGestureDashHandler.Anon_Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeViewGestureHandlerProperties extends GestureHandlerProperties {
  var disallowInterruption: js.UndefOr[Boolean] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.undefined
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
}

object NativeViewGestureHandlerProperties {
  @scala.inline
  def apply(
    disallowInterruption: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    id: String = null,
    onGestureEvent: /* event */ NativeViewGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit = null,
    shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): NativeViewGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disallowInterruption)) __obj.updateDynamic("disallowInterruption")(disallowInterruption.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldActivateOnStart)) __obj.updateDynamic("shouldActivateOnStart")(shouldActivateOnStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerProperties]
  }
}

