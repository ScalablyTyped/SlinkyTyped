package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config
  * source for the Node.
  */
@js.native
trait ConfigMapNodeConfigSource extends js.Object {
  /**
    * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the
    * KubeletConfiguration structure This field is required in all cases.
    */
  val kubeletConfigKey: String = js.native
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  val name: String = js.native
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in
    * all cases.
    */
  val namespace: String = js.native
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is
    * forbidden in Node.Spec, and required in Node.Status.
    */
  val resourceVersion: String = js.native
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec,
    * and required in Node.Status.
    */
  val uid: String = js.native
}

object ConfigMapNodeConfigSource {
  @scala.inline
  def apply(kubeletConfigKey: String, name: String, namespace: String, resourceVersion: String, uid: String): ConfigMapNodeConfigSource = {
    val __obj = js.Dynamic.literal(kubeletConfigKey = kubeletConfigKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapNodeConfigSource]
  }
  @scala.inline
  implicit class ConfigMapNodeConfigSourceOps[Self <: ConfigMapNodeConfigSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKubeletConfigKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubeletConfigKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

