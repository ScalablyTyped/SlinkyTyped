package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeResource extends js.Object {
  /**
    * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. This could be due to availability of the instance type in the region or Amazon EC2 service limits. If this is not specified, the default is BEST_FIT, which will use only the best fitting instance type, waiting for additional capacity if it's not available. This allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with BEST_FIT then the Spot Fleet IAM Role must be specified. BEST_FIT_PROGRESSIVE will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types with a lower cost per vCPU. SPOT_CAPACITY_OPTIMIZED is only available for Spot Instance compute resources and will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types that are less likely to be interrupted. For more information, see Allocation Strategies in the AWS Batch User Guide.
    */
  var allocationStrategy: js.UndefOr[CRAllocationStrategy] = js.native
  /**
    * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be below 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. If you leave this field empty, the default value is 100% of the On-Demand price.
    */
  var bidPercentage: js.UndefOr[Integer] = js.native
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  /**
    * The Amazon EC2 key pair that is used for instances launched in the compute environment.
    */
  var ec2KeyPair: js.UndefOr[String] = js.native
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
    */
  var imageId: js.UndefOr[String] = js.native
  /**
    * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,  ecsInstanceRole  or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole . For more information, see Amazon ECS Instance Role in the AWS Batch User Guide.
    */
  var instanceRole: String = js.native
  /**
    * The instances types that may be launched. You can specify instance families to launch any instance type within those families (for example, c5 or p3), or you can specify specific sizes within a family (such as c5.8xlarge). You can also choose optimal to pick instance types (from the C, M, and R instance families) on the fly that match the demand of your job queues.
    */
  var instanceTypes: StringList = js.native
  /**
    * The launch template to use for your compute resources. Any other compute resource parameters that you specify in a CreateComputeEnvironment API operation override the same parameters in the launch template. You must specify either the launch template ID or launch template name in the request, but not both. For more information, see Launch Template Support in the AWS Batch User Guide.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: Integer = js.native
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED).
    */
  var minvCpus: Integer = js.native
  /**
    * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var placementGroup: js.UndefOr[String] = js.native
  /**
    * The Amazon EC2 security groups associated with instances launched in the compute environment. One or more security groups must be specified, either in securityGroupIds or using a launch template referenced in launchTemplate. If security groups are specified using both securityGroupIds and launchTemplate, the values in securityGroupIds will be used.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This role is required if the allocation strategy set to BEST_FIT or if the allocation strategy is not specified. For more information, see Amazon EC2 Spot Fleet Role in the AWS Batch User Guide.
    */
  var spotIamFleetRole: js.UndefOr[String] = js.native
  /**
    * The VPC subnets into which the compute resources are launched. For more information, see VPCs and Subnets in the Amazon VPC User Guide.
    */
  var subnets: StringList = js.native
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of compute environment: EC2 or SPOT.
    */
  var `type`: CRType = js.native
}

object ComputeResource {
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: StringList,
    maxvCpus: Integer,
    minvCpus: Integer,
    subnets: StringList,
    `type`: CRType
  ): ComputeResource = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxvCpus = maxvCpus.asInstanceOf[js.Any], minvCpus = minvCpus.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResource]
  }
  @scala.inline
  implicit class ComputeResourceOps[Self <: ComputeResource] (val x: Self) extends AnyVal {
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
    def withInstanceTypes(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CRType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationStrategy(value: CRAllocationStrategy): Self = {
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
    def withBidPercentage(value: Integer): Self = {
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
    def withDesiredvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredvCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredvCpus")(js.undefined)
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
    def withLaunchTemplate(value: LaunchTemplateSpecification): Self = {
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
    def withPlacementGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
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
    def withTags(value: TagsMap): Self = {
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

