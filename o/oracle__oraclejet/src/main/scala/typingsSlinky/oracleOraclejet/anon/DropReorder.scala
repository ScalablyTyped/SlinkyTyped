package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropReorder[K, D] extends js.Object {
  var drag: Rows[K, D] = js.native
  var drop: Columns = js.native
  var reorder: `18` = js.native
}

object DropReorder {
  @scala.inline
  def apply[K, D](drag: Rows[K, D], drop: Columns, reorder: `18`): DropReorder[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropReorder[K, D]]
  }
  @scala.inline
  implicit class DropReorderOps[Self[k, d] <: DropReorder[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withDrag(value: Rows[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: Columns): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorder(value: `18`): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

