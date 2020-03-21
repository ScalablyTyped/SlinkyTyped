package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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
import typingsSlinky.reactNativeTabView.tabViewMod.default
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-tab-view/lib/typescript/src/TabView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
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
    timingConfig: AnonDuration,
    `lazy`: Boolean,
    initialLayout: AnonHeight = null,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    springVelocityScale: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    swipeVelocityImpact: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeTabView.tabViewMod.default[js.Any]]]
  }
  type Props = typingsSlinky.reactNativeTabView.tabViewMod.Props[js.Any]
}

