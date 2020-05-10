package typingsSlinky.reactNativeScrollableTabView.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import typingsSlinky.reactNative.mod.ScrollViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableTabViewProperties extends Props[ScrollableTabView] {
  /**
    * props that are applied to root ScrollView/ViewPagerAndroid.
    * Note that overriding defaults set by the library may break functionality; see the source for details.
    */
  var contentProps: js.UndefOr[ScrollViewProps] = js.native
  /**
    * the index of the initially selected tab, defaults to 0 === first tab
    */
  var initialPage: js.UndefOr[Double] = js.native
  /**
    * disables horizontal dragging to scroll between tabs, default is false.
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    * function to call when tab changes, should accept 1 argument which is
    * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
    * tab that is selected
    */
  var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, Unit]] = js.native
  /**
    * function to call when the pages are sliding,
    * should accept 1 argument which is an Float number representing the page position in the slide frame.
    */
  var onScroll: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * set selected tab(can be buggy see
    * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * pre-render nearby # sibling, Infinity === render all
    * the siblings, default to 0 === render current page.
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  /**
    * accept 1 argument props and should return a component
    * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
    * and should implement setAnimationValue to be able to animate itself along with the tab content.
    * You can manually pass the props to the TabBar component.
    */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ typingsSlinky.reactNativeScrollableTabView.TabBarProps, ReactElement]) | `false`
  ] = js.native
  /**
    * on tab press change tab without animation.
    */
  var scrollWithoutAnimation: js.UndefOr[Boolean] = js.native
  /**
    * style (View.propTypes.style)
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * color of the default tab bar's text when active, defaults to navy
    */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  /**
    * color of the default tab bar's background, defaults to white
    */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  /**
    * color of the default tab bar's text when inactive, defaults to black
    */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  /**
    * Defaults to "top".
    * "bottom" to position the tab bar below content.
    * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
    * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
    */
  var tabBarPosition: js.UndefOr[top | bottom | overlayTop | overlayBottom] = js.native
  /**
    * additional styles to the tab bar's text
    */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * style of the default tab bar's underline
    */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object ScrollableTabViewProperties {
  @scala.inline
  def apply(): ScrollableTabViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableTabViewProperties]
  }
  @scala.inline
  implicit class ScrollableTabViewPropertiesOps[Self <: ScrollableTabViewProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentProps(value: ScrollViewProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPage(value: Double): Self = {
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
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeTab(value: /* value */ ChangeTabProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
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
    def withRenderTabBarFunction1(value: /* props */ typingsSlinky.reactNativeScrollableTabView.TabBarProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTabBar(
      value: (js.Function1[/* props */ typingsSlinky.reactNativeScrollableTabView.TabBarProps, ReactElement]) | `false`
    ): Self = {
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
    def withScrollWithoutAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWithoutAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWithoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWithoutAnimation")(js.undefined)
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
    def withTabBarPosition(value: top | bottom | overlayTop | overlayBottom): Self = {
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

