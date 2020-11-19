package typingsSlinky.pulumiAws.userMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam/user", "User")
@js.native
class User protected () extends CustomResource {
  /**
    * Create a User resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UserArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN assigned by AWS for this user.
    */
  val arn: Output_[String] = js.native
  
  /**
    * When destroying this user, destroy even if it
    * has non-provider-managed IAM access keys, login profile or MFA devices. Without `forceDestroy`
    * a user with non-provider-managed access keys and login profile will fail to be destroyed.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
    */
  val name: Output_[String] = js.native
  
  /**
    * Path in which to create the user.
    */
  val path: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value mapping of tags for the IAM user
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/iam/user", "User")
@js.native
object User extends js.Object {
  
  /**
    * Get an existing User resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): User = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): User = js.native
  def get(name: String, id: Input[ID], state: UserState): User = js.native
  def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): User = js.native
  
  /**
    * Returns true if the given object is an instance of User.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/user.User */ Boolean = js.native
}
