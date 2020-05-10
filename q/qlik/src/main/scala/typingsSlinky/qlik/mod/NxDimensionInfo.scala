package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.C
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.H
import typingsSlinky.qlik.qlikStrings.N
import typingsSlinky.qlik.qlikStrings.T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxDimensionInfo extends ColumnInfo {
  var qContinuousAxes: Boolean = js.native
  var qDerivedField: Boolean = js.native
  var qDimensionType: D | N | T = js.native
  var qGroupFallbackTitles: js.Array[String] = js.native
  var qGroupFieldDefs: js.Array[String] = js.native
  var qGroupPos: Double = js.native
  var qGrouping: N | H | C = js.native
  var qIsCyclic: Boolean = js.native
  var qIsSemantic: Boolean = js.native
  var qLocker: String = js.native
  var qStateCounts: NxStateCounts = js.native
  var qTags: js.Array[String] = js.native
}

object NxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: D | N | T,
    qError: NxValidationError,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: N | H | C,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocker: String,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D,
    qStateCounts: NxStateCounts,
    qTags: js.Array[String]
  ): NxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocker = qLocker.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDimensionInfo]
  }
  @scala.inline
  implicit class NxDimensionInfoOps[Self <: NxDimensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQContinuousAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContinuousAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDerivedField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDerivedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDimensionType(value: D | N | T): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupFallbackTitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupFallbackTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupFieldDefs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupFieldDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGrouping(value: N | H | C): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsCyclic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsCyclic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsSemantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSemantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLocker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateCounts(value: NxStateCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

