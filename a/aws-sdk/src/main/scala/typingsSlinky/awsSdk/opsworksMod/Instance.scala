package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The agent version. This parameter is set to INHERIT if the instance inherits the default stack setting or to a a version number for a fixed agent version.
    */
  var AgentVersion: js.UndefOr[String] = js.native
  /**
    * A custom AMI ID to be used to create the instance. For more information, see Instances 
    */
  var AmiId: js.UndefOr[String] = js.native
  /**
    * The instance architecture: "i386" or "x86_64".
    */
  var Architecture: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Architecture] = js.native
  /**
    * The instance's Amazon Resource Number (ARN).
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * For load-based or time-based instances, the type.
    */
  var AutoScalingType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.AutoScalingType] = js.native
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.BlockDeviceMappings] = js.native
  /**
    * The time that the instance was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * Whether this is an Amazon EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the associated Amazon EC2 instance.
    */
  var Ec2InstanceId: js.UndefOr[String] = js.native
  /**
    * For container instances, the Amazon ECS cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
  /**
    * For container instances, the instance's ARN.
    */
  var EcsContainerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance Elastic IP address .
    */
  var ElasticIp: js.UndefOr[String] = js.native
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * For registered instances, the infrastructure class: ec2 or on-premises.
    */
  var InfrastructureClass: js.UndefOr[String] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The ARN of the instance's IAM profile. For more information about IAM ARNs, see Using Identifiers.
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * The instance type, such as t2.micro.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the last service error. For more information, call DescribeServiceErrors.
    */
  var LastServiceErrorId: js.UndefOr[String] = js.native
  /**
    * An array containing the instance layer IDs.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  /**
    * The instance's operating system.
    */
  var Os: js.UndefOr[String] = js.native
  /**
    * The instance's platform.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The instance's private DNS name.
    */
  var PrivateDns: js.UndefOr[String] = js.native
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  /**
    * The instance public DNS name.
    */
  var PublicDns: js.UndefOr[String] = js.native
  /**
    * The instance public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * For registered instances, who performed the registration.
    */
  var RegisteredBy: js.UndefOr[String] = js.native
  /**
    * The instance's reported AWS OpsWorks Stacks agent version.
    */
  var ReportedAgentVersion: js.UndefOr[String] = js.native
  /**
    * For registered instances, the reported operating system.
    */
  var ReportedOs: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ReportedOs] = js.native
  /**
    * The instance's root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.RootDeviceType] = js.native
  /**
    * The root device volume ID.
    */
  var RootDeviceVolumeId: js.UndefOr[String] = js.native
  /**
    * An array containing the instance security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * The SSH key's Deep Security Agent (DSA) fingerprint.
    */
  var SshHostDsaKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The SSH key's RSA fingerprint.
    */
  var SshHostRsaKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The instance's Amazon EC2 key-pair name.
    */
  var SshKeyName: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The instance status:    booting     connection_lost     online     pending     rebooting     requested     running_setup     setup_failed     shutting_down     start_failed     stop_failed     stopped     stopping     terminated     terminating   
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The instance's subnet ID; applicable only if the stack is running in a VPC.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The instance's tenancy option, such as dedicated or host.
    */
  var Tenancy: js.UndefOr[String] = js.native
  /**
    * The instance's virtualization type: paravirtual or hvm.
    */
  var VirtualizationType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.VirtualizationType] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withCreatedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
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
    def withEc2InstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsContainerInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsContainerInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsContainerInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsContainerInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIp")(js.undefined)
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
    def withInfrastructureClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfrastructureClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfrastructureClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfrastructureClass")(js.undefined)
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
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
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
    def withLastServiceErrorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastServiceErrorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastServiceErrorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastServiceErrorId")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(js.undefined)
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
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDns")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIp")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDns")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredBy")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedAgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedAgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedOs(value: ReportedOs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedOs")(js.undefined)
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
    def withRootDeviceVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceVolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceVolumeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Strings): Self = {
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
    def withSshHostDsaKeyFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshHostDsaKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshHostDsaKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshHostDsaKeyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withSshHostRsaKeyFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshHostRsaKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshHostRsaKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshHostRsaKeyFingerprint")(js.undefined)
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
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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
    def withVirtualizationType(value: VirtualizationType): Self = {
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

