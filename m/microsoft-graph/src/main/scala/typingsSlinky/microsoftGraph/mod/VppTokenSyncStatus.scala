package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.completed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.completed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
*/
trait VppTokenSyncStatus extends js.Object

object VppTokenSyncStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: completed_ = this.cast("completed")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def none: none_ = this.cast("none")
}

