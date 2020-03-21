package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.success
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failure
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.timeout
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait OperationResult extends js.Object

object OperationResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsSlinky.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def success: typingsSlinky.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def timeout: typingsSlinky.microsoftGraph.microsoftGraphStrings.timeout = this.cast("timeout")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

