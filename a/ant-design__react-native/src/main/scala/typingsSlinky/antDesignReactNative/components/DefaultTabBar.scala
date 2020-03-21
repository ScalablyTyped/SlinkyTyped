package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.left
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.right
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.defaultTabBarMod.PropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.antDesignReactNative.tabsStyleMod.TabBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultTabBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antDesignReactNative.defaultTabBarMod.DefaultTabBar] {
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData],
    dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: Int | Double = null,
    renderTab: /* tab */ TabData => TagMod[Any] = null,
    renderUnderline: /* style */ js.Any => TagMod[Any] = null,
    scrollValue: js.Any = null,
    styles: Partial[TabBarStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antDesignReactNative.defaultTabBarMod.DefaultTabBar] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicTabUnderlineWidth)) __obj.updateDynamic("dynamicTabUnderlineWidth")(dynamicTabUnderlineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

