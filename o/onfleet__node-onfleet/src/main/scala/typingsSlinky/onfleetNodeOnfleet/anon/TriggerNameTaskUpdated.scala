package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerNameTaskUpdated extends WebhookTriggerType {
  var triggerId: `7`
  var triggerName: TaskUpdated
}

object TriggerNameTaskUpdated {
  @scala.inline
  def apply(triggerId: `7`, triggerName: TaskUpdated): TriggerNameTaskUpdated = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUpdated]
  }
}

