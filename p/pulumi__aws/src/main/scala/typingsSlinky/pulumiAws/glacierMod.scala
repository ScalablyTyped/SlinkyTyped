package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.glacierVaultMod.VaultArgs
import typingsSlinky.pulumiAws.glacierVaultMod.VaultState
import typingsSlinky.pulumiAws.vaultLockMod.VaultLockArgs
import typingsSlinky.pulumiAws.vaultLockMod.VaultLockState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glacier", JSImport.Namespace)
@js.native
object glacierMod extends js.Object {
  @js.native
  class Vault protected ()
    extends typingsSlinky.pulumiAws.glacierVaultMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VaultLock protected ()
    extends typingsSlinky.pulumiAws.vaultLockMod.VaultLock {
    /**
      * Create a VaultLock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultLockArgs) = this()
    def this(name: String, args: VaultLockArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Vault extends js.Object {
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.glacierVaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState): typingsSlinky.pulumiAws.glacierVaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.glacierVaultMod.Vault = js.native
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VaultLock extends js.Object {
    /**
      * Get an existing VaultLock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vaultLockMod.VaultLock = js.native
    def get(name: String, id: Input[ID], state: VaultLockState): typingsSlinky.pulumiAws.vaultLockMod.VaultLock = js.native
    def get(name: String, id: Input[ID], state: VaultLockState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultLockMod.VaultLock = js.native
    /**
      * Returns true if the given object is an instance of VaultLock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ Boolean = js.native
  }
  
}

