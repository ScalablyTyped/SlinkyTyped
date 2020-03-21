package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapList is a resource containing a list of ConfigMap objects.
  */
trait ConfigMapList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  /**
    * Items is the list of ConfigMaps.
    */
  var items: Input[js.Array[Input[ConfigMap]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ConfigMapList]] = js.undefined
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object ConfigMapList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[ConfigMap]]],
    apiVersion: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1] = null,
    kind: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ConfigMapList] = null,
    metadata: Input[ListMeta] = null
  ): ConfigMapList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapList]
  }
}

