package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.accordionMod.AccordionTabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccordionTab {
  
  @JSImport("primereact/accordion", "AccordionTab")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.mod.AccordionTab] {
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerTemplate(value: js.Any): this.type = set("headerTemplate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionTabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AccordionTab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
