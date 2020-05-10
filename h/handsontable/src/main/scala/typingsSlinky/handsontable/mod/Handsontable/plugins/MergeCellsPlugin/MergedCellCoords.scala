package typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typingsSlinky.handsontable.mod.Handsontable.wot.CellRange
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedCellCoords extends js.Object {
  var col: Double = js.native
  var colspan: Double = js.native
  var removed: Boolean = js.native
  var row: Double = js.native
  var rowspan: Double = js.native
  def getLastColumn(): Double = js.native
  def getLastRow(): Double = js.native
  def getRange(): CellRange = js.native
  def includes(row: Double, column: Double): Boolean = js.native
  def includesHorizontally(column: Double): Boolean = js.native
  def includesVertically(row: Double): Boolean = js.native
  def isFarther(mergedCell: MergedCellCoords, direction: String): Boolean | Unit = js.native
  def normalize(hotInstance: Core): Unit = js.native
  def shift(shiftVector: js.Array[Double], indexOfChange: Double): Boolean = js.native
}

object MergedCellCoords {
  @scala.inline
  def apply(
    col: Double,
    colspan: Double,
    getLastColumn: () => Double,
    getLastRow: () => Double,
    getRange: () => CellRange,
    includes: (Double, Double) => Boolean,
    includesHorizontally: Double => Boolean,
    includesVertically: Double => Boolean,
    isFarther: (MergedCellCoords, String) => Boolean | Unit,
    normalize: Core => Unit,
    removed: Boolean,
    row: Double,
    rowspan: Double,
    shift: (js.Array[Double], Double) => Boolean
  ): MergedCellCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], colspan = colspan.asInstanceOf[js.Any], getLastColumn = js.Any.fromFunction0(getLastColumn), getLastRow = js.Any.fromFunction0(getLastRow), getRange = js.Any.fromFunction0(getRange), includes = js.Any.fromFunction2(includes), includesHorizontally = js.Any.fromFunction1(includesHorizontally), includesVertically = js.Any.fromFunction1(includesVertically), isFarther = js.Any.fromFunction2(isFarther), normalize = js.Any.fromFunction1(normalize), removed = removed.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], shift = js.Any.fromFunction2(shift))
    __obj.asInstanceOf[MergedCellCoords]
  }
  @scala.inline
  implicit class MergedCellCoordsOps[Self <: MergedCellCoords] (val x: Self) extends AnyVal {
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
    def withColspan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLastColumn(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastRow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRange(value: () => CellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncludes(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncludesHorizontally(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includesHorizontally")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludesVertically(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includesVertically")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFarther(value: (MergedCellCoords, String) => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFarther")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormalize(value: Core => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowspan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: (js.Array[Double], Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

