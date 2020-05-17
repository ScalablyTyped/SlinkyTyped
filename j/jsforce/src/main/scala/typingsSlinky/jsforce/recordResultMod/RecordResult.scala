package typingsSlinky.jsforce.recordResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsforce.recordResultMod.SuccessResult
  - typingsSlinky.jsforce.recordResultMod.ErrorResult
*/
trait RecordResult extends js.Object

object RecordResult {
  @scala.inline
  implicit def apply(value: ErrorResult): RecordResult = value.asInstanceOf[RecordResult]
  @scala.inline
  implicit def apply(value: SuccessResult): RecordResult = value.asInstanceOf[RecordResult]
}

