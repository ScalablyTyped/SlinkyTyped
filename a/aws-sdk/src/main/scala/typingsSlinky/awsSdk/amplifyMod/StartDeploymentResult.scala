package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeploymentResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary = js.native
}

object StartDeploymentResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StartDeploymentResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentResult]
  }
  @scala.inline
  implicit class StartDeploymentResultOps[Self <: StartDeploymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobSummary(value: JobSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobSummary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

