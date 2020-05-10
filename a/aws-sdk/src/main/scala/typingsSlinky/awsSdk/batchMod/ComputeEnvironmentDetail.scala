package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: String = js.native
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: String = js.native
  /**
    * The compute resources defined for the compute environment.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  var ecsClusterArn: String = js.native
  /**
    * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf.
    */
  var serviceRole: js.UndefOr[String] = js.native
  /**
    * The state of the compute environment. The valid values are ENABLED or DISABLED. If the state is ENABLED, then the AWS Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the AWS Batch scheduler does not attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state do not scale out. However, they scale in to minvCpus value after instances become idle.
    */
  var state: js.UndefOr[CEState] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  var status: js.UndefOr[CEStatus] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The type of the compute environment.
    */
  var `type`: js.UndefOr[CEType] = js.native
}

object ComputeEnvironmentDetail {
  @scala.inline
  def apply(computeEnvironmentArn: String, computeEnvironmentName: String, ecsClusterArn: String): ComputeEnvironmentDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentArn = computeEnvironmentArn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentDetail]
  }
  @scala.inline
  implicit class ComputeEnvironmentDetailOps[Self <: ComputeEnvironmentDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironmentArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentArn")(value.asInstanceOf[js.Any])
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
    def withComputeResources(value: ComputeResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeResources")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CEState): Self = {
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
    @scala.inline
    def withStatus(value: CEStatus): Self = {
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
    @scala.inline
    def withType(value: CEType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

