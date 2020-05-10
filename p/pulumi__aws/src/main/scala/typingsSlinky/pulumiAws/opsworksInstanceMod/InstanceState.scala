package typingsSlinky.pulumiAws.opsworksInstanceMod

import typingsSlinky.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice
import typingsSlinky.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice
import typingsSlinky.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: js.UndefOr[Input[String]] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
    */
  val architecture: js.UndefOr[Input[String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  val createdAt: js.UndefOr[Input[String]] = js.native
  val deleteEbs: js.UndefOr[Input[Boolean]] = js.native
  val deleteEip: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: js.UndefOr[Input[String]] = js.native
  val ecsClusterArn: js.UndefOr[Input[String]] = js.native
  val elasticIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEphemeralBlockDevice]]]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: js.UndefOr[Input[String]] = js.native
  val infrastructureClass: js.UndefOr[Input[String]] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  val instanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  val lastServiceErrorId: js.UndefOr[Input[String]] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: js.UndefOr[Input[String]] = js.native
  val platform: js.UndefOr[Input[String]] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: js.UndefOr[Input[String]] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  val registeredBy: js.UndefOr[Input[String]] = js.native
  val reportedAgentVersion: js.UndefOr[Input[String]] = js.native
  val reportedOsFamily: js.UndefOr[Input[String]] = js.native
  val reportedOsName: js.UndefOr[Input[String]] = js.native
  val reportedOsVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceRootBlockDevice]]]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: js.UndefOr[Input[String]] = js.native
  val rootDeviceVolumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val sshHostDsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  val sshHostRsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.native
}

object InstanceState {
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAmiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(js.undefined)
        ret
    }
    @scala.inline
    def withArchitecture(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingType")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteEbs(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteEbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEbs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteEip(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteEip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEip")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: Input[js.Array[Input[InstanceEbsBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InstanceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsClusterArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIp")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralBlockDevices(value: Input[js.Array[Input[InstanceEphemeralBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withInfrastructureClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfrastructureClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallUpdatesOnBoot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUpdatesOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallUpdatesOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUpdatesOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProfileArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastServiceErrorId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastServiceErrorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastServiceErrorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastServiceErrorId")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDns(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDns")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIp")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDns(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDns")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredBy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredBy")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedAgentVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedAgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedAgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedOsFamily(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedOsFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedOsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedOsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsName")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedOsVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedOsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRootBlockDevices(value: Input[js.Array[Input[InstanceRootBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDeviceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDeviceVolumeId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceVolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceVolumeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
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
    def withSshHostDsaKeyFingerprint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHostDsaKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshHostDsaKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHostDsaKeyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withSshHostRsaKeyFingerprint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHostRsaKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshHostRsaKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHostRsaKeyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withSshKeyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTenancy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationType")(js.undefined)
        ret
    }
  }
  
}

