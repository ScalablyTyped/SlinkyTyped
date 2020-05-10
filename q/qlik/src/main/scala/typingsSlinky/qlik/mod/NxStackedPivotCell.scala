package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.E
import typingsSlinky.qlik.qlikStrings.N
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.T
import typingsSlinky.qlik.qlikStrings.U
import typingsSlinky.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxStackedPivotCell extends js.Object {
  var qAttrDims: NxAttributeDimValues = js.native
  var qAttrExps: NxAttributeExpressionValues = js.native
  var qCanCollapse: Boolean = js.native
  var qCanExpand: Boolean = js.native
  var qDown: Double = js.native
  var qElemNo: Double = js.native
  var qMaxPos: Double = js.native
  var qMinNeg: Double = js.native
  var qRow: Double = js.native
  var qSubNodes: js.Array[NxStackedPivotCell] = js.native
  var qText: String = js.native
  var qType: V | E | N | T | P | R | U = js.native
  var qUp: Double = js.native
  var qValue: Double = js.native
}

object NxStackedPivotCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[NxStackedPivotCell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qMaxPos = qMaxPos.asInstanceOf[js.Any], qMinNeg = qMinNeg.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackedPivotCell]
  }
  @scala.inline
  implicit class NxStackedPivotCellOps[Self <: NxStackedPivotCell] (val x: Self) extends AnyVal {
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
    def withQSubNodes(value: js.Array[NxStackedPivotCell]): Self = {
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
    def withQType(value: V | E | N | T | P | R | U): Self = {
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

