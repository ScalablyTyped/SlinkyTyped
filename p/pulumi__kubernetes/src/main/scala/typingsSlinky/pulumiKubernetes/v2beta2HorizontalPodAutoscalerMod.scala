package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpec
import typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2.HorizontalPodAutoscalerStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2beta2HorizontalPodAutoscalerMod {
  
  @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler")
  @js.native
  class HorizontalPodAutoscaler protected () extends CustomResource {
    /**
      * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[autoscalingSlashv2beta2] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler] = js.native
    
    /**
      * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    val spec: Output_[HorizontalPodAutoscalerSpec] = js.native
    
    /**
      * status is the current information about the autoscaler.
      */
    val status: Output_[HorizontalPodAutoscalerStatus] = js.native
  }
  /* static members */
  object HorizontalPodAutoscaler {
    
    /**
      * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler.get")
    @js.native
    def get(name: String, id: Input[ID]): HorizontalPodAutoscaler = js.native
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscaler = js.native
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
  @js.native
  trait HorizontalPodAutoscalerArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[autoscalingSlashv2beta2]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler]
      ] = js.native
    
    /**
      * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    val spec: js.UndefOr[
        Input[
          typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpec
        ]
      ] = js.native
  }
  object HorizontalPodAutoscalerArgs {
    
    @scala.inline
    def apply(): HorizontalPodAutoscalerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalPodAutoscalerArgs]
    }
    
    @scala.inline
    implicit class HorizontalPodAutoscalerArgsMutableBuilder[Self <: HorizontalPodAutoscalerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[autoscalingSlashv2beta2]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(
        value: Input[
              typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpec
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
