package typingsSlinky.antvG2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antvG2.mod.HtmlTooltipConfig
  - typingsSlinky.antvG2.mod.CanvasTooltipConfig
  - typingsSlinky.antvG2.mod.MiniTooltipConfig
*/
trait TooltipConfig extends js.Object

object TooltipConfig {
  @scala.inline
  implicit def apply(value: CanvasTooltipConfig): TooltipConfig = value.asInstanceOf[TooltipConfig]
  @scala.inline
  implicit def apply(value: HtmlTooltipConfig): TooltipConfig = value.asInstanceOf[TooltipConfig]
  @scala.inline
  implicit def apply(value: MiniTooltipConfig): TooltipConfig = value.asInstanceOf[TooltipConfig]
}

