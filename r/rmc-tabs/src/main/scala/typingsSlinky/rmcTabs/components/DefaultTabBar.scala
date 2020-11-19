package typingsSlinky.rmcTabs.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcTabs.defaultTabBarMod.PropsType
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.rmcTabsStrings.bottom
import typingsSlinky.rmcTabs.rmcTabsStrings.left
import typingsSlinky.rmcTabs.rmcTabsStrings.right
import typingsSlinky.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultTabBar {
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rmcTabs.mod.DefaultTabBar] {
    
    @scala.inline
    def onTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): this.type = set("onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTab(value: /* tab */ TabData => ReactElement): this.type = set("renderTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderUnderline(value: /* style */ CSSProperties | js.Any => ReactElement): this.type = set("renderUnderline", js.Any.fromFunction1(value))
    
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
