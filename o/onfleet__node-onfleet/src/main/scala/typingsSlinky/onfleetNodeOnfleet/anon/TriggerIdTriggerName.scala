package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerIdTriggerName extends WebhookTriggerType {
  
  var triggerId: `2` = js.native
  
  var triggerName: TaskArrival = js.native
}
object TriggerIdTriggerName {
  
  @scala.inline
  def apply(triggerId: `2`, triggerName: TaskArrival): TriggerIdTriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerIdTriggerName]
  }
  
  @scala.inline
  implicit class TriggerIdTriggerNameMutableBuilder[Self <: TriggerIdTriggerName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `2`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskArrival): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
