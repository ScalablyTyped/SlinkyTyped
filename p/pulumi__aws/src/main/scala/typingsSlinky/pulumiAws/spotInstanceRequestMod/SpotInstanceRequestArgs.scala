package typingsSlinky.pulumiAws.spotInstanceRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification
import typingsSlinky.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice
import typingsSlinky.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice
import typingsSlinky.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface
import typingsSlinky.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestArgs extends js.Object {
  /**
    * The AMI to use for the instance.
    */
  val ami: Input[String] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
    */
  val blockDurationMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: js.UndefOr[Input[Double]] = js.native
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.native
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: js.UndefOr[Input[SpotInstanceRequestCreditSpecification]] = js.native
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestEphemeralBlockDevice]]]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, the launched EC2 instance will support hibernation.
    */
  val hibernation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6AddressCount`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: js.UndefOr[Input[String]] = js.native
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
    */
  val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: Input[String] = js.native
  val ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * A launch group is a group of spot instances that launch together and terminate together.
    * If left empty instances are launched and terminated individually.
    */
  val launchGroup: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]]] = js.native
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: js.UndefOr[Input[String]] = js.native
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[Input[SpotInstanceRequestRootBlockDevice]] = js.native
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum price to request on the spot market.
    */
  val spotPrice: js.UndefOr[Input[String]] = js.native
  /**
    * If set to `one-time`, after
    * the instance is terminated, the spot request will be closed.
    */
  val spotType: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: js.UndefOr[Input[String]] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: js.UndefOr[Input[String]] = js.native
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: js.UndefOr[Input[String]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: js.UndefOr[Input[String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
    */
  val validUntil: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * If set, this provider will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
}

object SpotInstanceRequestArgs {
  @scala.inline
  def apply(ami: Input[String], instanceType: Input[String]): SpotInstanceRequestArgs = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestArgs]
  }
  @scala.inline
  implicit class SpotInstanceRequestArgsOps[Self <: SpotInstanceRequestArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmi(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ami")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatePublicIpAddress(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(js.undefined)
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
    def withBlockDurationMinutes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDurationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDurationMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDurationMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuCoreCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCoreCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCoreCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCoreCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuThreadsPerCore(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuThreadsPerCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuThreadsPerCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuThreadsPerCore")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditSpecification(value: Input[SpotInstanceRequestCreditSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableApiTermination(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApiTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableApiTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApiTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: Input[js.Array[Input[SpotInstanceRequestEbsBlockDevice]]]): Self = {
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
    def withEphemeralBlockDevices(value: Input[js.Array[Input[SpotInstanceRequestEphemeralBlockDevice]]]): Self = {
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
    def withGetPasswordData(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPasswordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(js.undefined)
        ret
    }
    @scala.inline
    def withHibernation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hibernation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHibernation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hibernation")(js.undefined)
        ret
    }
    @scala.inline
    def withHostId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInitiatedShutdownBehavior(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInitiatedShutdownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInitiatedShutdownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInitiatedShutdownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInterruptionBehaviour(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6AddressCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6AddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroup(value: Input[String]): Self = {
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
    def withRootBlockDevice(value: Input[SpotInstanceRequestRootBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootBlockDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDestCheck(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDestCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDestCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDestCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotType")(js.undefined)
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withUserData(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDataBase64(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withValidFrom(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeTags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForFulfillment(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFulfillment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForFulfillment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFulfillment")(js.undefined)
        ret
    }
  }
  
}

