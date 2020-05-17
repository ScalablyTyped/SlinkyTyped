package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertExtraNode extends js.Object {
  var insertExtraNode: js.UndefOr[Boolean] = js.native
}

object InsertExtraNode {
  @scala.inline
  def apply(): InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertExtraNode]
  }
  @scala.inline
  implicit class InsertExtraNodeOps[Self <: InsertExtraNode] (val x: Self) extends AnyVal {
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

