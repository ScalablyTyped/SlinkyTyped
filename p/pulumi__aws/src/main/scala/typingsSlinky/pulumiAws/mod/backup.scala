package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getPlanMod.GetPlanArgs
import typingsSlinky.pulumiAws.getPlanMod.GetPlanResult
import typingsSlinky.pulumiAws.getSelectionMod.GetSelectionArgs
import typingsSlinky.pulumiAws.getSelectionMod.GetSelectionResult
import typingsSlinky.pulumiAws.getVaultMod.GetVaultArgs
import typingsSlinky.pulumiAws.getVaultMod.GetVaultResult
import typingsSlinky.pulumiAws.planMod.PlanArgs
import typingsSlinky.pulumiAws.planMod.PlanState
import typingsSlinky.pulumiAws.selectionMod.SelectionArgs
import typingsSlinky.pulumiAws.selectionMod.SelectionState
import typingsSlinky.pulumiAws.vaultMod.VaultArgs
import typingsSlinky.pulumiAws.vaultMod.VaultState
import typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotificationsArgs
import typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotificationsState
import typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicyArgs
import typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backup {
  
  @JSImport("@pulumi/aws", "backup.Plan")
  @js.native
  class Plan protected ()
    extends typingsSlinky.pulumiAws.backupMod.Plan {
    /**
      * Create a Plan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlanArgs) = this()
    def this(name: String, args: PlanArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Plan {
    
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "backup.Plan.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws", "backup.Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws", "backup.Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState): typingsSlinky.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws", "backup.Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.planMod.Plan = js.native
    
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "backup.Plan.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "backup.Selection")
  @js.native
  class Selection protected ()
    extends typingsSlinky.pulumiAws.backupMod.Selection {
    /**
      * Create a Selection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SelectionArgs) = this()
    def this(name: String, args: SelectionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Selection {
    
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "backup.Selection.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws", "backup.Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws", "backup.Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState): typingsSlinky.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws", "backup.Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.selectionMod.Selection = js.native
    
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "backup.Selection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "backup.Vault")
  @js.native
  class Vault protected ()
    extends typingsSlinky.pulumiAws.backupMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Vault {
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "backup.Vault.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "backup.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "backup.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState): typingsSlinky.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "backup.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultMod.Vault = js.native
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "backup.Vault.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "backup.VaultNotifications")
  @js.native
  class VaultNotifications protected ()
    extends typingsSlinky.pulumiAws.backupMod.VaultNotifications {
    /**
      * Create a VaultNotifications resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultNotificationsArgs) = this()
    def this(name: String, args: VaultNotificationsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VaultNotifications {
    
    /**
      * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "backup.VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws", "backup.VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws", "backup.VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultNotificationsState): typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws", "backup.VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultNotificationsState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    
    /**
      * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "backup.VaultNotifications.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "backup.VaultPolicy")
  @js.native
  class VaultPolicy protected ()
    extends typingsSlinky.pulumiAws.backupMod.VaultPolicy {
    /**
      * Create a VaultPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultPolicyArgs) = this()
    def this(name: String, args: VaultPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VaultPolicy {
    
    /**
      * Get an existing VaultPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "backup.VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws", "backup.VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws", "backup.VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultPolicyState): typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws", "backup.VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of VaultPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "backup.VaultPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "backup.getPlan")
  @js.native
  def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = js.native
  @JSImport("@pulumi/aws", "backup.getPlan")
  @js.native
  def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = js.native
  
  @JSImport("@pulumi/aws", "backup.getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs): js.Promise[GetSelectionResult] = js.native
  @JSImport("@pulumi/aws", "backup.getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs, opts: InvokeOptions): js.Promise[GetSelectionResult] = js.native
  
  @JSImport("@pulumi/aws", "backup.getVault")
  @js.native
  def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = js.native
  @JSImport("@pulumi/aws", "backup.getVault")
  @js.native
  def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = js.native
}
