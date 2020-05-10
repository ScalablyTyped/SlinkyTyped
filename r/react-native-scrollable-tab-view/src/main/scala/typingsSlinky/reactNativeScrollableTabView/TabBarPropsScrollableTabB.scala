package typingsSlinky.reactNativeScrollableTabView

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.mod.RenderTabProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.ScrollableTabBarProps> */
@js.native
trait TabBarPropsScrollableTabB extends js.Object {
  var activeTab: js.UndefOr[Double] = js.native
  var activeTextColor: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var containerWidth: js.UndefOr[Double] = js.native
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  var inactiveTextColor: js.UndefOr[String] = js.native
  var renderTab: js.UndefOr[RenderTabProperties] = js.native
  var scrollOffset: js.UndefOr[Double] = js.native
  var scrollValue: js.UndefOr[Value] = js.native
  var style: js.UndefOr[ViewStyle] = js.native
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  var tabs: js.UndefOr[js.Array[ReactElement]] = js.native
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
  var underlineStyle: js.UndefOr[ViewStyle] = js.native
}

object TabBarPropsScrollableTabB {
  @scala.inline
  def apply(): TabBarPropsScrollableTabB = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarPropsScrollableTabB]
  }
  @scala.inline
  implicit class TabBarPropsScrollableTabBOps[Self <: TabBarPropsScrollableTabB] (val x: Self) extends AnyVal {
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
    def withoutActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToPage(value: /* pageNumber */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPage")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTab")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRenderTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTab")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
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
    def withTabStyle(value: ViewStyle): Self = {
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
    def withTabs(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsContainerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(js.undefined)
        ret
    }
  }
  
}

