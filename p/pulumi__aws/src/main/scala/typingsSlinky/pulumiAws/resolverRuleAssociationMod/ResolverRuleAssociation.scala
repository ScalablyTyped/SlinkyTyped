package typingsSlinky.pulumiAws.resolverRuleAssociationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53/resolverRuleAssociation", "ResolverRuleAssociation")
@js.native
class ResolverRuleAssociation protected () extends CustomResource {
  /**
    * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverRuleAssociationArgs) = this()
  def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  val name: Output_[String] = js.native
  
  /**
    * The ID of the resolver rule that you want to associate with the VPC.
    */
  val resolverRuleId: Output_[String] = js.native
  
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/route53/resolverRuleAssociation", "ResolverRuleAssociation")
@js.native
object ResolverRuleAssociation extends js.Object {
  
  /**
    * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ResolverRuleAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResolverRuleAssociation = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): ResolverRuleAssociation = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): ResolverRuleAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
}
