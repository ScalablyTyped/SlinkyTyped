package typingsSlinky.mobxDashTask.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobxDashTask.mobxDashTaskStrings.pending
  - typings.mobxDashTask.mobxDashTaskStrings.resolved
  - typings.mobxDashTask.mobxDashTaskStrings.rejected
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.mobxDashTask.mobxDashTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsSlinky.mobxDashTask.mobxDashTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typingsSlinky.mobxDashTask.mobxDashTaskStrings.resolved = this.cast("resolved")
}

