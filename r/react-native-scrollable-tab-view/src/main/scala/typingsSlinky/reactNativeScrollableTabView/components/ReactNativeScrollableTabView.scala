package typingsSlinky.reactNativeScrollableTabView.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ScrollViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.TabBarProps
import typingsSlinky.reactNativeScrollableTabView.mod.ChangeTabProperties
import typingsSlinky.reactNativeScrollableTabView.mod.ScrollableTabViewProperties
import typingsSlinky.reactNativeScrollableTabView.mod.default
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeScrollableTabView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    contentProps: ScrollViewProps = null,
    initialPage: Int | Double = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    onChangeTab: /* value */ ChangeTabProperties => Unit = null,
    onScroll: /* value */ Double => Unit = null,
    page: Int | Double = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTabBar: (js.Function1[/* props */ TabBarProps, ReactElement]) | `false` = null,
    scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | overlayTop | overlayBottom = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (onChangeTab != null) __obj.updateDynamic("onChangeTab")(js.Any.fromFunction1(onChangeTab))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWithoutAnimation)) __obj.updateDynamic("scrollWithoutAnimation")(scrollWithoutAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeScrollableTabView.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollableTabViewProperties
}

