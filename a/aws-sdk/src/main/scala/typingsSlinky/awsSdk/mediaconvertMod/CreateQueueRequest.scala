package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQueueRequest extends StObject {
  
  /**
    * Optional. A description of the queue that you are creating.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The name of the queue that you are creating.
    */
  var Name: string = js.native
  
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the API to create a queue, the default is on-demand.
    */
  var PricingPlan: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.PricingPlan] = js.native
  
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlanSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.native
  
  /**
    * Initial state of the queue. If you create a paused queue, then jobs in that queue won't begin.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
  
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}
object CreateQueueRequest {
  
  @scala.inline
  def apply(Name: string): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueRequest]
  }
  
  @scala.inline
  implicit class CreateQueueRequestMutableBuilder[Self <: CreateQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    @scala.inline
    def setReservationPlanSettings(value: ReservationPlanSettings): Self = StObject.set(x, "ReservationPlanSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationPlanSettingsUndefined: Self = StObject.set(x, "ReservationPlanSettings", js.undefined)
    
    @scala.inline
    def setStatus(value: QueueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
