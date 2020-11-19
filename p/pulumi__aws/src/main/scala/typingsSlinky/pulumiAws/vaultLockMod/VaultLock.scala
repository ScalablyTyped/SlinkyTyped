package typingsSlinky.pulumiAws.vaultLockMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock")
@js.native
class VaultLock protected () extends CustomResource {
  /**
    * Create a VaultLock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VaultLockArgs) = this()
  def this(name: String, args: VaultLockArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: Output_[Boolean] = js.native
  
  /**
    * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
    */
  val ignoreDeletionError: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: Output_[String] = js.native
  
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock")
@js.native
object VaultLock extends js.Object {
  
  /**
    * Get an existing VaultLock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VaultLock = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VaultLock = js.native
  def get(name: String, id: Input[ID], state: VaultLockState): VaultLock = js.native
  def get(name: String, id: Input[ID], state: VaultLockState, opts: CustomResourceOptions): VaultLock = js.native
  
  /**
    * Returns true if the given object is an instance of VaultLock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ Boolean = js.native
}
