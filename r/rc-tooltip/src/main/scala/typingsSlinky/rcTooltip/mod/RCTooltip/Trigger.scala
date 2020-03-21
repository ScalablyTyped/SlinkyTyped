package typingsSlinky.rcTooltip.mod.RCTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTooltip.rcTooltipStrings.hover
  - typingsSlinky.rcTooltip.rcTooltipStrings.click
  - typingsSlinky.rcTooltip.rcTooltipStrings.focus
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsSlinky.rcTooltip.rcTooltipStrings.click = this.cast("click")
  @scala.inline
  def focus: typingsSlinky.rcTooltip.rcTooltipStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typingsSlinky.rcTooltip.rcTooltipStrings.hover = this.cast("hover")
}

