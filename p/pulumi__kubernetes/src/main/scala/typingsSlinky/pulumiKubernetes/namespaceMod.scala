package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.NamespaceSpec
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.NamespaceStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
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

object namespaceMod {
  
  @JSImport("@pulumi/kubernetes/core/v1/namespace", "Namespace")
  @js.native
  class Namespace protected () extends CustomResource {
    /**
      * Create a Namespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NamespaceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NamespaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Namespace] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec defines the behavior of the Namespace. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output_[NamespaceSpec] = js.native
    
    /**
      * Status describes the current status of a Namespace. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output_[NamespaceStatus] = js.native
  }
  /* static members */
  object Namespace {
    
    /**
      * Get an existing Namespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/core/v1/namespace", "Namespace.get")
    @js.native
    def get(name: String, id: Input[ID]): Namespace = js.native
    @JSImport("@pulumi/kubernetes/core/v1/namespace", "Namespace.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Namespace = js.native
    
    /**
      * Returns true if the given object is an instance of Namespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/core/v1/namespace", "Namespace.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/namespace.Namespace */ Boolean = js.native
  }
  
  @js.native
  trait NamespaceArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[v1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Namespace]] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Spec defines the behavior of the Namespace. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.NamespaceSpec]] = js.native
  }
  object NamespaceArgs {
    
    @scala.inline
    def apply(): NamespaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamespaceArgs]
    }
    
    @scala.inline
    implicit class NamespaceArgsMutableBuilder[Self <: NamespaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Namespace]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.NamespaceSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
