package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs
import typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation")
@js.native
class VpcEndpointRouteTableAssociation protected ()
  extends typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation {
  /**
    * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs) = this()
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object VpcEndpointRouteTableAssociation {
  
  /**
    * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  @JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  @JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpcEndpointRouteTableAssociationState): typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  @JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation.get")
  @js.native
  def get(
    name: String,
    id: Input[ID],
    state: VpcEndpointRouteTableAssociationState,
    opts: CustomResourceOptions
  ): typingsSlinky.pulumiAws.vpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean = js.native
}
