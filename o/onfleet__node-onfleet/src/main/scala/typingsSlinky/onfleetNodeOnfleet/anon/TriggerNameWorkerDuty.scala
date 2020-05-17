package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameWorkerDuty extends WebhookTriggerType {
  var triggerId: `5` = js.native
  var triggerName: WorkerDuty = js.native
}

object TriggerNameWorkerDuty {
  @scala.inline
  def apply(triggerId: `5`, triggerName: WorkerDuty): TriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameWorkerDuty]
  }
  @scala.inline
  implicit class TriggerNameWorkerDutyOps[Self <: TriggerNameWorkerDuty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerId(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: WorkerDuty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

