package typingsSlinky.reactToastify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactToastify.reactToastifyStrings.info
  - typingsSlinky.reactToastify.reactToastifyStrings.success
  - typingsSlinky.reactToastify.reactToastifyStrings.warning
  - typingsSlinky.reactToastify.reactToastifyStrings.error
  - typingsSlinky.reactToastify.reactToastifyStrings.default
*/
trait TypeOptions extends js.Object

object TypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.reactToastify.reactToastifyStrings.default = this.cast("default")
  @scala.inline
  def error: typingsSlinky.reactToastify.reactToastifyStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactToastify.reactToastifyStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactToastify.reactToastifyStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.reactToastify.reactToastifyStrings.warning = this.cast("warning")
}

