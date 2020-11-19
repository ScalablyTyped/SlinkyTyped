package typingsSlinky.pulumiAws.mod.iam

import typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachmentArgs
import typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachmentState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.GroupPolicyAttachment")
@js.native
class GroupPolicyAttachment protected ()
  extends typingsSlinky.pulumiAws.iamMod.GroupPolicyAttachment {
  /**
    * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupPolicyAttachmentArgs) = this()
  def this(name: String, args: GroupPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "iam.GroupPolicyAttachment")
@js.native
object GroupPolicyAttachment extends js.Object {
  
  /**
    * Get an existing GroupPolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState): typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of GroupPolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicyAttachment.GroupPolicyAttachment */ Boolean = js.native
}
