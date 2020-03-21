package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.`new`
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.open
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.pending
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.hold
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.solved
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.nodeZendesk.nodeZendeskStrings.closed = this.cast("closed")
  @scala.inline
  def hold: typingsSlinky.nodeZendesk.nodeZendeskStrings.hold = this.cast("hold")
  @scala.inline
  def `new`: typingsSlinky.nodeZendesk.nodeZendeskStrings.`new` = this.cast("new")
  @scala.inline
  def open: typingsSlinky.nodeZendesk.nodeZendeskStrings.open = this.cast("open")
  @scala.inline
  def pending: typingsSlinky.nodeZendesk.nodeZendeskStrings.pending = this.cast("pending")
  @scala.inline
  def solved: typingsSlinky.nodeZendesk.nodeZendeskStrings.solved = this.cast("solved")
}

