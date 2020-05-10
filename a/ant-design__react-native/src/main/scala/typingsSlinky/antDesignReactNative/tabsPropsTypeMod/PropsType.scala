package typingsSlinky.antDesignReactNative.tabsPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[Boolean] = js.native
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[Boolean] = js.native
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[Double] = js.native
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[Double | String] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[Boolean] = js.native
  /** callback when tab is switched */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  /** current tab, index or key */
  var page: js.UndefOr[Double | String] = js.native
  /**
    * pre-render nearby # sibling, Infinity: render all the siblings, 0: render
    * current page | default: 1
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, TagMod[Any]]] = js.native
  /** render for TabBar */
  var renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, TagMod[Any]]) | `false`] = js.native
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, TagMod[Any]]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * whether to switch tabs with swipe gestrue in the content | default: true
    */
  var swipeable: js.UndefOr[Boolean] = js.native
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[horizontal | vertical] = js.native
  /** tabs data */
  var tabs: js.Array[TabData] = js.native
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[Boolean] = js.native
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[Boolean] = js.native
  /** use paged | default: true */
  var usePaged: js.UndefOr[Boolean] = js.native
}

object PropsType {
  @scala.inline
  def apply(tabs: js.Array[TabData]): PropsType = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabs(value: js.Array[TabData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyInactiveTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyInactiveTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyInactiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyInactiveTab")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceToChangeTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToChangeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceToChangeTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToChangeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPage(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShouldPersistTaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShouldPersistTaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRenderContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRenderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTabClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerenderingSiblingsNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerenderingSiblingsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerenderingSiblingsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerenderingSiblingsNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTab(value: /* tab */ TabData => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTab")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTabBarFunction1(value: /* props */ TabBarPropsType => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, TagMod[Any]]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderUnderline(value: /* style */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderUnderline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderUnderline")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarActiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarActiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarActiveTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarActiveTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarInactiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarInactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarInactiveTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarInactiveTextColor")(js.undefined)
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
    def withTabBarTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTextStyle")(null)
        ret
    }
    @scala.inline
    def withTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarUnderlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarUnderlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarUnderlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarUnderlineStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarUnderlineStyle")(null)
        ret
    }
    @scala.inline
    def withTabDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLeftInsteadTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLeftInsteadTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLeftInsteadTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLeftInsteadTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOnPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOnPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnPan")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePaged")(js.undefined)
        ret
    }
  }
  
}

