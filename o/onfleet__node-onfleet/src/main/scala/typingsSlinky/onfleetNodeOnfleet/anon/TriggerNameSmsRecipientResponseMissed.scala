package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameSmsRecipientResponseMissed extends WebhookTriggerType {
  var triggerId: `14` = js.native
  var triggerName: SmsRecipientResponseMissed = js.native
}

object TriggerNameSmsRecipientResponseMissed {
  @scala.inline
  def apply(triggerId: `14`, triggerName: SmsRecipientResponseMissed): TriggerNameSmsRecipientResponseMissed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameSmsRecipientResponseMissed]
  }
  @scala.inline
  implicit class TriggerNameSmsRecipientResponseMissedOps[Self <: TriggerNameSmsRecipientResponseMissed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerId(value: `14`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: SmsRecipientResponseMissed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

