package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonBaseFontSize
import typingsSlinky.cathoQuantum.AnonContent
import typingsSlinky.cathoQuantum.accordionMod.AccordionProps
import typingsSlinky.cathoQuantum.accordionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  @JSImport("@catho/quantum/Accordion", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def keepOnlyOneOpen(value: Boolean): this.type = set("keepOnlyOneOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: AnonBaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[AnonContent]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AccordionProps]))
  }
}

