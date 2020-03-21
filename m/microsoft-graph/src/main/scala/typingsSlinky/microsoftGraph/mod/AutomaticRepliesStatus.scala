package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysEnabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.scheduled
*/
trait AutomaticRepliesStatus extends js.Object

object AutomaticRepliesStatus {
  @scala.inline
  def alwaysEnabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysEnabled = this.cast("alwaysEnabled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def scheduled: typingsSlinky.microsoftGraph.microsoftGraphStrings.scheduled = this.cast("scheduled")
}

