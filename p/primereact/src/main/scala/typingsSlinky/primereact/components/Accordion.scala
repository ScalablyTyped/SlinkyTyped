package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.accordionMod.AccordionProps
import typingsSlinky.primereact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("primereact/accordion", "Accordion")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.mod.Accordion] {
    
    @scala.inline
    def activeIndex(value: js.Any): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapseIcon(value: String): this.type = set("collapseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: String): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTabChange(value: /* e */ Index => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTabClose(value: /* e */ Index => Unit): this.type = set("onTabClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTabOpen(value: /* e */ Index => Unit): this.type = set("onTabOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
