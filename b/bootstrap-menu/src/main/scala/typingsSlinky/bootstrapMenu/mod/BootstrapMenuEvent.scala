package typingsSlinky.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bootstrapMenu.bootstrapMenuStrings.click
  - typingsSlinky.bootstrapMenu.bootstrapMenuStrings.`right-click`
  - typingsSlinky.bootstrapMenu.bootstrapMenuStrings.hover
*/
trait BootstrapMenuEvent extends js.Object

object BootstrapMenuEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsSlinky.bootstrapMenu.bootstrapMenuStrings.click = this.cast("click")
  @scala.inline
  def hover: typingsSlinky.bootstrapMenu.bootstrapMenuStrings.hover = this.cast("hover")
  @scala.inline
  def `right-click`: typingsSlinky.bootstrapMenu.bootstrapMenuStrings.`right-click` = this.cast("right-click")
}

