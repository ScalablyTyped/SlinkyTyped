package typingsSlinky.reactNativeDraggableFlatlist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMoveEndInfo[ItemM] extends js.Object {
  var data: js.Array[ItemM] | Null = js.native
  var from: Double = js.native
  var row: ItemM = js.native
  var to: Double = js.native
}

object OnMoveEndInfo {
  @scala.inline
  def apply[ItemM](from: Double, row: ItemM, to: Double): OnMoveEndInfo[ItemM] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMoveEndInfo[ItemM]]
  }
  @scala.inline
  implicit class OnMoveEndInfoOps[Self[itemm] <: OnMoveEndInfo[itemm], ItemM] (val x: Self[ItemM]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemM] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemM]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemM] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemM] with Other]
    @scala.inline
    def withFrom(value: Double): Self[ItemM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: ItemM): Self[ItemM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self[ItemM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[ItemM]): Self[ItemM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[ItemM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

