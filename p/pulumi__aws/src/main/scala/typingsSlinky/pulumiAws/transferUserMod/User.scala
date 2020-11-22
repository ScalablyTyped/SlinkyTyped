package typingsSlinky.pulumiAws.transferUserMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.transfer.UserHomeDirectoryMapping
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/transfer/user", "User")
@js.native
class User protected () extends CustomResource {
  /**
    * Create a User resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserArgs) = this()
  def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of Transfer User
    */
  val arn: Output_[String] = js.native
  
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
    */
  val homeDirectory: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. documented below.
    */
  val homeDirectoryMappings: Output_[js.UndefOr[js.Array[UserHomeDirectoryMapping]]] = js.native
  
  /**
    * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
    */
  val homeDirectoryType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
    */
  val policy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
    */
  val role: Output_[String] = js.native
  
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The name used for log in to your SFTP server.
    */
  val userName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/transfer/user", "User")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = js.native
}
