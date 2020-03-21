package typingsSlinky.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ERROR
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING
*/
trait ValidationErrorSeverity extends js.Object

object ValidationErrorSeverity {
  @scala.inline
  def ERROR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def UNKNOWN_SEVERITY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY = this.cast("UNKNOWN_SEVERITY")
  @scala.inline
  def WARNING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

