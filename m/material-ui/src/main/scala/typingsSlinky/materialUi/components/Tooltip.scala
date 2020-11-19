package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typingsSlinky.materialUi.MaterialUI.propTypes.vertical
import typingsSlinky.materialUi.tooltipMod.TooltipProps
import typingsSlinky.materialUi.tooltipMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalPosition(value: tooltipHorizontal): this.type = set("horizontalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalPosition(value: vertical): this.type = set("verticalPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(label: js.Any): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
}
