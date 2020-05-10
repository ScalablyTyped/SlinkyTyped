package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLaunchTemplateData extends js.Object {
  /**
    * The block device mapping.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList] = js.native
  /**
    * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest] = js.native
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest] = js.native
  /**
    * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.native
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * An elastic GPU to associate with the instance.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList] = js.native
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorList] = js.native
  /**
    * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ImageId] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.native
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest] = js.native
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptionsRequest] = js.native
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest] = js.native
  /**
    * One or more network interfaces. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList] = js.native
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacementRequest] = js.native
  /**
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamDiskId: js.UndefOr[RamdiskId] = js.native
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.native
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.native
  /**
    * The Base64-encoded user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows).
    */
  var UserData: js.UndefOr[String] = js.native
}

object RequestLaunchTemplateData {
  @scala.inline
  def apply(): RequestLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLaunchTemplateData]
  }
  @scala.inline
  implicit class RequestLaunchTemplateDataOps[Self <: RequestLaunchTemplateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingRequestList): Self = {
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
    def withCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuOptions(value: LaunchTemplateCpuOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditSpecification(value: CreditSpecificationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableApiTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableApiTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableApiTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableApiTermination")(js.undefined)
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
    def withElasticGpuSpecifications(value: ElasticGpuSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAccelerators")(js.undefined)
        ret
    }
    @scala.inline
    def withHibernationOptions(value: LaunchTemplateHibernationOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HibernationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHibernationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HibernationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecificationRequest): Self = {
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
    def withImageId(value: ImageId): Self = {
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
    def withInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInitiatedShutdownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMarketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMarketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMarketOptions")(js.undefined)
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
    def withKernelId(value: KernelId): Self = {
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
    def withKeyName(value: KeyPairName): Self = {
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
    def withLicenseSpecifications(value: LaunchTemplateLicenseSpecificationListRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataOptions(value: LaunchTemplateInstanceMetadataOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: LaunchTemplatesMonitoringRequest): Self = {
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
    def withNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList): Self = {
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
    def withPlacement(value: LaunchTemplatePlacementRequest): Self = {
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
    def withRamDiskId(value: RamdiskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamDiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamDiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamDiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroupStringList): Self = {
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
    def withTagSpecifications(value: LaunchTemplateTagSpecificationRequestList): Self = {
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
  }
  
}

