package typingsSlinky.pulumiAws.launchConfigurationMod

import typingsSlinky.pulumiAws.outputMod.ec2.LaunchConfigurationEbsBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.LaunchConfigurationEphemeralBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.LaunchConfigurationRootBlockDevice
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
@js.native
class LaunchConfiguration protected () extends CustomResource {
  /**
    * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LaunchConfigurationArgs) = this()
  def this(name: String, args: LaunchConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name of the launch configuration.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Associate a public ip address with an instance in a VPC.
    */
  val associatePublicIpAddress: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: Output_[js.Array[LaunchConfigurationEbsBlockDevice]] = js.native
  
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output_[Boolean] = js.native
  
  /**
    * Enables/disables detailed monitoring. This is enabled by default.
    */
  val enableMonitoring: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output_[js.UndefOr[js.Array[LaunchConfigurationEphemeralBlockDevice]]] = js.native
  
  /**
    * The name attribute of the IAM instance profile to associate
    * with launched instances.
    */
  val iamInstanceProfile: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The EC2 image ID to launch.
    */
  val imageId: Output_[String] = js.native
  
  /**
    * The size of instance to launch.
    */
  val instanceType: Output_[String] = js.native
  
  /**
    * The key name that should be used for the instance.
    */
  val keyName: Output_[String] = js.native
  
  /**
    * The name of the launch configuration. If you leave
    * this blank, this provider will auto-generate a unique name.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The tenancy of the instance. Valid values are
    * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
    * for more details
    */
  val placementTenancy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: Output_[LaunchConfigurationRootBlockDevice] = js.native
  
  /**
    * A list of associated security group IDS.
    */
  val securityGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The maximum price to use for reserving spot instances.
    */
  val spotPrice: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
    */
  val vpcClassicLinkId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
    */
  val vpcClassicLinkSecurityGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
@js.native
object LaunchConfiguration extends js.Object {
  
  /**
    * Get an existing LaunchConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState): LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState, opts: CustomResourceOptions): LaunchConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ Boolean = js.native
}
