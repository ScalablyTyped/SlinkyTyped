package typingsSlinky.reactDashAlert.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashAlert.reactDashAlertStrings.info
  - typings.reactDashAlert.reactDashAlertStrings.success
  - typings.reactDashAlert.reactDashAlertStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.reactDashAlert.reactDashAlertStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactDashAlert.reactDashAlertStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactDashAlert.reactDashAlertStrings.success = this.cast("success")
}

