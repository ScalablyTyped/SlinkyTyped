package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.accordionMod.AccordionOverrides
import typingsSlinky.baseui.accordionMod.PanelOverrides
import typingsSlinky.baseui.accordionMod.SharedProps
import typingsSlinky.baseui.accordionMod.StatelessAccordionProps
import typingsSlinky.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatelessAccordion {
  
  @scala.inline
  def apply(expanded: js.Array[Key]): Builder = {
    val __props = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatelessAccordionProps]))
  }
  
  @JSImport("baseui/accordion", "StatelessAccordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* args */ typingsSlinky.baseui.anon.Key => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: AccordionOverrides[SharedProps] with PanelOverrides[SharedProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatelessAccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
