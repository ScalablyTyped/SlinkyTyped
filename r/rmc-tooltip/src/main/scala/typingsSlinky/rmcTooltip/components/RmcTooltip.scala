package typingsSlinky.rmcTooltip.components

import typingsSlinky.rmcTooltip.mod.default
import typingsSlinky.rmcTooltip.tooltipMod.ITooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcTooltip {
  
  @JSImport("rmc-tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ITooltipProps): SharedBuilder_ITooltipProps_1631586751[default] = new SharedBuilder_ITooltipProps_1631586751[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RmcTooltip.type): SharedBuilder_ITooltipProps_1631586751[default] = new SharedBuilder_ITooltipProps_1631586751[default](js.Array(this.component, js.Dictionary.empty))()
}
