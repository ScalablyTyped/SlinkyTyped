package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactElemental.reactElementalStrings.info
  - typingsSlinky.reactElemental.reactElementalStrings.success
  - typingsSlinky.reactElemental.reactElementalStrings.warn
  - typingsSlinky.reactElemental.reactElementalStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.reactElemental.reactElementalStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactElemental.reactElementalStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactElemental.reactElementalStrings.success = this.cast("success")
  @scala.inline
  def warn: typingsSlinky.reactElemental.reactElementalStrings.warn = this.cast("warn")
}

