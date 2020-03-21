package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.problem
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.incident
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.question
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.task
*/
trait TicketType extends js.Object

object TicketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incident: typingsSlinky.nodeZendesk.nodeZendeskStrings.incident = this.cast("incident")
  @scala.inline
  def problem: typingsSlinky.nodeZendesk.nodeZendeskStrings.problem = this.cast("problem")
  @scala.inline
  def question: typingsSlinky.nodeZendesk.nodeZendeskStrings.question = this.cast("question")
  @scala.inline
  def task: typingsSlinky.nodeZendesk.nodeZendeskStrings.task = this.cast("task")
}

