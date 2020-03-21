package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.AnonFocused
import typingsSlinky.reactNativeTabView.tabBarItemMod.default
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-tab-view/lib/typescript/src/TabBarItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T /* <: Route */](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: () => Unit,
    onPress: () => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T,
    activeColor: String = null,
    inactiveColor: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    pressColor: String = null,
    pressOpacity: Int | Double = null,
    renderBadge: /* scene */ Scene[T] => TagMod[Any] = null,
    renderIcon: /* scene */ AnonFocused[T] => TagMod[Any] = null,
    renderLabel: /* scene */ AnonFocused[T] => TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor.asInstanceOf[js.Any])
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeTabView.tabBarItemMod.default[js.Any]]]
  }
  type Props = typingsSlinky.reactNativeTabView.tabBarItemMod.Props[js.Any]
}

