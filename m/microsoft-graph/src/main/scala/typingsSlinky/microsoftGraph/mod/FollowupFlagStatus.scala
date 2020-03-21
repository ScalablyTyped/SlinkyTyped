package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notFlagged
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.complete
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.flagged
*/
trait FollowupFlagStatus extends js.Object

object FollowupFlagStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def flagged: typingsSlinky.microsoftGraph.microsoftGraphStrings.flagged = this.cast("flagged")
  @scala.inline
  def notFlagged: typingsSlinky.microsoftGraph.microsoftGraphStrings.notFlagged = this.cast("notFlagged")
}

