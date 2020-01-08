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
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerGestureEvent
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ForceTouchGestureHandler
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler
    ] {
  @JSImport("react-native-gesture-handler", "ForceTouchGestureHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    feedbackOnActivation: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    maxForce: Int | Double = null,
    minForce: Int | Double = null,
    onGestureEvent: /* event */ ForceTouchGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(feedbackOnActivation)) __obj.updateDynamic("feedbackOnActivation")(feedbackOnActivation.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (minForce != null) __obj.updateDynamic("minForce")(minForce.asInstanceOf[js.Any])
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
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ForceTouchGestureHandlerProperties
}

