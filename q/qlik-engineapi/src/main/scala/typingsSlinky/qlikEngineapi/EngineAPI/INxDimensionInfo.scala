package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDimensionInfo...
  */
@js.native
trait INxDimensionInfo extends js.Object {
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: Double = js.native
  /**
    * Array of attribute dimensions.
    * Array of NxAttrDimInfo
    */
  var qAttrDimInfo: INxAttrDimInfo = js.native
  /**
    * Array of attribute expressions.
    * Array of NxAttrExprInfo
    */
  var qAttrExprInfo: INxAttrExprInfo = js.native
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: Double = js.native
  /**
    * Is continuous axis used.
    * Boolean
    */
  var qContinuousAxes: Boolean = js.native
  /**
    * Is derived field is used as a dimension.
    * Boolean
    */
  var qDerivedField: Boolean = js.native
  /**
    * Binary format of the field.
    * One of:
    *       # D for discrete (String)
    *       # N for numeric (Double)
    *       # T for Time (Timestamp)
    */
  var qDimensionType: DimensionType = js.native
  /**
    * This parameter is optional.
    * Gives information on the error.
    * Null or NxValidationError
    */
  var qError: js.UndefOr[INxValidationError] = js.native
  /**
    * Corresponds to the label of the dimension that is selected.
    * If the label is not defined then the field name is used.
    * String
    */
  var qFallbackTitle: String = js.native
  /**
    * Array of dimension labels.
    * Contains the labels of all dimensions in a hierarchy group (for example the labels of all dimensions in a drill down group).
    * Array of String
    */
  var qGroupFallbackTitles: js.Array[String] = js.native
  /**
    * Array of field names.
    * Array of String
    */
  var qGroupFieldDefs: js.Array[String] = js.native
  /**
    * Index of the dimension that is currently in use.
    * qGroupPos is set to 0 if there are no hierarchical groups (drill-down groups) or cycle groups.
    * Integer
    */
  var qGroupPos: Double = js.native
  /**
    * Defines the grouping.
    * One of:
    *       # N for no grouping
    *       # H for drill-down
    *       # C for cyclic
    */
  var qGrouping: NxGrpType = js.native
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown). The engine guesses the type of the field based on the field's definition.
    * Boolean
    */
  var qIsAutoFormat: Boolean = js.native
  /**
    * Is a cyclic dimension used.
    * Boolean
    */
  var qIsCyclic: Boolean = js.native
  /**
    * If set to true, it means that the field is a semantic.
    * Boolean
    */
  var qIsSemantic: Boolean = js.native
  /**
    * Is set to true if the field is locked.
    * Boolean
    */
  var qLocked: Boolean = js.native
  /**
    * Maximum value.
    * Double
    */
  var qMax: Double = js.native
  /**
    * Minimum value.
    * Double
    */
  var qMin: Double = js.native
  /**
    * Format of the field.
    * This parameter is optional.
    * FieldAttributes
    */
  var qNumFormat: js.UndefOr[FieldAttributesType] = js.native
  /**
    * If set to true, it inverts the sort criteria in the field.
    * Boolean
    */
  var qReverseSort: Boolean = js.native
  /**
    * Sort indicator.
    * This parameter is optional.
    * The default value is no sorting.
    * One of:
    *       # N for no sorting
    *       # A for sorting ascending
    *       # D for sorting descending
    */
  var qSortIndicator: js.UndefOr[SortIndicatorType] = js.native
  /**
    * Number of values in a particular state.
    * NxStateCounts
    */
  var qStateCounts: INxStateCounts = js.native
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    * Array of String
    */
  var qTags: js.Array[String] = js.native
}

object INxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: INxAttrDimInfo,
    qAttrExprInfo: INxAttrExprInfo,
    qCardinal: Double,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: DimensionType,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: NxGrpType,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocked: Boolean,
    qMax: Double,
    qMin: Double,
    qReverseSort: Boolean,
    qStateCounts: INxStateCounts,
    qTags: js.Array[String]
  ): INxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDimensionInfo]
  }
  @scala.inline
  implicit class INxDimensionInfoOps[Self <: INxDimensionInfo] (val x: Self) extends AnyVal {
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
    def withQAttrDimInfo(value: INxAttrDimInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDimInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrExprInfo(value: INxAttrExprInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExprInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCardinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withQDimensionType(value: DimensionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFallbackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFallbackTitle")(value.asInstanceOf[js.Any])
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
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsAutoFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsAutoFormat")(value.asInstanceOf[js.Any])
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
    def withQLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(value.asInstanceOf[js.Any])
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
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateCounts(value: INxStateCounts): Self = {
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
    @scala.inline
    def withQError(value: INxValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(js.undefined)
        ret
    }
    @scala.inline
    def withQNumFormat(value: FieldAttributesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNumFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortIndicator(value: SortIndicatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortIndicator")(js.undefined)
        ret
    }
  }
  
}

