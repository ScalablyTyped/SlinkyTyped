package typingsSlinky.rcCollapse.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcCollapse.anon.CollapsePanelPropschildre
import typingsSlinky.rcCollapse.interfaceMod.CollapsibleType
import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelContent {
  
  @JSImport("rc-collapse/es/PanelContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsible(value: CollapsibleType): this.type = set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: /* props */ js.Object => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def extra(value: String | ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: String | ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerClass(value: String): this.type = set("headerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onItemClick(value: /* panelKey */ String | Double => Unit): this.type = set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def openMotion(value: CSSMotionProps): this.type = set("openMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelKey(value: String | Double): this.type = set("panelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PanelContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsePanelPropschildre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
