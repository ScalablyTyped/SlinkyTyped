package typingsSlinky.agGrid.iRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowBounds extends js.Object {
  var rowHeight: Double = js.native
  var rowTop: Double = js.native
}

object RowBounds {
  @scala.inline
  def apply(rowHeight: Double, rowTop: Double): RowBounds = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBounds]
  }
  @scala.inline
  implicit class RowBoundsOps[Self <: RowBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

