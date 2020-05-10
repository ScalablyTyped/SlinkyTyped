package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName = js.native
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: js.UndefOr[CommitId] = js.native
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: js.UndefOr[CommitMessage] = js.native
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: js.UndefOr[js.Date] = js.native
  /**
    *  Unique Id for an existing job. Required for "RETRY" JobType. 
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    *  Descriptive reason for starting this job. 
    */
  var jobReason: js.UndefOr[JobReason] = js.native
  /**
    *  Type for the Job. Available JobTypes are: \n "RELEASE": Start a new job with the latest change from the specified branch. Only available for apps that have connected to a repository. "RETRY": Retry an existing job. JobId is required for this type of job. 
    */
  var jobType: JobType = js.native
}

object StartJobRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobType: JobType): StartJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
  @scala.inline
  implicit class StartJobRequestOps[Self <: StartJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitMessage(value: CommitMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(js.undefined)
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
    def withJobReason(value: JobReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReason")(js.undefined)
        ret
    }
  }
  
}

