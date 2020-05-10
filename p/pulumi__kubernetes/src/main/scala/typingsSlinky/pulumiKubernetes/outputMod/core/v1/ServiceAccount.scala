package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
  * systems, for an identity * a principal that can be authenticated and authorized * a set of
  * secrets
  */
@js.native
trait ServiceAccount extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should
    * have an API token automatically mounted. Can be overridden at the pod level.
    */
  val automountServiceAccountToken: Boolean = js.native
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for
    * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
    * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
    * only accessed by the kubelet. More info:
    * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  val imagePullSecrets: js.Array[LocalObjectReference] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this
    * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  val secrets: js.Array[ObjectReference] = js.native
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
    def withApiVersion(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomountServiceAccountToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automountServiceAccountToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagePullSecrets(value: js.Array[LocalObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullSecrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecrets(value: js.Array[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

