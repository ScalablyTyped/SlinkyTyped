package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.problem
  - typings.nodeDashZendesk.nodeDashZendeskStrings.incident
  - typings.nodeDashZendesk.nodeDashZendeskStrings.question
  - typings.nodeDashZendesk.nodeDashZendeskStrings.task
*/
trait TicketType extends js.Object

object TicketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incident: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.incident = this.cast("incident")
  @scala.inline
  def problem: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.problem = this.cast("problem")
  @scala.inline
  def question: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.question = this.cast("question")
  @scala.inline
  def task: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.task = this.cast("task")
}

