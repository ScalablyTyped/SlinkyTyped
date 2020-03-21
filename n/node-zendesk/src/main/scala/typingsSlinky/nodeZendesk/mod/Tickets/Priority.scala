package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.urgent
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.high
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.normal
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.low
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.nodeZendesk.nodeZendeskStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.nodeZendesk.nodeZendeskStrings.low = this.cast("low")
  @scala.inline
  def normal: typingsSlinky.nodeZendesk.nodeZendeskStrings.normal = this.cast("normal")
  @scala.inline
  def urgent: typingsSlinky.nodeZendesk.nodeZendeskStrings.urgent = this.cast("urgent")
}

