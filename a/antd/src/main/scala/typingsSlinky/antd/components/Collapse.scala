package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.collapseCollapseMod.CollapseProps
import typingsSlinky.antd.collapseCollapseMod.ExpandIconPosition
import typingsSlinky.antd.collapseCollapseMod.PanelProps
import typingsSlinky.antd.collapsePanelMod.CollapsePanelProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  object Panel {
    
    @JSImport("antd", "Collapse.Panel")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps_1625560543 = new SharedBuilder_CollapsePanelProps_1625560543(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps_1625560543 = new SharedBuilder_CollapsePanelProps_1625560543(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKey(value: (js.Array[String | Double]) | String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKeyVarargs(value: (String | Double)*): this.type = set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: (js.Array[String | Double]) | String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKeyVarargs(value: (String | Double)*): this.type = set("defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: /* panelProps */ PanelProps => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandIconPosition(value: ExpandIconPosition): this.type = set("expandIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* key */ String | js.Array[String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
