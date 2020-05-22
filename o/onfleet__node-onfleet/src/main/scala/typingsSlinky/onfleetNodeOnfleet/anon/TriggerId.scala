package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerId extends WebhookTriggerType {
  var triggerId: `0`
  var triggerName: TaskStarted
}

object TriggerId {
  @scala.inline
  def apply(triggerId: `0`, triggerName: TaskStarted): TriggerId = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerId]
  }
}

