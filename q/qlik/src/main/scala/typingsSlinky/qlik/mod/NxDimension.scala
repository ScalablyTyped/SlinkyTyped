package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxDimension extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef] = js.native
  var qAttributeExpressions: js.Array[NxAttrExprDef] = js.native
  var qCalcCond: ValueExpr = js.native
  var qDef: NxInlineDimensionDef = js.native
  var qLibraryId: String = js.native
  var qNullSuppression: Boolean = js.native
  var qOtherLabel: String = js.native
  var qOtherTotalSpec: OtherTotalSpecProp = js.native
  var qShowAll: Boolean = js.native
  var qTotalLabel: String = js.native
}

object NxDimension {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineDimensionDef,
    qLibraryId: String,
    qNullSuppression: Boolean,
    qOtherLabel: String,
    qOtherTotalSpec: OtherTotalSpecProp,
    qShowAll: Boolean,
    qTotalLabel: String
  ): NxDimension = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qNullSuppression = qNullSuppression.asInstanceOf[js.Any], qOtherLabel = qOtherLabel.asInstanceOf[js.Any], qOtherTotalSpec = qOtherTotalSpec.asInstanceOf[js.Any], qShowAll = qShowAll.asInstanceOf[js.Any], qTotalLabel = qTotalLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDimension]
  }
  @scala.inline
  implicit class NxDimensionOps[Self <: NxDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAttributeDimensions(value: js.Array[NxAttrDimDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttributeExpressions(value: js.Array[NxAttrExprDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCalcCond(value: ValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCalcCond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDef(value: NxInlineDimensionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNullSuppression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNullSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherTotalSpec(value: OtherTotalSpecProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherTotalSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQShowAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

