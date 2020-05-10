package typingsSlinky.reactNativeTabView.tabViewMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.AnonDamping
import typingsSlinky.reactNativeTabView.AnonDuration
import typingsSlinky.reactNativeTabView.AnonHeight
import typingsSlinky.reactNativeTabView.AnonNavigationState
import typingsSlinky.reactNativeTabView.AnonRoute
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.top
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {  position ? :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> * / any, onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>, renderScene (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route  :T}): react.react.ReactNode, renderLazyPlaceholder (props : {  route  :T}): react.react.ReactNode, renderTabBar (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>}): react.react.ReactNode,   tabBarPosition  :'top' | 'bottom',   initialLayout ? :{  width ? :number,   height ? :number},   lazy  :boolean,   lazyPreloadDistance  :number,   removeClippedSubviews ? :boolean,   sceneContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>, renderPager (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/Pager.Props<T>): react.react.ReactNode} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = js.native
  var initialLayout: js.UndefOr[AnonHeight] = js.native
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  var `lazy`: Boolean = js.native
  var lazyPreloadDistance: Double = js.native
  var navigationState: NavigationState[T] = js.native
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var springConfig: AnonDamping = js.native
  var springVelocityScale: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var swipeEnabled: Boolean = js.native
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  var tabBarPosition: top | bottom = js.native
  var timingConfig: AnonDuration = js.native
  def onIndexChange(index: Double): Unit = js.native
  def renderLazyPlaceholder(props: AnonRoute[T]): TagMod[Any] = js.native
  def renderPager(props: typingsSlinky.reactNativeTabView.pagerMod.Props[T]): TagMod[Any] = js.native
  def renderScene(props: SceneRendererProps with AnonRoute[T]): TagMod[Any] = js.native
  def renderTabBar(props: SceneRendererProps with AnonNavigationState[T]): TagMod[Any] = js.native
}

object Props {
  @scala.inline
  def apply[T](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: AnonRoute[T] => TagMod[Any],
    renderPager: typingsSlinky.reactNativeTabView.pagerMod.Props[T] => TagMod[Any],
    renderScene: SceneRendererProps with AnonRoute[T] => TagMod[Any],
    renderTabBar: SceneRendererProps with AnonNavigationState[T] => TagMod[Any],
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: AnonDuration
  ): Props[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self[t] <: Props[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandlerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: none | `on-drag` | auto): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyPreloadDistance(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyPreloadDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationState(value: NavigationState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIndexChange(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderLazyPlaceholder(value: AnonRoute[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLazyPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderPager(value: typingsSlinky.reactNativeTabView.pagerMod.Props[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPager")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderScene(value: SceneRendererProps with AnonRoute[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderScene")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTabBar(value: SceneRendererProps with AnonNavigationState[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpringConfig(value: AnonDamping): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarPosition(value: top | bottom): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimingConfig(value: AnonDuration): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialLayout(value: AnonHeight): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialLayout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeEnd(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneContainerStyle")(null)
        ret
    }
    @scala.inline
    def withSpringVelocityScale(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringVelocityScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withSwipeVelocityImpact(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeVelocityImpact: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(js.undefined)
        ret
    }
  }
  
}

