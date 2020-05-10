package typingsSlinky.pulumiAws.getJobQueueMod

import typingsSlinky.pulumiAws.outputMod.batch.GetJobQueueComputeEnvironmentOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobQueueResult extends js.Object {
  /**
    * The ARN of the job queue.
    */
  val arn: String = js.native
  /**
    * The compute environments that are attached to the job queue and the order in
    * which job placement is preferred. Compute environments are selected for job placement in ascending order.
    * * `compute_environment_order.#.order` - The order of the compute environment.
    * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
    */
  val computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority are evaluated first when
    * associated with the same compute environment.
    */
  val priority: Double = js.native
  /**
    * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
    */
  val state: String = js.native
  /**
    * The current status of the job queue (for example, `CREATING` or `VALID`).
    */
  val status: String = js.native
  /**
    * A short, human-readable string to provide additional details about the current status
    * of the job queue.
    */
  val statusReason: String = js.native
}

object GetJobQueueResult {
  @scala.inline
  def apply(
    arn: String,
    computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder],
    id: String,
    name: String,
    priority: Double,
    state: String,
    status: String,
    statusReason: String
  ): GetJobQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], computeEnvironmentOrders = computeEnvironmentOrders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobQueueResult]
  }
  @scala.inline
  implicit class GetJobQueueResultOps[Self <: GetJobQueueResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeEnvironmentOrders(value: js.Array[GetJobQueueComputeEnvironmentOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentOrders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

