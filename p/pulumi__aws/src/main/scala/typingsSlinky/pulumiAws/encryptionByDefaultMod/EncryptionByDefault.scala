package typingsSlinky.pulumiAws.encryptionByDefaultMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault")
@js.native
class EncryptionByDefault protected () extends CustomResource {
  /**
    * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EncryptionByDefaultArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault")
@js.native
object EncryptionByDefault extends js.Object {
  
  /**
    * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EncryptionByDefault = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EncryptionByDefault = js.native
  def get(name: String, id: Input[ID], state: EncryptionByDefaultState): EncryptionByDefault = js.native
  def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): EncryptionByDefault = js.native
  
  /**
    * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
}
