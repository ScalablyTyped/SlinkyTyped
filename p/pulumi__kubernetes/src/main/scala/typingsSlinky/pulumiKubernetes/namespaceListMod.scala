package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.Namespace
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceListMod {
  
  @JSImport("@pulumi/kubernetes/core/v1/namespaceList", "NamespaceList")
  @js.native
  class NamespaceList protected () extends CustomResource {
    /**
      * Create a NamespaceList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NamespaceListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NamespaceListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    
    /**
      * Items is the list of Namespace objects in the list. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
      */
    val items: Output_[js.Array[Namespace]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NamespaceList] = js.native
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object NamespaceList {
    
    /**
      * Get an existing NamespaceList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/core/v1/namespaceList", "NamespaceList.get")
    @js.native
    def get(name: String, id: Input[ID]): NamespaceList = js.native
    @JSImport("@pulumi/kubernetes/core/v1/namespaceList", "NamespaceList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): NamespaceList = js.native
    
    /**
      * Returns true if the given object is an instance of NamespaceList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/core/v1/namespaceList", "NamespaceList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/namespaceList.NamespaceList */ Boolean = js.native
  }
  
  @js.native
  trait NamespaceListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[v1]] = js.native
    
    /**
      * Items is the list of Namespace objects in the list. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
      */
    val items: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.Namespace]]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NamespaceList]] = js.native
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.native
  }
  object NamespaceListArgs {
    
    @scala.inline
    def apply(items: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.Namespace]]]): NamespaceListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceListArgs]
    }
    
    @scala.inline
    implicit class NamespaceListArgsMutableBuilder[Self <: NamespaceListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(value: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.Namespace]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.Namespace]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NamespaceList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
