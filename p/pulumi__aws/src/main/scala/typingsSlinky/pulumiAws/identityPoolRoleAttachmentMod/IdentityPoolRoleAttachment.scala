package typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
@js.native
class IdentityPoolRoleAttachment protected () extends CustomResource {
  /**
    * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityPoolRoleAttachmentArgs) = this()
  def this(name: String, args: IdentityPoolRoleAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: Output_[String] = js.native
  
  /**
    * A List of Role Mapping.
    */
  val roleMappings: Output_[js.UndefOr[js.Array[IdentityPoolRoleAttachmentRoleMapping]]] = js.native
  
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: Output_[StringDictionary[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
@js.native
object IdentityPoolRoleAttachment extends js.Object {
  
  /**
    * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IdentityPoolRoleAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IdentityPoolRoleAttachment = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): IdentityPoolRoleAttachment = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): IdentityPoolRoleAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
}
