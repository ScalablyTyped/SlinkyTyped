package typingsSlinky.mobxTask.taskGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobxTask.mobxTaskStrings.state
  - typingsSlinky.mobxTask.mobxTaskStrings.pending
  - typingsSlinky.mobxTask.mobxTaskStrings.resolved
  - typingsSlinky.mobxTask.mobxTaskStrings.rejected
  - typingsSlinky.mobxTask.mobxTaskStrings.result
  - typingsSlinky.mobxTask.mobxTaskStrings.error
  - typingsSlinky.mobxTask.mobxTaskStrings.`match`
*/
trait QueryableMethods extends js.Object

object QueryableMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.mobxTask.mobxTaskStrings.error = this.cast("error")
  @scala.inline
  def `match`: typingsSlinky.mobxTask.mobxTaskStrings.`match` = this.cast("match")
  @scala.inline
  def pending: typingsSlinky.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsSlinky.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typingsSlinky.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
  @scala.inline
  def result: typingsSlinky.mobxTask.mobxTaskStrings.result = this.cast("result")
  @scala.inline
  def state: typingsSlinky.mobxTask.mobxTaskStrings.state = this.cast("state")
}

