package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

object DefaultTabBar {
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.defaultTabBarMod.DefaultTabBar] {
    @scala.inline
    def dynamicTabUnderlineWidth(value: Boolean): this.type = set("dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardShouldPersistTaps(value: Boolean): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): this.type = set("onTabClick", js.Any.fromFunction2(value))
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def renderTab(value: /* tab */ TabData => ReactElement): this.type = set("renderTab", js.Any.fromFunction1(value))
    @scala.inline
    def renderUnderline(value: /* style */ js.Any => ReactElement): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    @scala.inline
    def scrollValue(value: js.Any): this.type = set("scrollValue", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: Partial[TabBarStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarPosition(value: top | bottom | left | right): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    @scala.inline
    def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    @scala.inline
    def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabsContainerStyle(value: ViewStyle): this.type = set("tabsContainerStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): Builder = {
    val __props = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
}

