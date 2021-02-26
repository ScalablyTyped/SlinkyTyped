package typingsSlinky.nivoTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoTooltip.chipMod.ChipProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chip {
  
  @scala.inline
  def apply(color: String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChipProps]))
  }
  
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
