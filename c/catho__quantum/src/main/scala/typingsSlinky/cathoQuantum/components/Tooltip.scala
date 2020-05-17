package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.bottom
import typingsSlinky.cathoQuantum.cathoQuantumStrings.left
import typingsSlinky.cathoQuantum.cathoQuantumStrings.right
import typingsSlinky.cathoQuantum.cathoQuantumStrings.top
import typingsSlinky.cathoQuantum.tooltipMod.TooltipProps
import typingsSlinky.cathoQuantum.tooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("@catho/quantum/Tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def placement(value: top | right | bottom | left): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BaseFontSizeColors): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
}

