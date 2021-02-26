package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.LocalObjectReference
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.ObjectReference
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

object serviceAccountMod {
  
  @JSImport("@pulumi/kubernetes/core/v1/serviceAccount", "ServiceAccount")
  @js.native
  class ServiceAccount protected () extends CustomResource {
    /**
      * Create a ServiceAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceAccountArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServiceAccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    
    /**
      * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
      */
    val automountServiceAccountToken: Output_[Boolean] = js.native
    
    /**
      * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
      */
    val imagePullSecrets: Output_[js.Array[LocalObjectReference]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
      */
    val secrets: Output_[js.Array[ObjectReference]] = js.native
  }
  /* static members */
  object ServiceAccount {
    
    /**
      * Get an existing ServiceAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/core/v1/serviceAccount", "ServiceAccount.get")
    @js.native
    def get(name: String, id: Input[ID]): ServiceAccount = js.native
    @JSImport("@pulumi/kubernetes/core/v1/serviceAccount", "ServiceAccount.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ServiceAccount = js.native
    
    /**
      * Returns true if the given object is an instance of ServiceAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/core/v1/serviceAccount", "ServiceAccount.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/serviceAccount.ServiceAccount */ Boolean = js.native
  }
  
  @js.native
  trait ServiceAccountArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[v1]] = js.native
    
    /**
      * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
      */
    val automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
      */
    val imagePullSecrets: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.LocalObjectReference]]
        ]
      ] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
      */
    val secrets: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference]]]
      ] = js.native
  }
  object ServiceAccountArgs {
    
    @scala.inline
    def apply(): ServiceAccountArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceAccountArgs]
    }
    
    @scala.inline
    implicit class ServiceAccountArgsMutableBuilder[Self <: ServiceAccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setAutomountServiceAccountToken(value: Input[Boolean]): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomountServiceAccountTokenUndefined: Self = StObject.set(x, "automountServiceAccountToken", js.undefined)
      
      @scala.inline
      def setImagePullSecrets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.LocalObjectReference]]
            ]
      ): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePullSecretsUndefined: Self = StObject.set(x, "imagePullSecrets", js.undefined)
      
      @scala.inline
      def setImagePullSecretsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.LocalObjectReference]*): Self = StObject.set(x, "imagePullSecrets", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSecrets(value: Input[js.Array[Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference]]]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
      
      @scala.inline
      def setSecretsVarargs(value: Input[typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference]*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    }
  }
}
