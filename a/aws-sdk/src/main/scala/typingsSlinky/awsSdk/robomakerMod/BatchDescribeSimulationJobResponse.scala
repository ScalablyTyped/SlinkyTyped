package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeSimulationJobResponse extends js.Object {
  /**
    * A list of simulation jobs.
    */
  var jobs: js.UndefOr[SimulationJobs] = js.native
  /**
    * A list of unprocessed simulation job Amazon Resource Names (ARNs).
    */
  var unprocessedJobs: js.UndefOr[Arns] = js.native
}

object BatchDescribeSimulationJobResponse {
  @scala.inline
  def apply(): BatchDescribeSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
  }
  @scala.inline
  implicit class BatchDescribeSimulationJobResponseOps[Self <: BatchDescribeSimulationJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: SimulationJobs): Self = {
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
    @scala.inline
    def withUnprocessedJobs(value: Arns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedJobs")(js.undefined)
        ret
    }
  }
  
}

