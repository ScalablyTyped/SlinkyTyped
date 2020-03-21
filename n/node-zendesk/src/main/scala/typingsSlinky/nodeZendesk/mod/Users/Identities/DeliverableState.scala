package typingsSlinky.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.deliverable
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.undeliverable
*/
trait DeliverableState extends js.Object

object DeliverableState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deliverable: typingsSlinky.nodeZendesk.nodeZendeskStrings.deliverable = this.cast("deliverable")
  @scala.inline
  def undeliverable: typingsSlinky.nodeZendesk.nodeZendeskStrings.undeliverable = this.cast("undeliverable")
}

