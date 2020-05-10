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
trait NxPivotDimensioncell extends js.Object {
  var qAttrDims: js.Array[NxAttributeDimValues] = js.native
  var qAttrExps: js.Array[NxAttributeExpressionValues] = js.native
  var qCanCollapse: Boolean = js.native
  var qCanExpand: Boolean = js.native
  var qDown: Double = js.native
  var qElemNo: Double = js.native
  var qSubNodes: js.Array[NxPivotDimensioncell] = js.native
  var qText: String = js.native
  var qType: V | E | N | T | P | R | U = js.native
  var qUp: Double = js.native
  var qValue: Double = js.native
}

object NxPivotDimensioncell {
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
  @scala.inline
  implicit class NxPivotDimensioncellOps[Self <: NxPivotDimensioncell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAttrDims(value: js.Array[NxAttributeDimValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrExps(value: js.Array[NxAttributeExpressionValues]): Self = {
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
    def withQSubNodes(value: js.Array[NxPivotDimensioncell]): Self = {
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

