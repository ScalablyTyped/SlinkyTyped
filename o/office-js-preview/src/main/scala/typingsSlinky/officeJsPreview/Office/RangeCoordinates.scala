package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a cell, or row, or column, by its zero-based row and/or column number. Example: `{row: 3, column: 4}` specifies the cell in the 3rd 
  * (zero-based) row in the 4th (zero-based) column.
  */
@js.native
trait RangeCoordinates extends js.Object {
  /**
    * The zero-based column of the range. If not specified, all cells, in the row specified by `row` are included.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * The zero-based row of the range. If not specified, all cells, in the column specified by `column` are included.
    */
  var row: js.UndefOr[Double] = js.native
}

object RangeCoordinates {
  @scala.inline
  def apply(): RangeCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCoordinates]
  }
  @scala.inline
  implicit class RangeCoordinatesOps[Self <: RangeCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
  }
  
}

