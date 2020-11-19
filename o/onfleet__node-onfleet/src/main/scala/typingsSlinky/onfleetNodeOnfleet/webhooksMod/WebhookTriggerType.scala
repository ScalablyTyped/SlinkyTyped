package typingsSlinky.onfleetNodeOnfleet.webhooksMod

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typingsSlinky.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerId
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerName
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerIdTriggerName
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskFailed
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskCreated
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameTaskCloned
  - typingsSlinky.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed
*/
trait WebhookTriggerType extends js.Object
object WebhookTriggerType {
  
  @scala.inline
  def TriggerNameTaskAssigned(triggerId: `9`, triggerName: TaskAssigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskFailed(triggerId: `4`, triggerName: TaskFailed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskCompleted(triggerId: `3`, triggerName: TaskCompleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskDelayed(triggerId: `12`, triggerName: TaskDelayed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskCloned(triggerId: `13`, triggerName: TaskCloned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerId(triggerId: `0`, triggerName: TaskStarted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameWorkerDuty(triggerId: `5`, triggerName: WorkerDuty): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameSmsRecipientResponseMissed(triggerId: `14`, triggerName: SmsRecipientResponseMissed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerIdTriggerName(triggerId: `2`, triggerName: TaskArrival): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskUnassigned(triggerId: `10`, triggerName: TaskUnassigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskCreated(triggerId: `6`, triggerName: TaskCreated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskDeleted(triggerId: `8`, triggerName: TaskDeleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerNameTaskUpdated(triggerId: `7`, triggerName: TaskUpdated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  
  @scala.inline
  def TriggerName(triggerId: `1`, triggerName: TaskEta): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
}
