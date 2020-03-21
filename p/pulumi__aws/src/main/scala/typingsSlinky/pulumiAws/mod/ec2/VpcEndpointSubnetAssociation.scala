package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationArgs
import typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.VpcEndpointSubnetAssociation")
@js.native
class VpcEndpointSubnetAssociation protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.VpcEndpointSubnetAssociation {
  /**
    * Create a VpcEndpointSubnetAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointSubnetAssociationArgs) = this()
  def this(name: String, args: VpcEndpointSubnetAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.VpcEndpointSubnetAssociation")
@js.native
object VpcEndpointSubnetAssociation extends js.Object {
  /**
    * Get an existing VpcEndpointSubnetAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState): typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointSubnetAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointSubnetAssociation.VpcEndpointSubnetAssociation */ Boolean = js.native
}

