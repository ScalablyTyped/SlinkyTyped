package typingsSlinky.pulumiAws.patchGroupMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup")
@js.native
class PatchGroup protected () extends CustomResource {
  /**
    * Create a PatchGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PatchGroupArgs) = this()
  def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: Output_[String] = js.native
  
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup")
@js.native
object PatchGroup extends js.Object {
  
  /**
    * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PatchGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PatchGroup = js.native
  def get(name: String, id: Input[ID], state: PatchGroupState): PatchGroup = js.native
  def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): PatchGroup = js.native
  
  /**
    * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
}
