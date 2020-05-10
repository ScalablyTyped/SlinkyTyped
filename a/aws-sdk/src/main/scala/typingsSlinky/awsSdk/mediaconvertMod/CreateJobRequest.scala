package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.BillingTagsSource] = js.native
  /**
    * Idempotency token for CreateJob operation.
    */
  var ClientRequestToken: js.UndefOr[string] = js.native
  /**
    * When you create a job, you can either specify a job template or specify the transcoding settings individually
    */
  var JobTemplate: js.UndefOr[string] = js.native
  /**
    * Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
    */
  var Role: string = js.native
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings = js.native
  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  var SimulateReservedQueue: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SimulateReservedQueue] = js.native
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
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
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: JobSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerationSettings(value: AccelerationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccelerationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccelerationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingTagsSource(value: BillingTagsSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingTagsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingTagsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingTagsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTemplate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: integerMinNegative50Max50): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queue")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulateReservedQueue(value: SimulateReservedQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimulateReservedQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulateReservedQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimulateReservedQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusUpdateInterval(value: StatusUpdateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadata(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

