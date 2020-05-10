package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * Configuration for criteria to abort the job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  /**
    * If the job was updated, describes the reason for the update.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * The time, in seconds since the epoch, when the job was completed.
    */
  var completedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * Will be true if the job was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.native
  /**
    * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
    */
  var jobArn: js.UndefOr[JobArn] = js.native
  /**
    * Allows you to create a staged rollout of a job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * Details about the job process.
    */
  var jobProcessDetails: js.UndefOr[JobProcessDetails] = js.native
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * Configuration for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  /**
    * If the job was updated, provides the reason code for the update.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.native
  /**
    * The status of the job, one of IN_PROGRESS, CANCELED, DELETION_IN_PROGRESS or COMPLETED. 
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a device when the thing representing the device is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * A list of IoT things and thing groups to which the job should be sent.
    */
  var targets: js.UndefOr[JobTargets] = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortConfig(value: AbortConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: JobDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withForceCanceled(value: Forced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCanceled")(js.undefined)
        ret
    }
    @scala.inline
    def withJobArn(value: JobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobExecutionsRolloutConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobExecutionsRolloutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobExecutionsRolloutConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobProcessDetails(value: JobProcessDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobProcessDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobProcessDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobProcessDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPresignedUrlConfig(value: PresignedUrlConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presignedUrlConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresignedUrlConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presignedUrlConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: ReasonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSelection(value: TargetSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: JobTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutConfig(value: TimeoutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutConfig")(js.undefined)
        ret
    }
  }
  
}

