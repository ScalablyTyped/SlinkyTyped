package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnInfo extends js.Object {
  var qApprMaxGlyphCount: Double = js.native
  var qAttrDimInfo: js.Array[NxAttrDimInfo] = js.native
  var qAttrExprInfo: js.Array[NxAttrExprInfo] = js.native
  var qCardinal: String = js.native
  var qError: NxValidationError = js.native
  var qFallbackTitle: String = js.native
  var qIsAutoFormat: Boolean = js.native
  var qMax: Double = js.native
  var qMin: Double = js.native
  var qNumFormat: FieldAttributes = js.native
  var qReverseSort: Boolean = js.native
  var qSortIndicator: N | A | D = js.native
}

object ColumnInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qError: NxValidationError,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  @scala.inline
  implicit class ColumnInfoOps[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQApprMaxGlyphCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qApprMaxGlyphCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrDimInfo(value: js.Array[NxAttrDimInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDimInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrExprInfo(value: js.Array[NxAttrExprInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExprInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCardinal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQError(value: NxValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFallbackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFallbackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsAutoFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsAutoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNumFormat(value: FieldAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortIndicator(value: N | A | D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortIndicator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

