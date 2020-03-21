package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeList is a list of PersistentVolume items.
  */
trait PersistentVolumeList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  /**
    * List of persistent volumes. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes
    */
  var items: Input[js.Array[Input[PersistentVolume]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeList]
  ] = js.undefined
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object PersistentVolumeList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[PersistentVolume]]],
    apiVersion: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1] = null,
    kind: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeList] = null,
    metadata: Input[ListMeta] = null
  ): PersistentVolumeList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeList]
  }
}

