package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vaultLockMod {
  
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
  object VaultLock {
    
    /**
      * Get an existing VaultLock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID]): VaultLock = js.native
    @JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VaultLock = js.native
    @JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultLockState): VaultLock = js.native
    @JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultLockState, opts: CustomResourceOptions): VaultLock = js.native
    
    /**
      * Returns true if the given object is an instance of VaultLock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ Boolean = js.native
  }
  
  @js.native
  trait VaultLockArgs extends StObject {
    
    /**
      * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
      */
    val completeLock: Input[Boolean] = js.native
    
    /**
      * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
      */
    val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
      */
    val policy: Input[String] = js.native
    
    /**
      * The name of the Glacier Vault.
      */
    val vaultName: Input[String] = js.native
  }
  object VaultLockArgs {
    
    @scala.inline
    def apply(completeLock: Input[Boolean], policy: Input[String], vaultName: Input[String]): VaultLockArgs = {
      val __obj = js.Dynamic.literal(completeLock = completeLock.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultLockArgs]
    }
    
    @scala.inline
    implicit class VaultLockArgsMutableBuilder[Self <: VaultLockArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleteLock(value: Input[Boolean]): Self = StObject.set(x, "completeLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDeletionError(value: Input[Boolean]): Self = StObject.set(x, "ignoreDeletionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDeletionErrorUndefined: Self = StObject.set(x, "ignoreDeletionError", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultName(value: Input[String]): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VaultLockState extends StObject {
    
    /**
      * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
      */
    val completeLock: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
      */
    val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Glacier Vault.
      */
    val vaultName: js.UndefOr[Input[String]] = js.native
  }
  object VaultLockState {
    
    @scala.inline
    def apply(): VaultLockState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultLockState]
    }
    
    @scala.inline
    implicit class VaultLockStateMutableBuilder[Self <: VaultLockState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleteLock(value: Input[Boolean]): Self = StObject.set(x, "completeLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteLockUndefined: Self = StObject.set(x, "completeLock", js.undefined)
      
      @scala.inline
      def setIgnoreDeletionError(value: Input[Boolean]): Self = StObject.set(x, "ignoreDeletionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDeletionErrorUndefined: Self = StObject.set(x, "ignoreDeletionError", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setVaultName(value: Input[String]): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultNameUndefined: Self = StObject.set(x, "vaultName", js.undefined)
    }
  }
}
