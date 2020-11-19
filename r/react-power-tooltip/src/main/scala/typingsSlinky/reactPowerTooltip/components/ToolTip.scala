package typingsSlinky.reactPowerTooltip.components

import typingsSlinky.reactPowerTooltip.toolTipMod.TooltipProps
import typingsSlinky.reactPowerTooltip.toolTipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolTip {
  
  @JSImport("react-power-tooltip/ToolTip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TooltipProps): SharedBuilder_TooltipProps2145162140[default] = new SharedBuilder_TooltipProps2145162140[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(show: Boolean): SharedBuilder_TooltipProps2145162140[default] = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new SharedBuilder_TooltipProps2145162140[default](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
}
