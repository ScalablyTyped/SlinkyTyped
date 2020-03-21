package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.success
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failure
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplied
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConditionalAccessStatus extends js.Object

object ConditionalAccessStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsSlinky.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def success: typingsSlinky.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

