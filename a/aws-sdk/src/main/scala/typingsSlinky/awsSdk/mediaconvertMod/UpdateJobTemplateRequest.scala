package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobTemplateRequest extends StObject {
  
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  
  /**
    * The new category for the job template, if you are changing it.
    */
  var Category: js.UndefOr[string] = js.native
  
  /**
    * The new description for the job template, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * Optional list of hop destinations.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  
  /**
    * The name of the job template you are modifying
    */
  var Name: string = js.native
  
  /**
    * Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  
  /**
    * The new queue for the job template, if you are changing it.
    */
  var Queue: js.UndefOr[string] = js.native
  
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: js.UndefOr[JobTemplateSettings] = js.native
  
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
}
object UpdateJobTemplateRequest {
  
  @scala.inline
  def apply(Name: string): UpdateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateJobTemplateRequestMutableBuilder[Self <: UpdateJobTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationSettings(value: AccelerationSettings): Self = StObject.set(x, "AccelerationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationSettingsUndefined: Self = StObject.set(x, "AccelerationSettings", js.undefined)
    
    @scala.inline
    def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHopDestinations(value: listOfHopDestination): Self = StObject.set(x, "HopDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHopDestinationsUndefined: Self = StObject.set(x, "HopDestinations", js.undefined)
    
    @scala.inline
    def setHopDestinationsVarargs(value: HopDestination*): Self = StObject.set(x, "HopDestinations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    @scala.inline
    def setSettings(value: JobTemplateSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setStatusUpdateInterval(value: StatusUpdateInterval): Self = StObject.set(x, "StatusUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateIntervalUndefined: Self = StObject.set(x, "StatusUpdateInterval", js.undefined)
  }
}
