package typingsSlinky.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxCell extends js.Object {
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeDimValues = js.native
  /**
    * Attribute expression values.
    */
  var qAttrExps: INxAttributeExpressionValues = js.native
  /**
    * Rank number of the value, starting from 0.
    * If the element number is a negative number, it means that the returned value is not an element number.
    * You can get the following negative values:
    *       # -1: the cell is a Total cell. It shows a total.
    *       # -2: the cell is collapsed. Applies to pivot tables.
    *       # -3: the cell belongs to the group Others.
    *       # -4: the cell is empty. Applies to pivot tables.
    */
  var qElemNumber: Double = js.native
  /**
    * Frequency of the value.
    * This parameter is optional.
    */
  var qFrequency: String = js.native
  /**
    * Search hits.
    * The search hits are highlighted.
    * This parameter is optional.
    */
  var qHighlightRanges: INxHighlightRanges = js.native
  /**
    * Is set to true, if qText and qNum are empty.
    * This parameter is optional. The default value is false.
    */
  var qIsEmpty: Boolean = js.native
  /**
    * Is set to true if the value is Null.
    */
  var qIsNull: Boolean = js.native
  /**
    * Is set to true if the cell belongs to the group Others.
    * Dimension values can be set as Others depending on what has been defined in OtherTotalSpecProp.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsOtherCell: Boolean = js.native
  /**
    * Is set to true if a total is displayed in the cell.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsTotalCell: Boolean = js.native
  /**
    * A value.
    * This parameter is optional.
    */
  var qNum: js.UndefOr[Double] = js.native
  /**
    * State of the value.
    * The default state for a measure is L.
    * L for Locked
    * S for Selected
    * O for Optional
    * D for Deselected
    * A for Alternative
    * X for eXcluded
    * XS for eXcluded Selected
    * XL for eXcluded Locked
    */
  var qState: StateType = js.native
  /**
    * Some text.
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.native
}

object INxCell {
  @scala.inline
  def apply(
    qAttrDims: INxAttributeDimValues,
    qAttrExps: INxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: INxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qState: StateType
  ): INxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCell]
  }
  @scala.inline
  implicit class INxCellOps[Self <: INxCell] (val x: Self) extends AnyVal {
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
    def withQElemNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHighlightRanges(value: INxHighlightRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHighlightRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsOtherCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsOtherCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsTotalCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsTotalCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQState(value: StateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(js.undefined)
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(js.undefined)
        ret
    }
  }
  
}

