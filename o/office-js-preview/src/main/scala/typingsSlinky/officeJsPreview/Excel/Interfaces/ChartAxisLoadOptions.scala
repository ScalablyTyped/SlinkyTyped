package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single axis in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxisLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[Boolean] = js.native
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `Position` instead.
    * Represents the specified axis where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crosses: js.UndefOr[Boolean] = js.native
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `PositionAt` instead.
    * Represents the specified axis where the other axis crosses at. Read Only. Set to this property should use SetCrossesAt(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crossesAt: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatLoadOptions] = js.native
  /**
    *
    * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.native
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.native
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether an axis is multilevel or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether Microsoft Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleLoadOptions] = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object ChartAxisLoadOptions {
  @scala.inline
  def apply(): ChartAxisLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisLoadOptions]
  }
  @scala.inline
  implicit class ChartAxisLoadOptionsOps[Self <: ChartAxisLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTimeUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTimeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTimeUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryType")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosses")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossesAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossesAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDisplayUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDisplayUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDisplayUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDisplayUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartAxisFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBetweenCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBetweenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBetweenCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBetweenCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkNumberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorGridlines(value: ChartGridlinesLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickMark")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTimeUnitScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeUnitScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTimeUnitScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeUnitScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridlines(value: ChartGridlinesLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickMark")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTimeUnitScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeUnitScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTimeUnitScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeUnitScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAt")(js.undefined)
        ret
    }
    @scala.inline
    def withReversePlotOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversePlotOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversePlotOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversePlotOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDisplayUnitLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisplayUnitLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDisplayUnitLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisplayUnitLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLabelPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLabelSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabelSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLabelSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabelSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTickMarkSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMarkSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickMarkSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMarkSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ChartAxisTitleLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

