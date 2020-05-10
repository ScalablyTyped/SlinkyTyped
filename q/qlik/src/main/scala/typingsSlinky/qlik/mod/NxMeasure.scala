package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxMeasure extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef] = js.native
  var qAttributeExpressions: js.Array[NxAttrExprDef] = js.native
  var qCalcCond: ValueExpr = js.native
  var qDef: NxInlineMeasureDef = js.native
  var qLibraryId: String = js.native
  var qSortBy: SortCriteria = js.native
}

object NxMeasure {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineMeasureDef,
    qLibraryId: String,
    qSortBy: SortCriteria
  ): NxMeasure = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxMeasure]
  }
  @scala.inline
  implicit class NxMeasureOps[Self <: NxMeasure] (val x: Self) extends AnyVal {
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
    def withQDef(value: NxInlineMeasureDef): Self = {
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
    def withQSortBy(value: SortCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

