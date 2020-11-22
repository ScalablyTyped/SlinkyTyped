package typingsSlinky.rcTabs.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTabs.anon.Direction
import typingsSlinky.rcTabs.interfaceMod.AnimatedConfig
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.TabBarExtraContent
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.rcTabs.tabNavListMod.TabNavListProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNavList {
  
  @JSImport("rc-tabs/es/TabNavList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def animated(value: AnimatedConfig): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: /* node */ ReactElement => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: TabBarExtraContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIconReactElement(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIcon(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTabScroll(value: /* info */ Direction => Unit): this.type = set("onTabScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def panes(value: ReactElement): this.type = set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTabBar(value: (/* props */ js.Any, /* DefaultTabBar */ ReactComponentClass[js.Object]) => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabNavListProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (Key, SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit,
    rtl: Boolean,
    tabPosition: TabPosition
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2(onTabClick), rtl = rtl.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNavListProps with RefAttributes[HTMLDivElement]]))
  }
}
