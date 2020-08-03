package typingsSlinky.rcTooltip.components

import typingsSlinky.rcTooltip.tooltipMod.TooltipProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("rc-tooltip/es/Tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TooltipProps with RefAttributes[js.Any]): SharedBuilder_TooltipPropsRefAttributes518144613[js.Any with js.Object] = new SharedBuilder_TooltipPropsRefAttributes518144613[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): SharedBuilder_TooltipPropsRefAttributes518144613[js.Any with js.Object] = new SharedBuilder_TooltipPropsRefAttributes518144613[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

