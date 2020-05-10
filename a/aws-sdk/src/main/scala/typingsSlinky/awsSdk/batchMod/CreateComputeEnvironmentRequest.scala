package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputeEnvironmentRequest extends js.Object {
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
    */
  var computeEnvironmentName: String = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. For more information, see Compute Environments in the AWS Batch User Guide.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf. If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path.  Depending on how you created your AWS Batch service role, its ARN may contain the service-role path prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
    */
  var serviceRole: String = js.native
  /**
    * The state of the compute environment. If the state is ENABLED, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
    */
  var state: js.UndefOr[CEState] = js.native
  /**
    * The type of the compute environment. For more information, see Compute Environments in the AWS Batch User Guide.
    */
  var `type`: CEType = js.native
}

object CreateComputeEnvironmentRequest {
  @scala.inline
  def apply(computeEnvironmentName: String, serviceRole: String, `type`: CEType): CreateComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputeEnvironmentRequest]
  }
  @scala.inline
  implicit class CreateComputeEnvironmentRequestOps[Self <: CreateComputeEnvironmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CEType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
  }
  
}

