package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobsRequest extends js.Object {
  /**
    * A list of up to 100 job IDs.
    */
  var jobs: StringList = js.native
}

object DescribeJobsRequest {
  @scala.inline
  def apply(jobs: StringList): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobsRequest]
  }
  @scala.inline
  implicit class DescribeJobsRequestOps[Self <: DescribeJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

