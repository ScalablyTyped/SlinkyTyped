package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
@js.native
trait EnvVarSource extends js.Object {
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: js.UndefOr[Input[ConfigMapKeySelector]] = js.native
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels,
    * metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP,
    * status.podIPs.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.native
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and
    * requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.native
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: js.UndefOr[Input[SecretKeySelector]] = js.native
}

object EnvVarSource {
  @scala.inline
  def apply(): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSource]
  }
  @scala.inline
  implicit class EnvVarSourceOps[Self <: EnvVarSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMapKeyRef(value: Input[ConfigMapKeySelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapKeyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigMapKeyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapKeyRef")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldRef(value: Input[ObjectFieldSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldRef")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceFieldRef(value: Input[ResourceFieldSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFieldRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceFieldRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFieldRef")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKeyRef(value: Input[SecretKeySelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKeyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKeyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKeyRef")(js.undefined)
        ret
    }
  }
  
}

