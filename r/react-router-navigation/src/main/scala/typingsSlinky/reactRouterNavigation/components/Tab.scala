package typingsSlinky.reactRouterNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouterNavigation.mod.TabBarProps
import typingsSlinky.reactRouterNavigation.mod.TabProps
import typingsSlinky.reactRouterNavigation.mod.TabSubViewProps
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import typingsSlinky.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-router-navigation", "Tab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: label */
  def apply(
    component: ReactComponentClass[RouterProps] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    labelStyle: StyleProp[TextStyle] = null,
    onIndexChange: /* index */ Double => Unit = null,
    onReset: /* props */ TabBarProps with RouteProps => Unit = null,
    path: String = null,
    render: /* props */ RouterProps => TagMod[Any] = null,
    renderLabel: /* props */ TabSubViewProps => TagMod[Any] = null,
    renderTabBar: /* props */ TabSubViewProps => TagMod[Any] = null,
    renderTabIcon: /* props */ TabSubViewProps => TagMod[Any] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: StyleProp[ViewStyle] = null,
    tabBarPosition: top | bottom = null,
    tabBarStyle: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    tabTintColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor.asInstanceOf[js.Any])
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabProps
}

