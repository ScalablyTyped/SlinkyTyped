package typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/vpcEndpointSubnetAssociation", "VpcEndpointSubnetAssociation")
@js.native
class VpcEndpointSubnetAssociation protected () extends CustomResource {
  /**
    * Create a VpcEndpointSubnetAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointSubnetAssociationArgs) = this()
  def this(name: String, args: VpcEndpointSubnetAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: Output_[String] = js.native
  
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpointSubnetAssociation", "VpcEndpointSubnetAssociation")
@js.native
object VpcEndpointSubnetAssociation extends js.Object {
  
  /**
    * Get an existing VpcEndpointSubnetAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcEndpointSubnetAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpointSubnetAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState): VpcEndpointSubnetAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState, opts: CustomResourceOptions): VpcEndpointSubnetAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of VpcEndpointSubnetAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointSubnetAssociation.VpcEndpointSubnetAssociation */ Boolean = js.native
}
