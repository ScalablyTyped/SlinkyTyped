package typingsSlinky.reactRouterNavigation.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarProps extends js.Object {
  var hideTabBar: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* props */ TabSubViewProps, TagMod[Any]]] = js.native
  var renderTabBar: js.UndefOr[js.Function1[/* props */ TabSubViewProps, TagMod[Any]]] = js.native
  // <BottomNavigation /> only:
  var renderTabIcon: js.UndefOr[js.Function1[/* props */ TabSubViewProps, TagMod[Any]]] = js.native
  var tabActiveTintColor: js.UndefOr[String] = js.native
  var tabBarIndicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  // <Tabs /> only:
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabTintColor: js.UndefOr[String] = js.native
}

object TabBarProps {
  @scala.inline
  def apply(): TabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarProps]
  }
  @scala.inline
  implicit class TabBarPropsOps[Self <: TabBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideTabBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(null)
        ret
    }
    @scala.inline
    def withRenderLabel(value: /* props */ TabSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTabBar(value: /* props */ TabSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTabIcon(value: /* props */ TabSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTabIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTabActiveTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabActiveTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabActiveTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabActiveTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarIndicatorStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIndicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarIndicatorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIndicatorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarIndicatorStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIndicatorStyle")(null)
        ret
    }
    @scala.inline
    def withTabBarPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(null)
        ret
    }
    @scala.inline
    def withTabStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(null)
        ret
    }
    @scala.inline
    def withTabTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTintColor")(js.undefined)
        ret
    }
  }
  
}

