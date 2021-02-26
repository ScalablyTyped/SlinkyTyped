package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
  */
@js.native
trait ServiceAccount extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.native
  
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
    */
  var automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]] = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  var secrets: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.native
}
object ServiceAccount {
  
  @scala.inline
  def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  
  @scala.inline
  implicit class ServiceAccountMutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setAutomountServiceAccountToken(value: Input[Boolean]): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomountServiceAccountTokenUndefined: Self = StObject.set(x, "automountServiceAccountToken", js.undefined)
    
    @scala.inline
    def setImagePullSecrets(value: Input[js.Array[Input[LocalObjectReference]]]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullSecretsUndefined: Self = StObject.set(x, "imagePullSecrets", js.undefined)
    
    @scala.inline
    def setImagePullSecretsVarargs(value: Input[LocalObjectReference]*): Self = StObject.set(x, "imagePullSecrets", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSecrets(value: Input[js.Array[Input[ObjectReference]]]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: Input[ObjectReference]*): Self = StObject.set(x, "secrets", js.Array(value :_*))
  }
}
