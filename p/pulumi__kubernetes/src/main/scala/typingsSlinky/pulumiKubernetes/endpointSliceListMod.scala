package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.discovery.v1beta1.EndpointSlice
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointSliceListMod {
  
  @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList")
  @js.native
  class EndpointSliceList protected () extends CustomResource {
    /**
      * Create a EndpointSliceList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EndpointSliceListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EndpointSliceListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[discoveryDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * List of endpoint slices
      */
    val items: Output_[js.Array[EndpointSlice]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList] = js.native
    
    /**
      * Standard list metadata.
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object EndpointSliceList {
    
    /**
      * Get an existing EndpointSliceList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList.get")
    @js.native
    def get(name: String, id: Input[ID]): EndpointSliceList = js.native
    @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): EndpointSliceList = js.native
    
    /**
      * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean = js.native
  }
  
  @js.native
  trait EndpointSliceListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[discoveryDotk8sDotioSlashv1beta1]] = js.native
    
    /**
      * List of endpoint slices
      */
    val items: Input[
        js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointSlice]]
      ] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList]] = js.native
    
    /**
      * Standard list metadata.
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.native
  }
  object EndpointSliceListArgs {
    
    @scala.inline
    def apply(
      items: Input[
          js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointSlice]]
        ]
    ): EndpointSliceListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointSliceListArgs]
    }
    
    @scala.inline
    implicit class EndpointSliceListArgsMutableBuilder[Self <: EndpointSliceListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[discoveryDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointSlice]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointSlice]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
