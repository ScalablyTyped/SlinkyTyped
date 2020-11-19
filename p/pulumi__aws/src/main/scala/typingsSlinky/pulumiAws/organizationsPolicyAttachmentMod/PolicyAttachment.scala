package typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment")
@js.native
class PolicyAttachment protected () extends CustomResource {
  /**
    * Create a PolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyAttachmentArgs) = this()
  def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: Output_[String] = js.native
  
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment")
@js.native
object PolicyAttachment extends js.Object {
  
  /**
    * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
}
