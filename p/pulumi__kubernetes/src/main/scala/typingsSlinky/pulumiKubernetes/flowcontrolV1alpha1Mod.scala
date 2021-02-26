package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaListArgs
import typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchemaArgs
import typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationListArgs
import typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfigurationArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowcontrolV1alpha1Mod {
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema")
  @js.native
  class FlowSchema protected ()
    extends typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema {
    /**
      * Create a FlowSchema resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FlowSchemaArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FlowSchema {
    
    /**
      * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    
    /**
      * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList")
  @js.native
  class FlowSchemaList protected ()
    extends typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList {
    /**
      * Create a FlowSchemaList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FlowSchemaListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FlowSchemaList {
    
    /**
      * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    
    /**
      * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration")
  @js.native
  class PriorityLevelConfiguration protected ()
    extends typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration {
    /**
      * Create a PriorityLevelConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityLevelConfigurationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityLevelConfiguration {
    
    /**
      * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList")
  @js.native
  class PriorityLevelConfigurationList protected ()
    extends typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList {
    /**
      * Create a PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityLevelConfigurationListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityLevelConfigurationList {
    
    /**
      * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = js.native
  }
}
