package typingsSlinky.pulumiAws.instanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.instanceTypeMod.InstanceType
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceCreditSpecification
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceEbsBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceEphemeralBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceMetadataOptions
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceNetworkInterface
import typingsSlinky.pulumiAws.outputMod.ec2.InstanceRootBlockDevice
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/instance", "Instance")
@js.native
class Instance protected () extends CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceArgs) = this()
  def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The AMI to use for the instance.
    */
  val ami: Output_[String] = js.native
  
  /**
    * The ARN of the instance.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: Output_[Boolean] = js.native
  
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: Output_[Double] = js.native
  
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: Output_[Double] = js.native
  
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: Output_[js.UndefOr[InstanceCreditSpecification]] = js.native
  
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: Output_[js.Array[InstanceEbsBlockDevice]] = js.native
  
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output_[js.Array[InstanceEphemeralBlockDevice]] = js.native
  
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * If true, the launched EC2 instance will support hibernation.
    */
  val hibernation: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: Output_[String] = js.native
  
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    */
  val iamInstanceProfile: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: Output_[String] = js.native
  
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: Output_[InstanceType] = js.native
  
  /**
    * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val ipv6AddressCount: Output_[Double] = js.native
  
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: Output_[js.Array[String]] = js.native
  
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
    */
  val keyName: Output_[String] = js.native
  
  /**
    * Customize the metadata options of the instance. See Metadata Options below for more details.
    */
  val metadataOptions: Output_[InstanceMetadataOptions] = js.native
  
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: Output_[js.Array[InstanceNetworkInterface]] = js.native
  
  /**
    * The ARN of the Outpost the instance is assigned to.
    */
  val outpostArn: Output_[String] = js.native
  
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `getPasswordData` is true.
    * Note that this encrypted value will be stored in the state file, as with all exported attributes.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: Output_[String] = js.native
  
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: Output_[String] = js.native
  
  /**
    * The ID of the instance's primary network interface.
    */
  val primaryNetworkInterfaceId: Output_[String] = js.native
  
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: Output_[String] = js.native
  
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: Output_[String] = js.native
  
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: Output_[String] = js.native
  
  /**
    * The public IP address assigned to the instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
    */
  val publicIp: Output_[String] = js.native
  
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: Output_[InstanceRootBlockDevice] = js.native
  
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    *
    * @deprecated Use of `securityGroups` is discouraged as it does not allow for changes and will force your instance to be replaced if changes are made. To avoid this, use `vpcSecurityGroupIds` which allows for updates.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: Output_[String] = js.native
  
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A map of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: Output_[StringDictionary[String]] = js.native
  
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/instance", "Instance")
@js.native
object Instance extends js.Object {
  
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Instance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
  
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/instance.Instance */ Boolean = js.native
}
