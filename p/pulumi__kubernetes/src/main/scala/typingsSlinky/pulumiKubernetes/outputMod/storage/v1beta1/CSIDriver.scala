package typingsSlinky.pulumiKubernetes.outputMod.storage.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSIDriver captures information about a Container Storage Interface (CSI) volume driver
  * deployed on the cluster. CSI drivers do not need to create the CSIDriver object directly.
  * Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI
  * driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach
  * detach controller uses this object to determine whether attach is required. Kubelet uses this
  * object to determine whether pod information needs to be passed on mount. CSIDriver objects
  * are non-namespaced.
  */
@js.native
trait CSIDriver extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver = js.native
  /**
    * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
    * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
    * that driver. The driver name must be 63 characters or less, beginning and ending with an
    * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * Specification of the CSI Driver.
    */
  val spec: CSIDriverSpec = js.native
}

object CSIDriver {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1beta1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver,
    metadata: ObjectMeta,
    spec: CSIDriverSpec
  ): CSIDriver = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIDriver]
  }
  @scala.inline
  implicit class CSIDriverOps[Self <: CSIDriver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver): Self = {
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
    def withSpec(value: CSIDriverSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

