package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetLaunchSpecification extends js.Object {
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.native
  /**
    * One or more block devices that are mapped to the Spot Instances. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[SpotFleetMonitoring] = js.native
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.native
  /**
    * The ID of the RAM disk. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, refer to the AWS Resource Center and search for the kernel ID.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified, the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot price by the value of WeightedCapacity.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The IDs of the subnets in which to launch the instances. To specify multiple subnets, separate them using commas; for example, "subnet-1234abcdeexample1, subnet-0987cdef6example2".
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The tags to apply during creation.
    */
  var TagSpecifications: js.UndefOr[SpotFleetTagSpecificationList] = js.native
  /**
    * The Base64-encoded user data that instances use when starting up.
    */
  var UserData: js.UndefOr[String] = js.native
  /**
    * The number of units provided by the specified instance type. These are the same units that you chose to set the target capacity in terms of instances, or a performance characteristic such as vCPUs, memory, or I/O. If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the number of instances to the next whole number. If this value is not specified, the default is 1.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.native
}

object SpotFleetLaunchSpecification {
  @scala.inline
  def apply(): SpotFleetLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetLaunchSpecification]
  }
  @scala.inline
  implicit class SpotFleetLaunchSpecificationOps[Self <: SpotFleetLaunchSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressingType")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockDeviceMappings(value: BlockDeviceMappingList): Self = {
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
    def withEbsOptimized(value: Boolean): Self = {
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
    def withIamInstanceProfile(value: IamInstanceProfileSpecification): Self = {
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
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: String): Self = {
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
    def withKeyName(value: String): Self = {
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
    def withMonitoring(value: SpotFleetMonitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: SpotPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRamdiskId(value: String): Self = {
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
    def withSecurityGroups(value: GroupIdentifierList): Self = {
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
    def withSpotPrice(value: String): Self = {
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
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: SpotFleetTagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: String): Self = {
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
    @scala.inline
    def withWeightedCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedCapacity")(js.undefined)
        ret
    }
  }
  
}

