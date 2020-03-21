package typingsSlinky.reactNativeScrollableTabView.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.TabBarPropsDefaultTabBarP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultTabBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeScrollableTabView.mod.DefaultTabBar] {
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeTab: Int | Double = null,
    activeTextColor: String = null,
    backgroundColor: String = null,
    containerWidth: Int | Double = null,
    goToPage: /* pageNumber */ Double => Unit = null,
    inactiveTextColor: String = null,
    renderTab: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => ReactElement = null,
    scrollValue: Value = null,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    tabs: js.Array[ReactElement] = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeScrollableTabView.mod.DefaultTabBar] = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5(renderTab))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeScrollableTabView.mod.DefaultTabBar] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeScrollableTabView.mod.DefaultTabBar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabBarPropsDefaultTabBarP
}

