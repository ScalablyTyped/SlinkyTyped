package typingsSlinky.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactReduxToastr.reactReduxToastrStrings.success
  - typingsSlinky.reactReduxToastr.reactReduxToastrStrings.info
  - typingsSlinky.reactReduxToastr.reactReduxToastrStrings.warning
  - typingsSlinky.reactReduxToastr.reactReduxToastrStrings.error
*/
trait iconType extends js.Object

object iconType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.reactReduxToastr.reactReduxToastrStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactReduxToastr.reactReduxToastrStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactReduxToastr.reactReduxToastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.reactReduxToastr.reactReduxToastrStrings.warning = this.cast("warning")
}

