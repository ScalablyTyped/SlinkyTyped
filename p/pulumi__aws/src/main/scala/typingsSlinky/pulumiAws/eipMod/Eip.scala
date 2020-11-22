package typingsSlinky.pulumiAws.eipMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
class Eip protected () extends CustomResource {
  /**
    * Create a Eip resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EipArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EipArgs, opts: CustomResourceOptions) = this()
  
  val allocationId: Output_[String] = js.native
  
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: Output_[js.UndefOr[String]] = js.native
  
  val associationId: Output_[String] = js.native
  
  /**
    * Customer owned IP.
    */
  val customerOwnedIp: Output_[String] = js.native
  
  /**
    * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
    */
  val customerOwnedIpv4Pool: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
    */
  val domain: Output_[String] = js.native
  
  /**
    * EC2 instance ID.
    */
  val instance: Output_[String] = js.native
  
  /**
    * The location from which the IP address is advertised. Use this parameter to limit the address to this location.
    */
  val networkBorderGroup: Output_[String] = js.native
  
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: Output_[String] = js.native
  
  /**
    * The Private DNS associated with the Elastic IP address (if in VPC).
    */
  val privateDns: Output_[String] = js.native
  
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: Output_[String] = js.native
  
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: Output_[String] = js.native
  
  /**
    * Contains the public IP address.
    */
  val publicIp: Output_[String] = js.native
  
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: Output_[Boolean] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
object Eip extends js.Object {
  
  /**
    * Get an existing Eip resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Eip = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Eip = js.native
  def get(name: String, id: Input[ID], state: EipState): Eip = js.native
  def get(name: String, id: Input[ID], state: EipState, opts: CustomResourceOptions): Eip = js.native
  
  /**
    * Returns true if the given object is an instance of Eip.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ Boolean = js.native
}
