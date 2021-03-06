package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1.FlowSchema
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowSchemaListMod {
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList", "FlowSchemaList")
  @js.native
  class FlowSchemaList protected () extends CustomResource {
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
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * `items` is a list of FlowSchemas.
      */
    val items: Output_[js.Array[FlowSchema]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.FlowSchemaList] = js.native
    
    /**
      * `metadata` is the standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ListMeta] = js.native
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
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList", "FlowSchemaList.get")
    @js.native
    def get(name: String, id: Input[ID]): FlowSchemaList = js.native
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList", "FlowSchemaList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): FlowSchemaList = js.native
    
    /**
      * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList", "FlowSchemaList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = js.native
  }
  
  @js.native
  trait FlowSchemaListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1]] = js.native
    
    /**
      * `items` is a list of FlowSchemas.
      */
    val items: Input[
        js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema]]
      ] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.FlowSchemaList]] = js.native
    
    /**
      * `metadata` is the standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.native
  }
  object FlowSchemaListArgs {
    
    @scala.inline
    def apply(
      items: Input[
          js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema]]
        ]
    ): FlowSchemaListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowSchemaListArgs]
    }
    
    @scala.inline
    implicit class FlowSchemaListArgsMutableBuilder[Self <: FlowSchemaListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.FlowSchema]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.FlowSchemaList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
