package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.`new`
  - typings.nodeDashZendesk.nodeDashZendeskStrings.open
  - typings.nodeDashZendesk.nodeDashZendeskStrings.pending
  - typings.nodeDashZendesk.nodeDashZendeskStrings.hold
  - typings.nodeDashZendesk.nodeDashZendeskStrings.solved
  - typings.nodeDashZendesk.nodeDashZendeskStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.closed = this.cast("closed")
  @scala.inline
  def hold: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.hold = this.cast("hold")
  @scala.inline
  def `new`: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.`new` = this.cast("new")
  @scala.inline
  def open: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.open = this.cast("open")
  @scala.inline
  def pending: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.pending = this.cast("pending")
  @scala.inline
  def solved: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.solved = this.cast("solved")
}

