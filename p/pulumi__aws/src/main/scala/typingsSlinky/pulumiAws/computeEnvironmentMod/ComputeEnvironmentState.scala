package typingsSlinky.pulumiAws.computeEnvironmentMod

import typingsSlinky.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  val computeEnvironmentName: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
    */
  val computeEnvironmentNamePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[Input[ComputeEnvironmentComputeResources]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: js.UndefOr[Input[String]] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: js.UndefOr[Input[String]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object ComputeEnvironmentState {
  @scala.inline
  def apply(): ComputeEnvironmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeEnvironmentState]
  }
  @scala.inline
  implicit class ComputeEnvironmentStateOps[Self <: ComputeEnvironmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeEnvironmentName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeEnvironmentNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeEnvironmentNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeResources(value: Input[ComputeEnvironmentComputeResources]): Self = {
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
    def withEcsClusterArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: Input[String]): Self = {
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
    def withState(value: Input[String]): Self = {
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
    def withStatus(value: Input[String]): Self = {
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
    def withStatusReason(value: Input[String]): Self = {
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
    def withType(value: Input[String]): Self = {
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

