package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends StObject {
  
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The timestamp in epoch seconds for when you created the queue.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * An optional description that you create for each queue.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The timestamp in epoch seconds for when you most recently updated the queue.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  
  /**
    * A name that you create for each queue. Each name must be unique within your account.
    */
  var Name: string = js.native
  
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  var PricingPlan: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.PricingPlan] = js.native
  
  /**
    * The estimated number of jobs with a PROGRESSING status.
    */
  var ProgressingJobsCount: js.UndefOr[integer] = js.native
  
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlan: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ReservationPlan] = js.native
  
  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
  
  /**
    * The estimated number of jobs with a SUBMITTED status.
    */
  var SubmittedJobsCount: js.UndefOr[integer] = js.native
  
  /**
    * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or delete system queues. You can create and modify custom queues.
    */
  var Type: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Type] = js.native
}
object Queue {
  
  @scala.inline
  def apply(Name: string): Queue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    @scala.inline
    def setProgressingJobsCount(value: integer): Self = StObject.set(x, "ProgressingJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressingJobsCountUndefined: Self = StObject.set(x, "ProgressingJobsCount", js.undefined)
    
    @scala.inline
    def setReservationPlan(value: ReservationPlan): Self = StObject.set(x, "ReservationPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationPlanUndefined: Self = StObject.set(x, "ReservationPlan", js.undefined)
    
    @scala.inline
    def setStatus(value: QueueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubmittedJobsCount(value: integer): Self = StObject.set(x, "SubmittedJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedJobsCountUndefined: Self = StObject.set(x, "SubmittedJobsCount", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
