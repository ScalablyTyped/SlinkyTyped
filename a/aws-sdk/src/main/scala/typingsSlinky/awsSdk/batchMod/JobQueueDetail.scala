package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobQueueDetail extends js.Object {
  /**
    * The compute environments that are attached to the job queue and the order in which job placement is preferred. Compute environments are selected for job placement in ascending order.
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders = js.native
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String = js.native
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
  /**
    * The priority of the job queue.
    */
  var priority: Integer = js.native
  /**
    * Describes the ability of the queue to accept new jobs.
    */
  var state: JQState = js.native
  /**
    * The status of the job queue (for example, CREATING or VALID).
    */
  var status: js.UndefOr[JQStatus] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job queue.
    */
  var statusReason: js.UndefOr[String] = js.native
}

object JobQueueDetail {
  @scala.inline
  def apply(
    computeEnvironmentOrder: ComputeEnvironmentOrders,
    jobQueueArn: String,
    jobQueueName: String,
    priority: Integer,
    state: JQState
  ): JobQueueDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueDetail]
  }
  @scala.inline
  implicit class JobQueueDetailOps[Self <: JobQueueDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobQueueArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueueArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobQueueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: JQState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: JQStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(js.undefined)
        ret
    }
  }
  
}

