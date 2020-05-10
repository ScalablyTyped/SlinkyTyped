package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForThirdPartyJobsOutput extends js.Object {
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[ThirdPartyJobList] = js.native
}

object PollForThirdPartyJobsOutput {
  @scala.inline
  def apply(): PollForThirdPartyJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForThirdPartyJobsOutput]
  }
  @scala.inline
  implicit class PollForThirdPartyJobsOutputOps[Self <: PollForThirdPartyJobsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: ThirdPartyJobList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(js.undefined)
        ret
    }
  }
  
}

