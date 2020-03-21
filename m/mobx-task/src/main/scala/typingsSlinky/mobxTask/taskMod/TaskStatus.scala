package typingsSlinky.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobxTask.mobxTaskStrings.pending
  - typingsSlinky.mobxTask.mobxTaskStrings.resolved
  - typingsSlinky.mobxTask.mobxTaskStrings.rejected
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsSlinky.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typingsSlinky.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
}

