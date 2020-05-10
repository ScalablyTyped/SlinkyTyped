package typingsSlinky.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfoMap extends js.Object {
  var source: SourceNodeInfo = js.native
  var transform: TransformNodeInfo = js.native
}

object NodeInfoMap {
  @scala.inline
  def apply(source: SourceNodeInfo, transform: TransformNodeInfo): NodeInfoMap = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoMap]
  }
  @scala.inline
  implicit class NodeInfoMapOps[Self <: NodeInfoMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: SourceNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: TransformNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

