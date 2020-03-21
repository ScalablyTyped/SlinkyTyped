package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", JSImport.Namespace)
@js.native
object flowcontrolV1alpha1Mod extends js.Object {
  @js.native
  class FlowSchema protected ()
    extends typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema {
    /**
      * Create a flowcontrol.v1alpha1.FlowSchema resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class FlowSchemaList protected ()
    extends typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList {
    /**
      * Create a flowcontrol.v1alpha1.FlowSchemaList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchemaList) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchemaList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class PriorityLevelConfiguration protected ()
    extends typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration {
    /**
      * Create a flowcontrol.v1alpha1.PriorityLevelConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.PriorityLevelConfiguration
    ) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.PriorityLevelConfiguration,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class PriorityLevelConfigurationList protected ()
    extends typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList {
    /**
      * Create a flowcontrol.v1alpha1.PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.PriorityLevelConfigurationList
    ) = this()
    def this(
      name: String,
      args: typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.PriorityLevelConfigurationList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object FlowSchema extends js.Object {
    /**
      * Get the state of an existing `FlowSchema` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    /**
      * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/FlowSchema.FlowSchema */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FlowSchemaList extends js.Object {
    /**
      * Get the state of an existing `FlowSchemaList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    /**
      * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/FlowSchemaList.FlowSchemaList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PriorityLevelConfiguration extends js.Object {
    /**
      * Get the state of an existing `PriorityLevelConfiguration` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    /**
      * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/PriorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PriorityLevelConfigurationList extends js.Object {
    /**
      * Get the state of an existing `PriorityLevelConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/PriorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = js.native
  }
  
}

