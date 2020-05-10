package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.L
import typingsSlinky.qlik.qlikStrings.O
import typingsSlinky.qlik.qlikStrings.S
import typingsSlinky.qlik.qlikStrings.X
import typingsSlinky.qlik.qlikStrings.XL
import typingsSlinky.qlik.qlikStrings.XS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxCell extends js.Object {
  var qAttrDims: NxAttributeDimValues = js.native
  var qAttrExps: NxAttributeExpressionValues = js.native
  var qElemNumber: Double = js.native
  var qFrequency: String = js.native
  var qHighlightRanges: NxHighlightRanges = js.native
  var qIsEmpty: Boolean = js.native
  var qIsNull: Boolean = js.native
  var qIsOtherCell: Boolean = js.native
  var qIsTotalCell: Boolean = js.native
  var qNum: Double = js.native
  var qState: L | S | O | D | A | X | XS | XL = js.native
  var qText: String = js.native
}

object NxCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qNum: Double,
    qState: L | S | O | D | A | X | XS | XL,
    qText: String
  ): NxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCell]
  }
  @scala.inline
  implicit class NxCellOps[Self <: NxCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAttrDims(value: NxAttributeDimValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrExps(value: NxAttributeExpressionValues): Self = {
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
    def withQHighlightRanges(value: NxHighlightRanges): Self = {
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
    def withQNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQState(value: L | S | O | D | A | X | XS | XL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

