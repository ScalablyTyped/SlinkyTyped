package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskFailed extends WebhookTriggerType {
  var triggerId: `4`
  var triggerName: TaskFailed
}

object AnonTriggerNameTaskFailed {
  @scala.inline
  def apply(triggerId: `4`, triggerName: TaskFailed): AnonTriggerNameTaskFailed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskFailed]
  }
}

