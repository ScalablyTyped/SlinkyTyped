package typingsSlinky.pulumiAws.computeEnvironmentMod

import typingsSlinky.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentArgs extends js.Object {
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
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: Input[String] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: Input[String] = js.native
}

object ComputeEnvironmentArgs {
  @scala.inline
  def apply(serviceRole: Input[String], `type`: Input[String]): ComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentArgs]
  }
  @scala.inline
  implicit class ComputeEnvironmentArgsOps[Self <: ComputeEnvironmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
  }
  
}

