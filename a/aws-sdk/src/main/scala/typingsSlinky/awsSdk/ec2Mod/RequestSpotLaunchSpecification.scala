package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSpotLaunchSpecification extends js.Object {
  
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.native
  
  /**
    * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  
  /**
    * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ImageId] = js.native
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.KernelId] = js.native
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  
  /**
    * Indicates whether basic or detailed monitoring is enabled for the instance. Default: Disabled
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.native
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.native
  
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.RamdiskId] = js.native
  
  /**
    * One or more security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupIdList] = js.native
  
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupList] = js.native
  
  /**
    * The IDs of the subnets in which to launch the instance. To specify multiple subnets, separate them using commas; for example, "subnet-1234abcdeexample1, subnet-0987cdef6example2".
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SubnetId] = js.native
  
  /**
    * The Base64-encoded user data for the instance. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.native
}
object RequestSpotLaunchSpecification {
  
  @scala.inline
  def apply(): RequestSpotLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotLaunchSpecification]
  }
  
  @scala.inline
  implicit class RequestSpotLaunchSpecificationOps[Self <: RequestSpotLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressingType(value: String): Self = this.set("AddressingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressingType: Self = this.set("AddressingType", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: KernelId): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: KeyPairName): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    
    @scala.inline
    def setMonitoring(value: RunInstancesMonitoringEnabled): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setPlacement(value: SpotPlacement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: RamdiskId): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: RequestSpotLaunchSpecificationSecurityGroupIdList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupName*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: RequestSpotLaunchSpecificationSecurityGroupList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
}
