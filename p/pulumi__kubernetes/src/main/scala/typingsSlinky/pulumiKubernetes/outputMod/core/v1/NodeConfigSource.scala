package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
  * metadata) must be non-nil.
  */
@js.native
trait NodeConfigSource extends js.Object {
  /**
    * ConfigMap is a reference to a Node's ConfigMap
    */
  val configMap: ConfigMapNodeConfigSource = js.native
}

object NodeConfigSource {
  @scala.inline
  def apply(configMap: ConfigMapNodeConfigSource): NodeConfigSource = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigSource]
  }
  @scala.inline
  implicit class NodeConfigSourceOps[Self <: NodeConfigSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMap(value: ConfigMapNodeConfigSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

