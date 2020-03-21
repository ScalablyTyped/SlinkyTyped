package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.invalid
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.succeeded
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationStatus extends js.Object

object TeamsAsyncOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def invalid: typingsSlinky.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def succeeded: typingsSlinky.microsoftGraph.microsoftGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

