package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskUnassigned extends WebhookTriggerType {
  var triggerId: `10`
  var triggerName: TaskUnassigned
}

object AnonTriggerNameTaskUnassigned {
  @scala.inline
  def apply(triggerId: `10`, triggerName: TaskUnassigned): AnonTriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskUnassigned]
  }
}

