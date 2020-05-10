package typingsSlinky.pulumiAws.getComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComputeEnvironmentResult extends js.Object {
  /**
    * The ARN of the compute environment.
    */
  val arn: String = js.native
  val computeEnvironmentName: String = js.native
  /**
    * The ARN of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: String = js.native
  /**
    * The state of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
    */
  val state: String = js.native
  /**
    * The current status of the compute environment (for example, `CREATING` or `VALID`).
    */
  val status: String = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: String = js.native
  /**
    * The type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
    */
  val `type`: String = js.native
}

object GetComputeEnvironmentResult {
  @scala.inline
  def apply(
    arn: String,
    computeEnvironmentName: String,
    ecsClusterArn: String,
    id: String,
    serviceRole: String,
    state: String,
    status: String,
    statusReason: String,
    `type`: String
  ): GetComputeEnvironmentResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputeEnvironmentResult]
  }
  @scala.inline
  implicit class GetComputeEnvironmentResultOps[Self <: GetComputeEnvironmentResult] (val x: Self) extends AnyVal {
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
    def withComputeEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcsClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

