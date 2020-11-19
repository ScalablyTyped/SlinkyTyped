package typingsSlinky.rcTabs.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.Tab
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.rcTabs.operationNodeMod.OperationNodeProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationNode {
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIconReactElement(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIcon(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OperationNodeProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (Key, SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit,
    prefixCls: String,
    rtl: Boolean,
    tabs: js.Array[Tab]
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2(onTabClick), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationNodeProps with RefAttributes[HTMLDivElement]]))
  }
}
