package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSelectionCell...
  */
@js.native
trait INxSelectionCell extends js.Object {
  /**
    * Column index to select
    * Indexing starts from 0.
    * If the cell's type is:
    *   D, the index is based on the data matrix.
    *   T, the index is based on the data matrix
    *   L, the index is based on the left dimensions indexes
    */
  var qCol: Double = js.native
  /**
    * Row index to select
    * Indexing starts from 0.
    * If the cell's type is:
    * - D, the index is based on the data matrix.
    * - T, the index is based on the top dimensions indexes
    * - L, the index is based on the data matrix
    */
  var qRow: Double = js.native
  /**
    * Type of cells to select
    * One of:
    *                 D for data
    *                 T for top dimension cells
    *                 L for left dimension cells
    */
  var qType: NxSelectionCellType = js.native
}

object INxSelectionCell {
  @scala.inline
  def apply(qCol: Double, qRow: Double, qType: NxSelectionCellType): INxSelectionCell = {
    val __obj = js.Dynamic.literal(qCol = qCol.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSelectionCell]
  }
  @scala.inline
  implicit class INxSelectionCellOps[Self <: INxSelectionCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: NxSelectionCellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

