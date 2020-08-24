package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsSlinky.antDesignReactNative.styleTabsMod.TabsStyle
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.antDesignReactNative.tabsTabsMod.TabsProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  @JSImport("@ant-design/react-native", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Tabs] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyInactiveTab(value: Boolean): this.type = set("destroyInactiveTab", value.asInstanceOf[js.Any])
    @scala.inline
    def distanceToChangeTab(value: Double): this.type = set("distanceToChangeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def initialPage(value: Double | String): this.type = set("initialPage", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardShouldPersistTaps(value: Boolean): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def noRenderContent(value: Boolean): this.type = set("noRenderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: (/* tab */ TabData, /* index */ Double) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): this.type = set("onTabClick", js.Any.fromFunction2(value))
    @scala.inline
    def page(value: Double | String): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def prerenderingSiblingsNumber(value: Double): this.type = set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def renderTab(value: /* tab */ TabData => ReactElement): this.type = set("renderTab", js.Any.fromFunction1(value))
    @scala.inline
    def renderTabBarFunction1(value: /* props */ TabBarPropsType => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    @scala.inline
    def renderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactElement]) | `false`): this.type = set("renderTabBar", value.asInstanceOf[js.Any])
    @scala.inline
    def renderUnderline(value: /* style */ js.Any => ReactElement): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Partial[TabsStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    @scala.inline
    def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    @scala.inline
    def tabDirection(value: horizontal | vertical): this.type = set("tabDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def useLeftInsteadTransform(value: Boolean): this.type = set("useLeftInsteadTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def useOnPan(value: Boolean): this.type = set("useOnPan", value.asInstanceOf[js.Any])
    @scala.inline
    def usePaged(value: Boolean): this.type = set("usePaged", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tabs: js.Array[TabData]): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
}

