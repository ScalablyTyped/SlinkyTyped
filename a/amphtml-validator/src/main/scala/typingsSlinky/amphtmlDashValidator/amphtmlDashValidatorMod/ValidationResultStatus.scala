package typingsSlinky.amphtmlDashValidator.amphtmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.PASS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.FAIL
*/
trait ValidationResultStatus extends js.Object

object ValidationResultStatus {
  @scala.inline
  def FAIL: typingsSlinky.amphtmlDashValidator.amphtmlDashValidatorStrings.FAIL = this.cast("FAIL")
  @scala.inline
  def PASS: typingsSlinky.amphtmlDashValidator.amphtmlDashValidatorStrings.PASS = this.cast("PASS")
  @scala.inline
  def UNKNOWN: typingsSlinky.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

