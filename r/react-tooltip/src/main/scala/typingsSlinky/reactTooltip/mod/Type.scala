package typingsSlinky.reactTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTooltip.reactTooltipStrings.dark
  - typingsSlinky.reactTooltip.reactTooltipStrings.success
  - typingsSlinky.reactTooltip.reactTooltipStrings.warning
  - typingsSlinky.reactTooltip.reactTooltipStrings.error
  - typingsSlinky.reactTooltip.reactTooltipStrings.info
  - typingsSlinky.reactTooltip.reactTooltipStrings.light
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.reactTooltip.reactTooltipStrings.dark = this.cast("dark")
  @scala.inline
  def error: typingsSlinky.reactTooltip.reactTooltipStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactTooltip.reactTooltipStrings.info = this.cast("info")
  @scala.inline
  def light: typingsSlinky.reactTooltip.reactTooltipStrings.light = this.cast("light")
  @scala.inline
  def success: typingsSlinky.reactTooltip.reactTooltipStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.reactTooltip.reactTooltipStrings.warning = this.cast("warning")
}

