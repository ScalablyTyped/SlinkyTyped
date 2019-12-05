package typingsSlinky.rcDashTooltip.rcDashTooltipMod.RCTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcDashTooltip.rcDashTooltipStrings.hover
  - typings.rcDashTooltip.rcDashTooltipStrings.click
  - typings.rcDashTooltip.rcDashTooltipStrings.focus
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsSlinky.rcDashTooltip.rcDashTooltipStrings.click = this.cast("click")
  @scala.inline
  def focus: typingsSlinky.rcDashTooltip.rcDashTooltipStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typingsSlinky.rcDashTooltip.rcDashTooltipStrings.hover = this.cast("hover")
}

