package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * The job document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
    */
  var document: js.UndefOr[JobDocument] = js.native
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  /**
    * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters, "-" and "_" are valid for use here.
    */
  var jobId: JobId = js.native
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  /**
    * Metadata which can be used to manage the job.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * A list of things and thing groups to which the job should be sent.
    */
  var targets: JobTargets = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(jobId: JobId, targets: JobTargets): CreateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
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
    def withTargets(value: JobTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
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
    def withDocument(value: JobDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentSource(value: JobDocumentSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSource")(js.undefined)
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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

