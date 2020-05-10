package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[JobDetailList] = js.native
}

object DescribeJobsResponse {
  @scala.inline
  def apply(): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsResponse]
  }
  @scala.inline
  implicit class DescribeJobsResponseOps[Self <: DescribeJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: JobDetailList): Self = {
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

