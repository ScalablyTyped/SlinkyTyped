package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonExpanded
import typingsSlinky.baseui.SharedPropsexpandednever
import typingsSlinky.baseui.accordionMod.AccordionOverrides
import typingsSlinky.baseui.accordionMod.AccordionProps
import typingsSlinky.baseui.accordionMod.AccordionState
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  object component extends js.Object
  
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
    def onChange(value: /* args */ AnonExpanded => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: AccordionOverrides[SharedPropsexpandednever]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

