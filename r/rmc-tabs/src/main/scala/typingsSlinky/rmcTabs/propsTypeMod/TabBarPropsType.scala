package typingsSlinky.rmcTabs.propsTypeMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.rmcTabsStrings.bottom
import typingsSlinky.rmcTabs.rmcTabsStrings.left
import typingsSlinky.rmcTabs.rmcTabsStrings.right
import typingsSlinky.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarPropsType extends js.Object {
  /** current active tab */
  var activeTab: Double = js.native
  /** use animate | default: true */
  var animated: Boolean = js.native
  var instanceId: Double = js.native
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  /** page size of tabbar's tab | default: 5 */
  var page: js.UndefOr[Double] = js.native
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, TagMod[Any]]] = js.native
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ CSSProperties | js.Any, TagMod[Any]]] = js.native
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  /** tabBar's position | defualt: top */
  var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.native
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  /** tabs data */
  var tabs: js.Array[TabData] = js.native
  /** call this function to switch tab */
  def goToTab(index: Double): Unit = js.native
}

object TabBarPropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): TabBarPropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarPropsType]
  }
  @scala.inline
  implicit class TabBarPropsTypeOps[Self <: TabBarPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToTab(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstanceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[TabData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
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
    def withPage(value: Double): Self = {
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
    def withRenderUnderline(value: /* style */ CSSProperties | js.Any => TagMod[Any]): Self = {
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
    def withTabBarPosition(value: top | bottom | left | right): Self = {
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
    def withTabBarTextStyle(value: CSSProperties | js.Any): Self = {
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
    def withTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = {
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
  }
  
}

