package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskCloned extends WebhookTriggerType {
  var triggerId: `13` = js.native
  var triggerName: TaskCloned = js.native
}

object TriggerNameTaskCloned {
  @scala.inline
  def apply(triggerId: `13`, triggerName: TaskCloned): TriggerNameTaskCloned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCloned]
  }
  @scala.inline
  implicit class TriggerNameTaskClonedOps[Self <: TriggerNameTaskCloned] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerId(value: `13`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: TaskCloned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

