package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobQueueRequest extends js.Object {
  /**
    * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment should execute a given job.
    */
  var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.native
  /**
    * The name or the Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueue: String = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
    */
  var priority: js.UndefOr[Integer] = js.native
  /**
    * Describes the queue's ability to accept new jobs.
    */
  var state: js.UndefOr[JQState] = js.native
}

object UpdateJobQueueRequest {
  @scala.inline
  def apply(jobQueue: String): UpdateJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueRequest]
  }
  @scala.inline
  implicit class UpdateJobQueueRequestOps[Self <: UpdateJobQueueRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeEnvironmentOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: JQState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

