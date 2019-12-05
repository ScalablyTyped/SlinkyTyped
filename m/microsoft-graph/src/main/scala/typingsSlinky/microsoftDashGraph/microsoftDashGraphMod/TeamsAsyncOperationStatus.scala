package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.notStarted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.invalid
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notStarted_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inProgress
  - typings.microsoftDashGraph.microsoftDashGraphStrings.succeeded
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationStatus extends js.Object

object TeamsAsyncOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def invalid: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def succeeded: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

