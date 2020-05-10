package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceRequest extends js.Object {
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
    */
  var AgentVersion: js.UndefOr[String] = js.native
  /**
    * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating systems. For more information, see Using Custom AMIs.  If you specify a custom AMI, you must set Os to Custom. 
    */
  var AmiId: js.UndefOr[String] = js.native
  /**
    * The instance architecture. The default option is x86_64. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
    */
  var Architecture: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Architecture] = js.native
  /**
    * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
    */
  var AutoScalingType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.AutoScalingType] = js.native
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block devices. For more information, see Block Device Mapping. Note that block device mappings are not supported for custom AMIs.
    */
  var BlockDeviceMappings: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.BlockDeviceMappings] = js.native
  /**
    * Whether to create an Amazon EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
    */
  var InstanceType: String = js.native
  /**
    * An array that contains the instance's layer IDs.
    */
  var LayerIds: Strings = js.native
  /**
    * The instance's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom.   For more information about the supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the CreateInstance action's AmiId parameter to specify the custom AMI that you want to use. Block device mappings are not supported if the value is Custom. For more information about supported operating systems, see Operating SystemsFor more information about how to use custom AMIs with AWS OpsWorks Stacks, see Using Custom AMIs.
    */
  var Os: js.UndefOr[String] = js.native
  /**
    * The instance root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.RootDeviceType] = js.native
  /**
    * The instance's Amazon EC2 key-pair name.
    */
  var SshKeyName: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
  /**
    * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy settings from the VPC. The following are valid values for this parameter: dedicated, default, or host. Because there are costs associated with changes in tenancy options, we recommend that you research tenancy options before choosing them for your instances. For more information about dedicated hosts, see Dedicated Hosts Overview and Amazon EC2 Dedicated Hosts. For more information about dedicated instances, see Dedicated Instances and Amazon EC2 Dedicated Instances.
    */
  var Tenancy: js.UndefOr[String] = js.native
  /**
    * The instance's virtualization type, paravirtual or hvm.
    */
  var VirtualizationType: js.UndefOr[String] = js.native
}

object CreateInstanceRequest {
  @scala.inline
  def apply(InstanceType: String, LayerIds: Strings, StackId: String): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], LayerIds = LayerIds.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  @scala.inline
  implicit class CreateInstanceRequestOps[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAmiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmiId")(js.undefined)
        ret
    }
    @scala.inline
    def withArchitecture(value: Architecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingType(value: AutoScalingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingType")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
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
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallUpdatesOnBoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallUpdatesOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallUpdatesOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallUpdatesOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Os")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDeviceType(value: RootDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSshKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshKeyName")(js.undefined)
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
    def withTenancy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(js.undefined)
        ret
    }
  }
  
}

