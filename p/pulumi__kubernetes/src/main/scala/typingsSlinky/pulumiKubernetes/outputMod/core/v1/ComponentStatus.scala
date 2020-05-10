package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
  */
@js.native
trait ComponentStatus extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * List of component conditions observed
    */
  val conditions: js.Array[ComponentCondition] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
}

object ComponentStatus {
  @scala.inline
  def apply(
    apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1,
    conditions: js.Array[ComponentCondition],
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus,
    metadata: ObjectMeta
  ): ComponentStatus = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStatus]
  }
  @scala.inline
  implicit class ComponentStatusOps[Self <: ComponentStatus] (val x: Self) extends AnyVal {
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
    def withConditions(value: js.Array[ComponentCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus): Self = {
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
  }
  
}

