package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.success
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failure
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplied
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notEnabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AppliedConditionalAccessPolicyResult extends js.Object

object AppliedConditionalAccessPolicyResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsSlinky.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def notEnabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.notEnabled = this.cast("notEnabled")
  @scala.inline
  def success: typingsSlinky.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

