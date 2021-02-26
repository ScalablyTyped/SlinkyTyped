package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TriggerNameSmsRecipientResponseMissedMutableBuilder[Self <: TriggerNameSmsRecipientResponseMissed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `14`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: SmsRecipientResponseMissed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
