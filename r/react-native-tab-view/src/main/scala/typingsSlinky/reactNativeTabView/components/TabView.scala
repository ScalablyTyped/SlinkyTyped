package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.Instantiable0
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.Height
import typingsSlinky.reactNativeTabView.anon.Route
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.top
import typingsSlinky.reactNativeTabView.tabViewMod.Props
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabView {
  @JSImport("react-native-tab-view", "TabView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTabView.mod.TabView[T]] {
    @scala.inline
    def initialLayout(value: Height): this.type = set("initialLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def onSwipeEnd(value: () => Unit): this.type = set("onSwipeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeStart(value: () => Unit): this.type = set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def position(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
    ): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def sceneContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sceneContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def sceneContainerStyleNull: this.type = set("sceneContainerStyle", null)
    @scala.inline
    def springVelocityScale(value: Double): this.type = set("springVelocityScale", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def swipeVelocityImpact(value: Double): this.type = set("swipeVelocityImpact", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: Route[T] => ReactElement,
    renderPager: typingsSlinky.reactNativeTabView.pagerMod.Props[T] => ReactElement,
    renderScene: SceneRendererProps with Route[T] => ReactElement,
    renderTabBar: SceneRendererProps with typingsSlinky.reactNativeTabView.anon.NavigationState[T] => ReactElement,
    springConfig: Damping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: Duration
  ): Builder[T] = {
    val __props = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __props.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}

