package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskCompleted extends WebhookTriggerType {
  
  var triggerId: `3` = js.native
  
  var triggerName: TaskCompleted = js.native
}
object TriggerNameTaskCompleted {
  
  @scala.inline
  def apply(triggerId: `3`, triggerName: TaskCompleted): TriggerNameTaskCompleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCompleted]
  }
  
  @scala.inline
  implicit class TriggerNameTaskCompletedMutableBuilder[Self <: TriggerNameTaskCompleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `3`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskCompleted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
