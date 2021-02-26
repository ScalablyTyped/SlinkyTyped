package typingsSlinky.pulumiAws.mod.iam

import typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachmentArgs
import typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachmentState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.RolePolicyAttachment")
@js.native
class RolePolicyAttachment protected ()
  extends typingsSlinky.pulumiAws.iamMod.RolePolicyAttachment {
  /**
    * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RolePolicyAttachmentArgs) = this()
  def this(name: String, args: RolePolicyAttachmentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object RolePolicyAttachment {
  
  /**
    * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: RolePolicyAttachmentState): typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: RolePolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of RolePolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicyAttachment.RolePolicyAttachment */ Boolean = js.native
}
