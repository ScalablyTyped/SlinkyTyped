package typingsSlinky.pulumiAws.mainRouteTableAssociationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/mainRouteTableAssociation", "MainRouteTableAssociation")
@js.native
class MainRouteTableAssociation protected () extends CustomResource {
  /**
    * Create a MainRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MainRouteTableAssociationArgs) = this()
  def this(name: String, args: MainRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Used internally, see __Notes__ below
    */
  val originalRouteTableId: Output_[String] = js.native
  
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: Output_[String] = js.native
  
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/mainRouteTableAssociation", "MainRouteTableAssociation")
@js.native
object MainRouteTableAssociation extends js.Object {
  
  /**
    * Get an existing MainRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MainRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MainRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: MainRouteTableAssociationState): MainRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: MainRouteTableAssociationState, opts: CustomResourceOptions): MainRouteTableAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of MainRouteTableAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/mainRouteTableAssociation.MainRouteTableAssociation */ Boolean = js.native
}
