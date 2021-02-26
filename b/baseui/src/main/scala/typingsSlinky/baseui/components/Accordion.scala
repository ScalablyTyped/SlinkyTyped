package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.accordionMod.AccordionOverrides
import typingsSlinky.baseui.accordionMod.AccordionProps
import typingsSlinky.baseui.accordionMod.AccordionState
import typingsSlinky.baseui.accordionMod.SharedProps
import typingsSlinky.baseui.anon.Expanded
import typingsSlinky.baseui.baseuiStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.Accordion] {
    
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: AccordionState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* args */ Expanded => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: AccordionOverrides[SharedProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
