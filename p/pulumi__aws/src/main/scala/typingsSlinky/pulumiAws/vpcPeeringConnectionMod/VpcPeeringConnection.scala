package typingsSlinky.pulumiAws.vpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepter
import typingsSlinky.pulumiAws.outputMod.ec2.VpcPeeringConnectionRequester
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection")
@js.native
class VpcPeeringConnection protected () extends CustomResource {
  /**
    * Create a VpcPeeringConnection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcPeeringConnectionArgs) = this()
  def this(name: String, args: VpcPeeringConnectionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: Output_[String] = js.native
  
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: Output_[VpcPeeringConnectionAccepter] = js.native
  
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val peerOwnerId: Output_[String] = js.native
  
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
    * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
    */
  val peerRegion: Output_[String] = js.native
  
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: Output_[String] = js.native
  
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: Output_[VpcPeeringConnectionRequester] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The ID of the requester VPC.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection")
@js.native
object VpcPeeringConnection extends js.Object {
  
  /**
    * Get an existing VpcPeeringConnection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcPeeringConnection = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcPeeringConnection = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionState): VpcPeeringConnection = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionState, opts: CustomResourceOptions): VpcPeeringConnection = js.native
  
  /**
    * Returns true if the given object is an instance of VpcPeeringConnection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnection.VpcPeeringConnection */ Boolean = js.native
}
