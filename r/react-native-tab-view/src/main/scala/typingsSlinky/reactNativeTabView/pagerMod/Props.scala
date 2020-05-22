package typingsSlinky.reactNativeTabView.pagerMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.EventEmitterPropsposition
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   layout  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Layout,   removeClippedSubviews ? :boolean, children (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void}): react.react.ReactNode,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>} */
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var keyboardDismissMode: none | `on-drag` | auto
  var layout: Layout
  var navigationState: NavigationState[T]
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var springConfig: Damping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var timingConfig: Duration
  def children(props: EventEmitterPropsposition): TagMod[Any]
  def onIndexChange(index: Double): Unit
}

object Props {
  @scala.inline
  def apply[T](
    children: EventEmitterPropsposition => TagMod[Any],
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    springVelocityScale: js.UndefOr[Double] = js.undefined,
    swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springVelocityScale)) __obj.updateDynamic("springVelocityScale")(springVelocityScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeVelocityImpact)) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

