package typingsSlinky.rmcTooltip.components

import typingsSlinky.rmcTooltip.tooltipMod.ITooltipProps
import typingsSlinky.rmcTooltip.tooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("rmc-tooltip/lib/Tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ITooltipProps): SharedBuilder_ITooltipProps_1631586751[default] = new SharedBuilder_ITooltipProps_1631586751[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): SharedBuilder_ITooltipProps_1631586751[default] = new SharedBuilder_ITooltipProps_1631586751[default](js.Array(this.component, js.Dictionary.empty))()
}

