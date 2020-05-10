package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDropReorder[K, D] extends js.Object {
  var drag: AnonRows[K, D] = js.native
  var drop: AnonColumns = js.native
  var reorder: Anon18 = js.native
}

object AnonDropReorder {
  @scala.inline
  def apply[K, D](drag: AnonRows[K, D], drop: AnonColumns, reorder: Anon18): AnonDropReorder[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropReorder[K, D]]
  }
  @scala.inline
  implicit class AnonDropReorderOps[Self[k, d] <: AnonDropReorder[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withDrag(value: AnonRows[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: AnonColumns): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorder(value: Anon18): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

