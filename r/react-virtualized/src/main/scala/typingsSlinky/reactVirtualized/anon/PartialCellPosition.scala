package typingsSlinky.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-virtualized.react-virtualized/dist/es/CellMeasurer.CellPosition> */
@js.native
trait PartialCellPosition extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

object PartialCellPosition {
  @scala.inline
  def apply(): PartialCellPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCellPosition]
  }
  @scala.inline
  implicit class PartialCellPositionOps[Self <: PartialCellPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
  }
  
}

