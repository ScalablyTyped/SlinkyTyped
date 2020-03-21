package typingsSlinky.nodeZendesk.mod.JobStatuses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.queued
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.working
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.failed
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.completed
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.killed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.nodeZendesk.nodeZendeskStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typingsSlinky.nodeZendesk.nodeZendeskStrings.failed = this.cast("failed")
  @scala.inline
  def killed: typingsSlinky.nodeZendesk.nodeZendeskStrings.killed = this.cast("killed")
  @scala.inline
  def queued: typingsSlinky.nodeZendesk.nodeZendeskStrings.queued = this.cast("queued")
  @scala.inline
  def working: typingsSlinky.nodeZendesk.nodeZendeskStrings.working = this.cast("working")
}

