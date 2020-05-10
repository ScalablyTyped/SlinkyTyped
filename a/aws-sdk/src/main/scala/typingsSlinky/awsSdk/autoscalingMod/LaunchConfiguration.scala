package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfiguration extends js.Object {
  /**
    * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's instances. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var AssociatePublicIpAddress: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AssociatePublicIpAddress] = js.native
  /**
    * A block device mapping, which specifies the block devices for the instance. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.BlockDeviceMappings] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.ClassicLinkVPCSecurityGroups] = js.native
  /**
    * The creation date and time for the launch configuration.
    */
  var CreatedTime: js.Date = js.native
  /**
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false). For more information, see Amazon EBS-Optimized Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimized: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.EbsOptimized] = js.native
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM Role for Applications That Run on Amazon EC2 Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances. For more information, see Finding an AMI in the Amazon EC2 User Guide for Linux Instances.
    */
  var ImageId: XmlStringMaxLen255 = js.native
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring. For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceMonitoring: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.InstanceMonitoring] = js.native
  /**
    * The instance type for the instances. For information about available instance types, see Available Instance Types in the Amazon EC2 User Guide for Linux Instances. 
    */
  var InstanceType: XmlStringMaxLen255 = js.native
  /**
    * The ID of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the key pair. For more information, see Amazon EC2 Key Pairs in the Amazon EC2 User Guide for Linux Instances.
    */
  var KeyName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the launch configuration.
    */
  var LaunchConfigurationARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: XmlStringMaxLen255 = js.native
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. For more information, see Instance Placement Tenancy in the Amazon EC2 Auto Scaling User Guide.
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The ID of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * A list that contains the security groups to assign to the instances in the Auto Scaling group. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.SecurityGroups] = js.native
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Launching Spot Instances in Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var SpotPrice: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.SpotPrice] = js.native
  /**
    * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.native
}

object LaunchConfiguration {
  @scala.inline
  def apply(
    CreatedTime: js.Date,
    ImageId: XmlStringMaxLen255,
    InstanceType: XmlStringMaxLen255,
    LaunchConfigurationName: XmlStringMaxLen255
  ): LaunchConfiguration = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfiguration]
  }
  @scala.inline
  implicit class LaunchConfigurationOps[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageId(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchConfigurationName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatePublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockDeviceMappings(value: BlockDeviceMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDeviceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDeviceMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDeviceMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withClassicLinkVPCId(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkVPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicLinkVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkVPCId")(js.undefined)
        ret
    }
    @scala.inline
    def withClassicLinkVPCSecurityGroups(value: ClassicLinkVPCSecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkVPCSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicLinkVPCSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkVPCSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: EbsOptimized): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: XmlStringMaxLen1600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMonitoring(value: InstanceMonitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchConfigurationARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchConfigurationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTenancy(value: XmlStringMaxLen64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withRamdiskId(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamdiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamdiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamdiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: SpotPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: XmlStringUserData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(js.undefined)
        ret
    }
  }
  
}

