package typingsSlinky.reactRouterNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigation.mod.BottomNavigationProps
import typingsSlinky.reactRouterNavigation.mod.TabSubViewProps
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterNavigation.mod.BottomNavigation] {
  @JSImport("react-router-navigation", "BottomNavigation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: label */
  def apply(
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    labelStyle: StyleProp[TextStyle] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    renderLabel: /* props */ TabSubViewProps => TagMod[Any] = null,
    renderTabBar: /* props */ TabSubViewProps => TagMod[Any] = null,
    renderTabIcon: /* props */ TabSubViewProps => TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: StyleProp[ViewStyle] = null,
    tabBarPosition: top | bottom = null,
    tabBarStyle: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    tabTintColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.BottomNavigation] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor.asInstanceOf[js.Any])
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.BottomNavigation] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactRouterNavigation.mod.BottomNavigation](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BottomNavigationProps
}

