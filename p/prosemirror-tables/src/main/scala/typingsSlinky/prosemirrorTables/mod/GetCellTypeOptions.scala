package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCellTypeOptions extends js.Object {
  var col: Double = js.native
  var node: Node[_] = js.native
  var row: Double = js.native
}

object GetCellTypeOptions {
  @scala.inline
  def apply(col: Double, node: Node[_], row: Double): GetCellTypeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCellTypeOptions]
  }
  @scala.inline
  implicit class GetCellTypeOptionsOps[Self <: GetCellTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

