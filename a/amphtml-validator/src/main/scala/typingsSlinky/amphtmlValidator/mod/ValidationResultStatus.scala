package typingsSlinky.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.PASS
  - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.FAIL
*/
trait ValidationResultStatus extends js.Object

object ValidationResultStatus {
  @scala.inline
  def FAIL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.FAIL = this.cast("FAIL")
  @scala.inline
  def PASS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.PASS = this.cast("PASS")
  @scala.inline
  def UNKNOWN: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

