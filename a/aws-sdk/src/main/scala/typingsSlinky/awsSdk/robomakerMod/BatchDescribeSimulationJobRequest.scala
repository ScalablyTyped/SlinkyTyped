package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeSimulationJobRequest extends js.Object {
  /**
    * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
    */
  var jobs: Arns = js.native
}

object BatchDescribeSimulationJobRequest {
  @scala.inline
  def apply(jobs: Arns): BatchDescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSimulationJobRequest]
  }
  @scala.inline
  implicit class BatchDescribeSimulationJobRequestOps[Self <: BatchDescribeSimulationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: Arns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

