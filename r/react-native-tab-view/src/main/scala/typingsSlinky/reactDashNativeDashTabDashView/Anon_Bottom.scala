package typingsSlinky.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcPagerMod.Props
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.SceneRendererProps
import typingsSlinky.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.bottom
import typingsSlinky.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var initialLayout: js.UndefOr[Anon_Height] = js.undefined
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabBarPosition: top | bottom
  def onIndexChange(index: Double): Unit
  def renderLazyPlaceholder(props: Anon_Route[T]): TagMod[Any]
  def renderPager(props: Props[T]): TagMod[Any]
  def renderScene(props: SceneRendererProps with Anon_Route[T]): TagMod[Any]
  def renderTabBar(props: SceneRendererProps with Anon_NavigationState[T]): TagMod[Any]
}

object Anon_Bottom {
  @scala.inline
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: Anon_Route[T] => TagMod[Any],
    renderPager: Props[T] => TagMod[Any],
    renderScene: SceneRendererProps with Anon_Route[T] => TagMod[Any],
    renderTabBar: SceneRendererProps with Anon_NavigationState[T] => TagMod[Any],
    tabBarPosition: top | bottom,
    initialLayout: Anon_Height = null,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    style: StyleProp[ViewStyle] = null
  ): Anon_Bottom[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom[T]]
  }
}

