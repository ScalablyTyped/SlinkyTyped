package typingsSlinky.pulumiAws.defaultSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
@js.native
class DefaultSubnet protected () extends CustomResource {
  /**
    * Create a DefaultSubnet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultSubnetArgs) = this()
  def this(name: String, args: DefaultSubnetArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  val assignIpv6AddressOnCreation: Output_[Boolean] = js.native
  
  val availabilityZone: Output_[String] = js.native
  
  val availabilityZoneId: Output_[String] = js.native
  
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: Output_[String] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: Output_[String] = js.native
  
  val ipv6CidrBlockAssociationId: Output_[String] = js.native
  
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: Output_[Boolean] = js.native
  
  val outpostArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The VPC ID.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
@js.native
object DefaultSubnet extends js.Object {
  
  /**
    * Get an existing DefaultSubnet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DefaultSubnet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DefaultSubnet = js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState): DefaultSubnet = js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState, opts: CustomResourceOptions): DefaultSubnet = js.native
  
  /**
    * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ Boolean = js.native
}
