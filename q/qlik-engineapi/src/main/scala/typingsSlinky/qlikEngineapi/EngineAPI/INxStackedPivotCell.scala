package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStackedPivotCell...
  */
@js.native
trait INxStackedPivotCell extends js.Object {
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeDimValues = js.native
  /**
    * Attribute expressions values.
    */
  var qAttrExps: INxAttributeExpressionValues = js.native
  /**
    * If set to true, it means that the cell can be collapsed.
    * This parameter is not returned if it is set to false.
    */
  var qCanCollapse: Boolean = js.native
  /**
    * If set to true, it means that the cell can be expanded.
    * This parameter is not returned if it is set to false.
    */
  var qCanExpand: Boolean = js.native
  /**
    * Number of elements that are part of the next tail.
    */
  var qDown: Double = js.native
  /**
    * Rank number of the value.
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: Double = js.native
  /**
    * Total of the positive values in the current group of cells.
    */
  var qMaxPos: Double = js.native
  /**
    * Total of the negative values in the current group of cells.
    */
  var qMinNeg: Double = js.native
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: Double = js.native
  /**
    * Information about sub nodes (or sub cells).
    * The array is empty [ ] when there are no sub nodes.
    */
  var qSubNodes: js.Array[INxStackedPivotCell] = js.native
  /**
    * Some text.
    */
  var qText: String = js.native
  /**
    * Type of the cell.
    * One of:
    *      V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    *      E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    *      N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    *      T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total
    *      P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    *      R for NX_DIM_CELL_ROOT. Applies to root node.
    *      U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  var qType: NxCellType = js.native
  /**
    * Number of elements that are part of the previous tail.
    */
  var qUp: Double = js.native
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double = js.native
}

object INxStackedPivotCell {
  @scala.inline
  def apply(
    qAttrDims: INxAttributeDimValues,
    qAttrExps: INxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[INxStackedPivotCell],
    qText: String,
    qType: NxCellType,
    qUp: Double,
    qValue: Double
  ): INxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qMaxPos = qMaxPos.asInstanceOf[js.Any], qMinNeg = qMinNeg.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStackedPivotCell]
  }
  @scala.inline
  implicit class INxStackedPivotCellOps[Self <: INxStackedPivotCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAttrDims(value: INxAttributeDimValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrExps(value: INxAttributeExpressionValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCanCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCanCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCanExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCanExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQElemNo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMaxPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMaxPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMinNeg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMinNeg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSubNodes(value: js.Array[INxStackedPivotCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSubNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: NxCellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

