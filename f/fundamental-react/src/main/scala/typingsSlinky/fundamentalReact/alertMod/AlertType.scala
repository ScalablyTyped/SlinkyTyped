package typingsSlinky.fundamentalReact.alertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.warning
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.error
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.success
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.information
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def information: typingsSlinky.fundamentalReact.fundamentalReactStrings.information = this.cast("information")
  @scala.inline
  def success: typingsSlinky.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

