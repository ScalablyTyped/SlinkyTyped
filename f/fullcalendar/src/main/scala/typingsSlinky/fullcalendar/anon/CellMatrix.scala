package typingsSlinky.fullcalendar.anon

import typingsSlinky.fullcalendar.jqueryHooksMod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMatrix extends js.Object {
  var cellMatrix: js.Array[_] = js.native
  var row: js.Any = js.native
  var segLevels: js.Array[_] = js.native
  var segMatrix: js.Array[_] = js.native
  var segs: js.Any = js.native
  var tbodyEl: JQuery = js.native
}

object CellMatrix {
  @scala.inline
  def apply(
    cellMatrix: js.Array[_],
    row: js.Any,
    segLevels: js.Array[_],
    segMatrix: js.Array[_],
    segs: js.Any,
    tbodyEl: JQuery
  ): CellMatrix = {
    val __obj = js.Dynamic.literal(cellMatrix = cellMatrix.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], segLevels = segLevels.asInstanceOf[js.Any], segMatrix = segMatrix.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any], tbodyEl = tbodyEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMatrix]
  }
  @scala.inline
  implicit class CellMatrixOps[Self <: CellMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellMatrix(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegLevels(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegMatrix(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTbodyEl(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbodyEl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

