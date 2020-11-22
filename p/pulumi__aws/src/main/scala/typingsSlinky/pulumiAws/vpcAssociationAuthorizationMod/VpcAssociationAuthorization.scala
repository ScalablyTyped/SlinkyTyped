package typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization")
@js.native
class VpcAssociationAuthorization protected () extends CustomResource {
  /**
    * Create a VpcAssociationAuthorization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcAssociationAuthorizationArgs) = this()
  def this(name: String, args: VpcAssociationAuthorizationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The VPC to authorize for association with the private hosted zone.
    */
  val vpcId: Output_[String] = js.native
  
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: Output_[String] = js.native
  
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  val zoneId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization")
@js.native
object VpcAssociationAuthorization extends js.Object {
  
  /**
    * Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcAssociationAuthorization = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcAssociationAuthorization = js.native
  def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState): VpcAssociationAuthorization = js.native
  def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState, opts: CustomResourceOptions): VpcAssociationAuthorization = js.native
  
  /**
    * Returns true if the given object is an instance of VpcAssociationAuthorization.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean = js.native
}
