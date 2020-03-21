package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerId extends WebhookTriggerType {
  var triggerId: `0`
  var triggerName: TaskStarted
}

object AnonTriggerId {
  @scala.inline
  def apply(triggerId: `0`, triggerName: TaskStarted): AnonTriggerId = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerId]
  }
}

