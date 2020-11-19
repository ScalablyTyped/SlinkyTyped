package typingsSlinky.pulumiAws.outputMod.batch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var desiredVcpus: Double = js.native
  
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
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  var `type`: String = js.native
}
object ComputeEnvironmentComputeResources {
  
  @scala.inline
  def apply(
    desiredVcpus: Double,
    instanceRole: String,
    instanceTypes: js.Array[String],
    maxVcpus: Double,
    minVcpus: Double,
    securityGroupIds: js.Array[String],
    subnets: js.Array[String],
    `type`: String
  ): ComputeEnvironmentComputeResources = {
    val __obj = js.Dynamic.literal(desiredVcpus = desiredVcpus.asInstanceOf[js.Any], instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDesiredVcpus(value: Double): Self = this.set("desiredVcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRole(value: String): Self = this.set("instanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesVarargs(value: String*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: js.Array[String]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVcpus(value: Double): Self = this.set("maxVcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVcpus(value: Double): Self = this.set("minVcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: js.Array[String]): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategy(value: String): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("allocationStrategy", js.undefined)
    
    @scala.inline
    def setBidPercentage(value: Double): Self = this.set("bidPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPercentage: Self = this.set("bidPercentage", js.undefined)
    
    @scala.inline
    def setEc2KeyPair(value: String): Self = this.set("ec2KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2KeyPair: Self = this.set("ec2KeyPair", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: ComputeEnvironmentComputeResourcesLaunchTemplate): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("launchTemplate", js.undefined)
    
    @scala.inline
    def setSpotIamFleetRole(value: String): Self = this.set("spotIamFleetRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotIamFleetRole: Self = this.set("spotIamFleetRole", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
