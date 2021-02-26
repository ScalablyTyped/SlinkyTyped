package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TriggerNameTaskClonedMutableBuilder[Self <: TriggerNameTaskCloned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `13`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskCloned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
