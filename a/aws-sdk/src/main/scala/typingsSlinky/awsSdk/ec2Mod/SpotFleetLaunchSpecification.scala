package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetLaunchSpecification extends StObject {
  
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
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.   SpotFleetLaunchSpecification currently does not support Elastic Fabric Adapter (EFA). To specify an EFA, you must use LaunchTemplateConfig. 
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
  implicit class SpotFleetLaunchSpecificationMutableBuilder[Self <: SpotFleetLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressingType(value: String): Self = StObject.set(x, "AddressingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressingTypeUndefined: Self = StObject.set(x, "AddressingType", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setMonitoring(value: SpotFleetMonitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: SpotPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: String): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: GroupIdentifierList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSpotPrice(value: String): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: SpotFleetTagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: SpotFleetTagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Double): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
