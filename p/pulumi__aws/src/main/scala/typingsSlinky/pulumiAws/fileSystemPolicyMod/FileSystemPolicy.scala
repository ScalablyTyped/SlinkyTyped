package typingsSlinky.pulumiAws.fileSystemPolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy")
@js.native
class FileSystemPolicy protected () extends CustomResource {
  /**
    * Create a FileSystemPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FileSystemPolicyArgs) = this()
  def this(name: String, args: FileSystemPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the EFS file system.
    */
  val fileSystemId: Output_[String] = js.native
  
  /**
    * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
    */
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy")
@js.native
object FileSystemPolicy extends js.Object {
  
  /**
    * Get an existing FileSystemPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): FileSystemPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FileSystemPolicy = js.native
  def get(name: String, id: Input[ID], state: FileSystemPolicyState): FileSystemPolicy = js.native
  def get(name: String, id: Input[ID], state: FileSystemPolicyState, opts: CustomResourceOptions): FileSystemPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of FileSystemPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean = js.native
}
