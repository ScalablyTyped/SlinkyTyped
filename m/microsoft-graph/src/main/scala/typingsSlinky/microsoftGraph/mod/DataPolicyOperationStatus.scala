package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.running_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.running_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.complete
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait DataPolicyOperationStatus extends js.Object

object DataPolicyOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def running: running_ = this.cast("running")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

