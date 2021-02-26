package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.activationMod.ActivationArgs
import typingsSlinky.pulumiAws.activationMod.ActivationState
import typingsSlinky.pulumiAws.documentMod.DocumentArgs
import typingsSlinky.pulumiAws.documentMod.DocumentState
import typingsSlinky.pulumiAws.enumsSsmMod.ParameterType
import typingsSlinky.pulumiAws.getDocumentMod.GetDocumentArgs
import typingsSlinky.pulumiAws.getDocumentMod.GetDocumentResult
import typingsSlinky.pulumiAws.getParameterMod.GetParameterArgs
import typingsSlinky.pulumiAws.getParameterMod.GetParameterResult
import typingsSlinky.pulumiAws.getPatchBaselineMod.GetPatchBaselineArgs
import typingsSlinky.pulumiAws.getPatchBaselineMod.GetPatchBaselineResult
import typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindowArgs
import typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindowState
import typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetArgs
import typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetState
import typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskArgs
import typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskState
import typingsSlinky.pulumiAws.parameterMod.ParameterArgs
import typingsSlinky.pulumiAws.parameterMod.ParameterState
import typingsSlinky.pulumiAws.patchBaselineMod.PatchBaselineArgs
import typingsSlinky.pulumiAws.patchBaselineMod.PatchBaselineState
import typingsSlinky.pulumiAws.patchGroupMod.PatchGroupArgs
import typingsSlinky.pulumiAws.patchGroupMod.PatchGroupState
import typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSyncArgs
import typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSyncState
import typingsSlinky.pulumiAws.ssmAssociationMod.AssociationArgs
import typingsSlinky.pulumiAws.ssmAssociationMod.AssociationState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssmMod {
  
  @JSImport("@pulumi/aws/ssm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/ssm", "Activation")
  @js.native
  class Activation protected ()
    extends typingsSlinky.pulumiAws.activationMod.Activation {
    /**
      * Create a Activation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActivationArgs) = this()
    def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Activation {
    
    /**
      * Get an existing Activation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.activationMod.Activation = js.native
    @JSImport("@pulumi/aws/ssm", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.activationMod.Activation = js.native
    @JSImport("@pulumi/aws/ssm", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivationState): typingsSlinky.pulumiAws.activationMod.Activation = js.native
    @JSImport("@pulumi/aws/ssm", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.activationMod.Activation = js.native
    
    /**
      * Returns true if the given object is an instance of Activation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "Activation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "Association")
  @js.native
  class Association protected ()
    extends typingsSlinky.pulumiAws.ssmAssociationMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Association {
    
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "Association.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
    @JSImport("@pulumi/aws/ssm", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
    @JSImport("@pulumi/aws/ssm", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssociationState): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
    @JSImport("@pulumi/aws/ssm", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ssmAssociationMod.Association = js.native
    
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "Association.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "Document")
  @js.native
  class Document protected ()
    extends typingsSlinky.pulumiAws.documentMod.Document {
    /**
      * Create a Document resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentArgs) = this()
    def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Document {
    
    /**
      * Get an existing Document resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "Document.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.documentMod.Document = js.native
    @JSImport("@pulumi/aws/ssm", "Document.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.documentMod.Document = js.native
    @JSImport("@pulumi/aws/ssm", "Document.get")
    @js.native
    def get(name: String, id: Input[ID], state: DocumentState): typingsSlinky.pulumiAws.documentMod.Document = js.native
    @JSImport("@pulumi/aws/ssm", "Document.get")
    @js.native
    def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.documentMod.Document = js.native
    
    /**
      * Returns true if the given object is an instance of Document.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "Document.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "MaintenanceWindow")
  @js.native
  class MaintenanceWindow protected ()
    extends typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindow {
    /**
      * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowArgs) = this()
    def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MaintenanceWindow {
    
    /**
      * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState): typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindow.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget")
  @js.native
  class MaintenanceWindowTarget protected ()
    extends typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget {
    /**
      * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTargetArgs) = this()
    def this(name: String, args: MaintenanceWindowTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MaintenanceWindowTarget {
    
    /**
      * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask")
  @js.native
  class MaintenanceWindowTask protected ()
    extends typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTaskArgs) = this()
    def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MaintenanceWindowTask {
    
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "Parameter")
  @js.native
  class Parameter protected ()
    extends typingsSlinky.pulumiAws.parameterMod.Parameter {
    /**
      * Create a Parameter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterArgs) = this()
    def this(name: String, args: ParameterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Parameter {
    
    /**
      * Get an existing Parameter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.parameterMod.Parameter = js.native
    @JSImport("@pulumi/aws/ssm", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.parameterMod.Parameter = js.native
    @JSImport("@pulumi/aws/ssm", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterState): typingsSlinky.pulumiAws.parameterMod.Parameter = js.native
    @JSImport("@pulumi/aws/ssm", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.parameterMod.Parameter = js.native
    
    /**
      * Returns true if the given object is an instance of Parameter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "Parameter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = js.native
  }
  
  object ParameterType {
    
    @JSImport("@pulumi/aws/ssm", "ParameterType.SecureString")
    @js.native
    val SecureString: typingsSlinky.pulumiAws.pulumiAwsStrings.SecureString = js.native
    
    @JSImport("@pulumi/aws/ssm", "ParameterType.String")
    @js.native
    val String: typingsSlinky.pulumiAws.pulumiAwsStrings.String = js.native
    
    @JSImport("@pulumi/aws/ssm", "ParameterType.StringList")
    @js.native
    val StringList: typingsSlinky.pulumiAws.pulumiAwsStrings.StringList = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "PatchBaseline")
  @js.native
  class PatchBaseline protected ()
    extends typingsSlinky.pulumiAws.patchBaselineMod.PatchBaseline {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PatchBaselineArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PatchBaseline {
    
    /**
      * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState): typingsSlinky.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    
    /**
      * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "PatchBaseline.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "PatchGroup")
  @js.native
  class PatchGroup protected ()
    extends typingsSlinky.pulumiAws.patchGroupMod.PatchGroup {
    /**
      * Create a PatchGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PatchGroupArgs) = this()
    def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PatchGroup {
    
    /**
      * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.patchGroupMod.PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.patchGroupMod.PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchGroupState): typingsSlinky.pulumiAws.patchGroupMod.PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.patchGroupMod.PatchGroup = js.native
    
    /**
      * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "PatchGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "ResourceDataSync")
  @js.native
  class ResourceDataSync protected ()
    extends typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSync {
    /**
      * Create a ResourceDataSync resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceDataSyncArgs) = this()
    def this(name: String, args: ResourceDataSyncArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourceDataSync {
    
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState): typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm", "ResourceDataSync.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ssm", "SecureStringParameter")
  @js.native
  def SecureStringParameter: ParameterType = js.native
  @scala.inline
  def SecureStringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureStringParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ssm", "StringListParameter")
  @js.native
  def StringListParameter: ParameterType = js.native
  @scala.inline
  def StringListParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringListParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ssm", "StringParameter")
  @js.native
  def StringParameter: ParameterType = js.native
  @scala.inline
  def StringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ssm", "getDocument")
  @js.native
  def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] = js.native
  @JSImport("@pulumi/aws/ssm", "getDocument")
  @js.native
  def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] = js.native
  
  @JSImport("@pulumi/aws/ssm", "getParameter")
  @js.native
  def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] = js.native
  @JSImport("@pulumi/aws/ssm", "getParameter")
  @js.native
  def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] = js.native
  
  @JSImport("@pulumi/aws/ssm", "getPatchBaseline")
  @js.native
  def getPatchBaseline(args: GetPatchBaselineArgs): js.Promise[GetPatchBaselineResult] = js.native
  @JSImport("@pulumi/aws/ssm", "getPatchBaseline")
  @js.native
  def getPatchBaseline(args: GetPatchBaselineArgs, opts: InvokeOptions): js.Promise[GetPatchBaselineResult] = js.native
}
