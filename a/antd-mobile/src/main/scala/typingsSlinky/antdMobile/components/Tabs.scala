package typingsSlinky.antdMobile.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.tabsMod.default
import typingsSlinky.antdMobile.tabsPropsTypeMod.TabsProps
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

object Tabs {
  @JSImport("antd-mobile/lib/tabs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyInactiveTab(value: Boolean): this.type = set("destroyInactiveTab", value.asInstanceOf[js.Any])
    @scala.inline
    def distanceToChangeTab(value: Double): this.type = set("distanceToChangeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def initialPage(value: Double | String): this.type = set("initialPage", value.asInstanceOf[js.Any])
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
    def renderTab(value: /* tab */ TabData => TagMod[Any]): this.type = set("renderTab", js.Any.fromFunction1(value))
    @scala.inline
    def renderTabBarFunction1(value: /* props */ TabBarPropsType => TagMod[Any]): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    @scala.inline
    def renderTabBar(value: (js.Function1[/* props */ TabBarPropsType, TagMod[Any]]) | `false`): this.type = set("renderTabBar", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarPosition(value: top | bottom | left | right): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarTextStyle(value: CSSProperties | js.Any): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarUnderlineStyle(value: CSSProperties | js.Any): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
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

