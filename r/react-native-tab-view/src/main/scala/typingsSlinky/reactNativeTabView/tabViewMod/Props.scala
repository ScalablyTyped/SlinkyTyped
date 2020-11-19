package typingsSlinky.reactNativeTabView.tabViewMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.Height
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {  position :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> * / any | undefined, onIndexChange (index : number): void,   navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>, renderScene (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route :T}): react.react.ReactNode, renderLazyPlaceholder (props : {  route :T}): react.react.ReactNode, renderTabBar (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>}): react.react.ReactNode,   tabBarPosition :'top' | 'bottom',   initialLayout :{  width :number | undefined,   height :number | undefined} | undefined,   lazy :boolean,   lazyPreloadDistance :number,   removeClippedSubviews :boolean | undefined,   sceneContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   gestureHandlerProps :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>, renderPager (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/Pager.Props<T>): react.react.ReactNode} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = js.native
  
  var initialLayout: js.UndefOr[Height] = js.native
  
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  
  var `lazy`: Boolean = js.native
  
  var lazyPreloadDistance: Double = js.native
  
  var navigationState: NavigationState[T] = js.native
  
  def onIndexChange(index: Double): Unit = js.native
  
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  def renderLazyPlaceholder(props: typingsSlinky.reactNativeTabView.anon.Route[T]): ReactElement = js.native
  
  def renderPager(props: typingsSlinky.reactNativeTabView.pagerMod.Props[T]): ReactElement = js.native
  
  def renderScene(props: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.Route[T]): ReactElement = js.native
  
  def renderTabBar(props: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.NavigationState[T]): ReactElement = js.native
  
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var springConfig: Damping = js.native
  
  var springVelocityScale: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swipeEnabled: Boolean = js.native
  
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  
  var tabBarPosition: top | bottom = js.native
  
  var timingConfig: Duration = js.native
}
object Props {
  
  @scala.inline
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: typingsSlinky.reactNativeTabView.anon.Route[T] => ReactElement,
    renderPager: typingsSlinky.reactNativeTabView.pagerMod.Props[T] => ReactElement,
    renderScene: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.Route[T] => ReactElement,
    renderTabBar: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.NavigationState[T] => ReactElement,
    springConfig: Damping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: Duration
  ): Props[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T /* <: Route */] (val x: Self with Props[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = this.set("gestureHandlerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyPreloadDistance(value: Double): Self = this.set("lazyPreloadDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationState(value: NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIndexChange(value: Double => Unit): Self = this.set("onIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderLazyPlaceholder(value: typingsSlinky.reactNativeTabView.anon.Route[T] => ReactElement): Self = this.set("renderLazyPlaceholder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderPager(value: typingsSlinky.reactNativeTabView.pagerMod.Props[T] => ReactElement): Self = this.set("renderPager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderScene(value: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.Route[T] => ReactElement): Self = this.set("renderScene", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabBar(
      value: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.NavigationState[T] => ReactElement
    ): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpringConfig(value: Damping): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingConfig(value: Duration): Self = this.set("timingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialLayout(value: Height): Self = this.set("initialLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLayout: Self = this.set("initialLayout", js.undefined)
    
    @scala.inline
    def setOnSwipeEnd(value: () => Unit): Self = this.set("onSwipeEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeEnd: Self = this.set("onSwipeEnd", js.undefined)
    
    @scala.inline
    def setOnSwipeStart(value: () => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setSceneContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("sceneContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneContainerStyle: Self = this.set("sceneContainerStyle", js.undefined)
    
    @scala.inline
    def setSceneContainerStyleNull: Self = this.set("sceneContainerStyle", null)
    
    @scala.inline
    def setSpringVelocityScale(value: Double): Self = this.set("springVelocityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpringVelocityScale: Self = this.set("springVelocityScale", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeVelocityImpact(value: Double): Self = this.set("swipeVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeVelocityImpact: Self = this.set("swipeVelocityImpact", js.undefined)
  }
}
