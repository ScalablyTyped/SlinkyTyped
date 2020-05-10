package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMap holds configuration data for pods to consume.
  */
@js.native
trait ConfigMap extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
    * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
    * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
    * during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  val binaryData: js.Object = js.native
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters,
    * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
    * keys stored in Data must not overlap with the keys in the BinaryData field, this is
    * enforced during validation process.
    */
  val data: StringDictionary[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
}

object ConfigMap {
  @scala.inline
  def apply(
    apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1,
    binaryData: js.Object,
    data: StringDictionary[String],
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap,
    metadata: ObjectMeta
  ): ConfigMap = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], binaryData = binaryData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMap]
  }
  @scala.inline
  implicit class ConfigMapOps[Self <: ConfigMap] (val x: Self) extends AnyVal {
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
    def withBinaryData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap): Self = {
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

