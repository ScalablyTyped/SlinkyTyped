package typingsSlinky.rmcTabs.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.propsTypeMod.TabBarPropsType
import typingsSlinky.rmcTabs.rmcTabsBooleans.`false`
import typingsSlinky.rmcTabs.rmcTabsStrings.bottom
import typingsSlinky.rmcTabs.rmcTabsStrings.horizontal
import typingsSlinky.rmcTabs.rmcTabsStrings.left
import typingsSlinky.rmcTabs.rmcTabsStrings.right
import typingsSlinky.rmcTabs.rmcTabsStrings.top
import typingsSlinky.rmcTabs.rmcTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-tabs.rmc-tabs/lib/Tabs.PropsType> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  val animated: js.UndefOr[Boolean] = js.native
  val children: js.UndefOr[TagMod[Any]] = js.native
  val destroyInactiveTab: js.UndefOr[Boolean] = js.native
  val distanceToChangeTab: js.UndefOr[Double] = js.native
  val initialPage: js.UndefOr[Double | String] = js.native
  val noRenderContent: js.UndefOr[Boolean] = js.native
  val onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  val onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  val page: js.UndefOr[Double | String] = js.native
  val prefixCls: js.UndefOr[String] = js.native
  val prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  val renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, TagMod[Any]]) | `false`] = js.native
  val swipeable: js.UndefOr[Boolean] = js.native
  val tabBarActiveTextColor: js.UndefOr[String] = js.native
  val tabBarBackgroundColor: js.UndefOr[String] = js.native
  val tabBarInactiveTextColor: js.UndefOr[String] = js.native
  val tabBarPosition: js.UndefOr[top | bottom | left | right] = js.native
  val tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  val tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  val tabDirection: js.UndefOr[horizontal | vertical] = js.native
  val tabs: js.Array[TabData] = js.native
  val useLeftInsteadTransform: js.UndefOr[Boolean] = js.native
  val useOnPan: js.UndefOr[Boolean] = js.native
  val usePaged: js.UndefOr[Boolean] = js.native
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(tabs: js.Array[TabData]): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  @scala.inline
  implicit class ReadonlychildrenReactNodeOps[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
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

