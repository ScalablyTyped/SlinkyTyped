package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertExtraNode extends js.Object {
  var insertExtraNode: js.UndefOr[Boolean] = js.native
}

object AnonInsertExtraNode {
  @scala.inline
  def apply(): AnonInsertExtraNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInsertExtraNode]
  }
  @scala.inline
  implicit class AnonInsertExtraNodeOps[Self <: AnonInsertExtraNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertExtraNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertExtraNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertExtraNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertExtraNode")(js.undefined)
        ret
    }
  }
  
}

