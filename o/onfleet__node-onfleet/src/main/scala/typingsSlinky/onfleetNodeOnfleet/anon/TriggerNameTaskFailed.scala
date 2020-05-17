package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskFailed extends WebhookTriggerType {
  var triggerId: `4` = js.native
  var triggerName: TaskFailed = js.native
}

object TriggerNameTaskFailed {
  @scala.inline
  def apply(triggerId: `4`, triggerName: TaskFailed): TriggerNameTaskFailed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskFailed]
  }
  @scala.inline
  implicit class TriggerNameTaskFailedOps[Self <: TriggerNameTaskFailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerId(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: TaskFailed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

