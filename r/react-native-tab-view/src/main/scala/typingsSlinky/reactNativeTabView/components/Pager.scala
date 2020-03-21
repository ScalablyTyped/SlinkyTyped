package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.AnonDamping
import typingsSlinky.reactNativeTabView.AnonDuration
import typingsSlinky.reactNativeTabView.pagerMod.default
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pager
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-tab-view/lib/typescript/src/Pager", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    timingConfig: AnonDuration,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    springVelocityScale: Int | Double = null,
    swipeVelocityImpact: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeTabView.pagerMod.default[js.Any]]]
  }
  type Props = typingsSlinky.reactNativeTabView.pagerMod.Props[js.Any]
}

