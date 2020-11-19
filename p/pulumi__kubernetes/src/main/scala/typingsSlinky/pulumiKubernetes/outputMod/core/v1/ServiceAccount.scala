package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
  */
@js.native
trait ServiceAccount extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
    */
  var automountServiceAccountToken: Boolean = js.native
  
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.Array[LocalObjectReference] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  var secrets: js.Array[ObjectReference] = js.native
}
object ServiceAccount {
  
  @scala.inline
  def apply(
    apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1,
    automountServiceAccountToken: Boolean,
    imagePullSecrets: js.Array[LocalObjectReference],
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount,
    metadata: ObjectMeta,
    secrets: js.Array[ObjectReference]
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], automountServiceAccountToken = automountServiceAccountToken.asInstanceOf[js.Any], imagePullSecrets = imagePullSecrets.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
  
  @scala.inline
  implicit class ServiceAccountOps[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiVersion(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomountServiceAccountToken(value: Boolean): Self = this.set("automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullSecretsVarargs(value: LocalObjectReference*): Self = this.set("imagePullSecrets", js.Array(value :_*))
    
    @scala.inline
    def setImagePullSecrets(value: js.Array[LocalObjectReference]): Self = this.set("imagePullSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsVarargs(value: ObjectReference*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[ObjectReference]): Self = this.set("secrets", value.asInstanceOf[js.Any])
  }
}
