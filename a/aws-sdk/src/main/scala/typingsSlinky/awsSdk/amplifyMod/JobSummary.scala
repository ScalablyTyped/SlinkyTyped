package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: CommitId = js.native
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: CommitMessage = js.native
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: js.Date = js.native
  /**
    *  End date / time for the Job. 
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    *  Arn for the Job. 
    */
  var jobArn: JobArn = js.native
  /**
    *  Unique Id for the Job. 
    */
  var jobId: JobId = js.native
  /**
    *  Type for the Job. \n "RELEASE": Manually released from source by using StartJob API. "RETRY": Manually retried by using StartJob API. "WEB_HOOK": Automatically triggered by WebHooks. 
    */
  var jobType: JobType = js.native
  /**
    *  Start date / time for the Job. 
    */
  var startTime: js.Date = js.native
  /**
    *  Status for the Job. 
    */
  var status: JobStatus = js.native
}

object JobSummary {
  @scala.inline
  def apply(
    commitId: CommitId,
    commitMessage: CommitMessage,
    commitTime: js.Date,
    jobArn: JobArn,
    jobId: JobId,
    jobType: JobType,
    startTime: js.Date,
    status: JobStatus
  ): JobSummary = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  @scala.inline
  implicit class JobSummaryOps[Self <: JobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitMessage(value: CommitMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobArn(value: JobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
  }
  
}

