package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  /**
    * The ID of the job to be updated.
    */
  var jobId: JobId = js.native
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT. 
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object UpdateJobRequest {
  @scala.inline
  def apply(jobId: JobId): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  @scala.inline
  implicit class UpdateJobRequestOps[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
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

