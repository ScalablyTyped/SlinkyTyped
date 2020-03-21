package typingsSlinky.reactRouterNavigation.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import typingsSlinky.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends RouteProps
     with TabBarProps {
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* props */ TabBarProps with RouteProps, Unit]] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouterProps, TagMod[Any]]) | TagMod[Any] = null,
    component: ReactComponentClass[RouterProps] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
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
    tabTintColor: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[TabProps]
  }
}

