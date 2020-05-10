package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimated extends js.Object {
  var activeTab: Double = js.native
  var animated: Boolean = js.native
  var goToTab: js.Any = js.native
  var instanceId: Double = js.native
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, TagMod[Any]]] = js.native
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, TagMod[Any]]] = js.native
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  var tabBarTextStyle: StyleProp[TextStyle] = js.native
  var tabBarUnderlineStyle: StyleProp[ViewStyle] = js.native
  var tabs: js.Array[TabData] = js.native
}

object AnonAnimated {
  @scala.inline
  def apply(activeTab: Double, animated: Boolean, goToTab: js.Any, instanceId: Double, tabs: js.Array[TabData]): AnonAnimated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimated]
  }
  @scala.inline
  implicit class AnonAnimatedOps[Self <: AnonAnimated] (val x: Self) extends AnyVal {
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
    def withGoToTab(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToTab")(value.asInstanceOf[js.Any])
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
  }
  
}

