package typingsSlinky.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAlert.reactAlertStrings.info
  - typingsSlinky.reactAlert.reactAlertStrings.success
  - typingsSlinky.reactAlert.reactAlertStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.reactAlert.reactAlertStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactAlert.reactAlertStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactAlert.reactAlertStrings.success = this.cast("success")
}

