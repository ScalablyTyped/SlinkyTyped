package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseLaunchTemplateData extends js.Object {
  /**
    * The block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.native
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.native
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.native
  /**
    * The credit option for CPU usage of the instance.
    */
  var CreditSpecification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CreditSpecification] = js.native
  /**
    * If set to true, indicates that the instance cannot be terminated using the Amazon EC2 console, command line tool, or API.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The elastic GPU specification.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.native
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList] = js.native
  /**
    * Indicates whether an instance is configured for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI that was used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList] = js.native
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptions] = js.native
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.native
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement of the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacement] = js.native
  /**
    * The ID of the RAM disk, if applicable.
    */
  var RamDiskId: js.UndefOr[String] = js.native
  /**
    * The security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The security group names.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  /**
    * The tags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.native
  /**
    * The user data for the instance. 
    */
  var UserData: js.UndefOr[String] = js.native
}

object ResponseLaunchTemplateData {
  @scala.inline
  def apply(): ResponseLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseLaunchTemplateData]
  }
  @scala.inline
  implicit class ResponseLaunchTemplateDataOps[Self <: ResponseLaunchTemplateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingList): Self = {
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
    def withCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationResponse): Self = {
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
    def withCpuOptions(value: LaunchTemplateCpuOptions): Self = {
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
    def withCreditSpecification(value: CreditSpecification): Self = {
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
    def withElasticGpuSpecifications(value: ElasticGpuSpecificationResponseList): Self = {
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
    def withElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorResponseList): Self = {
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
    def withHibernationOptions(value: LaunchTemplateHibernationOptions): Self = {
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
    def withIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecification): Self = {
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
    def withInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptions): Self = {
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
    def withLicenseSpecifications(value: LaunchTemplateLicenseList): Self = {
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
    def withMetadataOptions(value: LaunchTemplateInstanceMetadataOptions): Self = {
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
    def withMonitoring(value: LaunchTemplatesMonitoring): Self = {
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
    def withNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationList): Self = {
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
    def withPlacement(value: LaunchTemplatePlacement): Self = {
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
    def withRamDiskId(value: String): Self = {
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
    def withSecurityGroupIds(value: ValueStringList): Self = {
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
    def withSecurityGroups(value: ValueStringList): Self = {
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
    def withTagSpecifications(value: LaunchTemplateTagSpecificationList): Self = {
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

