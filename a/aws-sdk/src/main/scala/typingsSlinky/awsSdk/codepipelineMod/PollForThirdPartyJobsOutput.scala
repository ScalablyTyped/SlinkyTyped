package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobsVarargs(value: ThirdPartyJob*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: ThirdPartyJobList): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
  }
}
