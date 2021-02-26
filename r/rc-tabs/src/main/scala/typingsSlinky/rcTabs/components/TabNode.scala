package typingsSlinky.rcTabs.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.Tab
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.tabNodeMod.TabNodeProps
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNode {
  
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    onFocus: SyntheticFocusEvent[Element] => Unit,
    onRemove: () => Unit,
    prefixCls: String,
    rtl: Boolean,
    tab: Tab,
    tabPosition: TabPosition
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), onRemove = js.Any.fromFunction0(onRemove), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNodeProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): this.type = set("onResize", js.Any.fromFunction4(value))
    
    @scala.inline
    def removeAriaLabel(value: String): this.type = set("removeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderWrapper(value: /* node */ ReactElement => ReactElement): this.type = set("renderWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabNodeProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
