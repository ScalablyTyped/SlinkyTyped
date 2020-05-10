package typingsSlinky.pulumiAws.outputMod.batch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentComputeResources extends js.Object {
  /**
    * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details.
    */
  var allocationStrategy: js.UndefOr[String] = js.native
  /**
    * Integer of minimum percentage that a Spot Instance price must be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. This parameter is required for SPOT compute environments.
    */
  var bidPercentage: js.UndefOr[Double] = js.native
  /**
    * The desired number of EC2 vCPUS in the compute environment.
    */
  var desiredVcpus: js.UndefOr[Double] = js.native
  /**
    * The EC2 key pair that is used for instances launched in the compute environment.
    */
  var ec2KeyPair: js.UndefOr[String] = js.native
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
    */
  var imageId: js.UndefOr[String] = js.native
  /**
    * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment.
    */
  var instanceRole: String = js.native
  /**
    * A list of instance types that may be launched.
    */
  var instanceTypes: js.Array[String] = js.native
  /**
    * The launch template to use for your compute resources. See details below.
    */
  var launchTemplate: js.UndefOr[ComputeEnvironmentComputeResourcesLaunchTemplate] = js.native
  /**
    * The maximum number of EC2 vCPUs that an environment can reach.
    */
  var maxVcpus: Double = js.native
  /**
    * The minimum number of EC2 vCPUs that an environment should maintain.
    */
  var minVcpus: Double = js.native
  /**
    * A list of EC2 security group that are associated with instances launched in the compute environment.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments.
    */
  var spotIamFleetRole: js.UndefOr[String] = js.native
  /**
    * A list of VPC subnets into which the compute resources are launched.
    */
  var subnets: js.Array[String] = js.native
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  var `type`: String = js.native
}

object ComputeEnvironmentComputeResources {
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: js.Array[String],
    maxVcpus: Double,
    minVcpus: Double,
    securityGroupIds: js.Array[String],
    subnets: js.Array[String],
    `type`: String
  ): ComputeEnvironmentComputeResources = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentComputeResources]
  }
  @scala.inline
  implicit class ComputeEnvironmentComputeResourcesOps[Self <: ComputeEnvironmentComputeResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVcpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVcpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinVcpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVcpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withBidPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredVcpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredVcpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredVcpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredVcpus")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2KeyPair(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2KeyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2KeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2KeyPair")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplate(value: ComputeEnvironmentComputeResourcesLaunchTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotIamFleetRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotIamFleetRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotIamFleetRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotIamFleetRole")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

