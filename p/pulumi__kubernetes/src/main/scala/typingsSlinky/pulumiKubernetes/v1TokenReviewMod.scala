package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.authentication.v1.TokenReviewSpec
import typingsSlinky.pulumiKubernetes.outputMod.authentication.v1.TokenReviewStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.authenticationDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1TokenReviewMod {
  
  @JSImport("@pulumi/kubernetes/authentication/v1/tokenReview", "TokenReview")
  @js.native
  class TokenReview protected () extends CustomResource {
    /**
      * Create a TokenReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TokenReviewArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TokenReviewArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[authenticationDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.TokenReview] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec holds information about the request being evaluated
      */
    val spec: Output_[TokenReviewSpec] = js.native
    
    /**
      * Status is filled in by the server and indicates whether the request can be authenticated.
      */
    val status: Output_[TokenReviewStatus] = js.native
  }
  /* static members */
  object TokenReview {
    
    /**
      * Get an existing TokenReview resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/authentication/v1/tokenReview", "TokenReview.get")
    @js.native
    def get(name: String, id: Input[ID]): TokenReview = js.native
    @JSImport("@pulumi/kubernetes/authentication/v1/tokenReview", "TokenReview.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): TokenReview = js.native
    
    /**
      * Returns true if the given object is an instance of TokenReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/authentication/v1/tokenReview", "TokenReview.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenReview.TokenReview */ Boolean = js.native
  }
  
  @js.native
  trait TokenReviewArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[authenticationDotk8sDotioSlashv1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.TokenReview]] = js.native
    
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Spec holds information about the request being evaluated
      */
    val spec: Input[typingsSlinky.pulumiKubernetes.inputMod.authentication.v1.TokenReviewSpec] = js.native
  }
  object TokenReviewArgs {
    
    @scala.inline
    def apply(spec: Input[typingsSlinky.pulumiKubernetes.inputMod.authentication.v1.TokenReviewSpec]): TokenReviewArgs = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenReviewArgs]
    }
    
    @scala.inline
    implicit class TokenReviewArgsMutableBuilder[Self <: TokenReviewArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[authenticationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.TokenReview]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typingsSlinky.pulumiKubernetes.inputMod.authentication.v1.TokenReviewSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
