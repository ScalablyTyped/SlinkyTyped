package typingsSlinky.pulumiAws.ssmMod

import typingsSlinky.pulumiAws.ssmAssociationMod.AssociationArgs
import typingsSlinky.pulumiAws.ssmAssociationMod.AssociationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ssm", "Association")
@js.native
class Association protected ()
  extends typingsSlinky.pulumiAws.ssmAssociationMod.Association {
  /**
    * Create a Association resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AssociationArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/ssm", "Association")
@js.native
object Association extends js.Object {
  
  /**
    * Get an existing Association resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
  def get(name: String, id: Input[ID], state: AssociationState): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
  def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
  
  /**
    * Returns true if the given object is an instance of Association.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = js.native
}
