package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobRequest extends StObject {
  
  /**
    * Optional. Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.BillingTagsSource] = js.native
  
  /**
    * Optional. Idempotency token for CreateJob operation.
    */
  var ClientRequestToken: js.UndefOr[string] = js.native
  
  /**
    * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  
  /**
    * Optional. When you create a job, you can either specify a job template or specify the transcoding settings individually.
    */
  var JobTemplate: js.UndefOr[string] = js.native
  
  /**
    * Optional. Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
    */
  var Queue: js.UndefOr[string] = js.native
  
  /**
    * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
    */
  var Role: string = js.native
  
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings = js.native
  
  /**
    * Optional. Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  var SimulateReservedQueue: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SimulateReservedQueue] = js.native
  
  /**
    * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  
  /**
    * Optional. The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  
  /**
    * Optional. User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[mapOfString] = js.native
}
object CreateJobRequest {
  
  @scala.inline
  def apply(Role: string, Settings: JobSettings): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestMutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationSettings(value: AccelerationSettings): Self = StObject.set(x, "AccelerationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationSettingsUndefined: Self = StObject.set(x, "AccelerationSettings", js.undefined)
    
    @scala.inline
    def setBillingTagsSource(value: BillingTagsSource): Self = StObject.set(x, "BillingTagsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingTagsSourceUndefined: Self = StObject.set(x, "BillingTagsSource", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: string): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setHopDestinations(value: listOfHopDestination): Self = StObject.set(x, "HopDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHopDestinationsUndefined: Self = StObject.set(x, "HopDestinations", js.undefined)
    
    @scala.inline
    def setHopDestinationsVarargs(value: HopDestination*): Self = StObject.set(x, "HopDestinations", js.Array(value :_*))
    
    @scala.inline
    def setJobTemplate(value: string): Self = StObject.set(x, "JobTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplateUndefined: Self = StObject.set(x, "JobTemplate", js.undefined)
    
    @scala.inline
    def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    @scala.inline
    def setRole(value: string): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: JobSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateReservedQueue(value: SimulateReservedQueue): Self = StObject.set(x, "SimulateReservedQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateReservedQueueUndefined: Self = StObject.set(x, "SimulateReservedQueue", js.undefined)
    
    @scala.inline
    def setStatusUpdateInterval(value: StatusUpdateInterval): Self = StObject.set(x, "StatusUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateIntervalUndefined: Self = StObject.set(x, "StatusUpdateInterval", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: mapOfString): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
