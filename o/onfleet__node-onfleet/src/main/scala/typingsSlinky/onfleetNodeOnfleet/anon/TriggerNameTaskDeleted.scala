package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskDeleted extends WebhookTriggerType {
  var triggerId: `8` = js.native
  var triggerName: TaskDeleted = js.native
}

object TriggerNameTaskDeleted {
  @scala.inline
  def apply(triggerId: `8`, triggerName: TaskDeleted): TriggerNameTaskDeleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDeleted]
  }
  @scala.inline
  implicit class TriggerNameTaskDeletedOps[Self <: TriggerNameTaskDeleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerId(value: `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: TaskDeleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

