package typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterface", "HostedTransitVirtualInterface")
@js.native
class HostedTransitVirtualInterface protected () extends CustomResource {
  /**
    * Create a HostedTransitVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedTransitVirtualInterfaceArgs) = this()
  def this(name: String, args: HostedTransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Output_[String] = js.native
  
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: Output_[String] = js.native
  
  val amazonSideAsn: Output_[String] = js.native
  
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: Output_[String] = js.native
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Output_[Double] = js.native
  
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: Output_[String] = js.native
  
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Output_[String] = js.native
  
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: Output_[String] = js.native
  
  /**
    * Indicates whether jumbo frames (8500 MTU) are supported.
    */
  val jumboFrameCapable: Output_[Boolean] = js.native
  
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
    */
  val mtu: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The name for the virtual interface.
    */
  val name: Output_[String] = js.native
  
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: Output_[String] = js.native
  
  /**
    * The VLAN ID.
    */
  val vlan: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterface", "HostedTransitVirtualInterface")
@js.native
object HostedTransitVirtualInterface extends js.Object {
  
  /**
    * Get an existing HostedTransitVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): HostedTransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): HostedTransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceState): HostedTransitVirtualInterface = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedTransitVirtualInterfaceState,
    opts: CustomResourceOptions
  ): HostedTransitVirtualInterface = js.native
  
  /**
    * Returns true if the given object is an instance of HostedTransitVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean = js.native
}
