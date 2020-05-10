package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ChartAxisCategoryType
import typingsSlinky.officeJs.Excel.ChartAxisDisplayUnit
import typingsSlinky.officeJs.Excel.ChartAxisPosition
import typingsSlinky.officeJs.Excel.ChartAxisScaleType
import typingsSlinky.officeJs.Excel.ChartAxisTickLabelPosition
import typingsSlinky.officeJs.Excel.ChartAxisTickMark
import typingsSlinky.officeJs.Excel.ChartAxisTimeUnit
import typingsSlinky.officeJs.Excel.ChartTickLabelAlignment
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.Billions
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.Cross
import typingsSlinky.officeJs.officeJsStrings.Custom
import typingsSlinky.officeJs.officeJsStrings.DateAxis
import typingsSlinky.officeJs.officeJsStrings.Days
import typingsSlinky.officeJs.officeJsStrings.High
import typingsSlinky.officeJs.officeJsStrings.HundredMillions
import typingsSlinky.officeJs.officeJsStrings.HundredThousands
import typingsSlinky.officeJs.officeJsStrings.Hundreds
import typingsSlinky.officeJs.officeJsStrings.Inside
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.Linear
import typingsSlinky.officeJs.officeJsStrings.Logarithmic
import typingsSlinky.officeJs.officeJsStrings.Low
import typingsSlinky.officeJs.officeJsStrings.Maximum
import typingsSlinky.officeJs.officeJsStrings.Millions
import typingsSlinky.officeJs.officeJsStrings.Minimum
import typingsSlinky.officeJs.officeJsStrings.Months
import typingsSlinky.officeJs.officeJsStrings.NextToAxis
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Outside
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.TenMillions
import typingsSlinky.officeJs.officeJsStrings.TenThousands
import typingsSlinky.officeJs.officeJsStrings.TextAxis
import typingsSlinky.officeJs.officeJsStrings.Thousands
import typingsSlinky.officeJs.officeJsStrings.Trillions
import typingsSlinky.officeJs.officeJsStrings.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxis object, for use in `chartAxis.set({ ... })`. */
@js.native
trait ChartAxisUpdateData extends js.Object {
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.native
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[ChartAxisCategoryType | Automatic | TextAxis | DateAxis] = js.native
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[
    ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
  ] = js.native
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatUpdateData] = js.native
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.native
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
  var logBase: js.UndefOr[Double] = js.native
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.native
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[js.Any] = js.native
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.native
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[js.Any] = js.native
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
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.native
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
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.native
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
  var textOrientation: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.native
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleUpdateData] = js.native
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartAxisUpdateData {
  @scala.inline
  def apply(): ChartAxisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisUpdateData]
  }
  @scala.inline
  implicit class ChartAxisUpdateDataOps[Self <: ChartAxisUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: ChartTickLabelAlignment | Center | Left | Right): Self = {
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
    def withBaseTimeUnit(value: ChartAxisTimeUnit | Days | Months | Years): Self = {
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
    def withCategoryType(value: ChartAxisCategoryType | Automatic | TextAxis | DateAxis): Self = {
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
    def withDisplayUnit(
      value: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
    ): Self = {
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
    def withFormat(value: ChartAxisFormatUpdateData): Self = {
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
    def withLogBase(value: Double): Self = {
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
    def withMajorGridlines(value: ChartGridlinesUpdateData): Self = {
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
    def withMajorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = {
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
    def withMajorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = {
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
    def withMajorUnit(value: js.Any): Self = {
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
    def withMaximum(value: js.Any): Self = {
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
    def withMinimum(value: js.Any): Self = {
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
    def withMinorGridlines(value: ChartGridlinesUpdateData): Self = {
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
    def withMinorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = {
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
    def withMinorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = {
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
    def withMinorUnit(value: js.Any): Self = {
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
    def withNumberFormat(value: String): Self = {
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
    def withOffset(value: Double): Self = {
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
    def withPosition(value: ChartAxisPosition | Automatic | Maximum | Minimum | Custom): Self = {
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
    def withScaleType(value: ChartAxisScaleType | Linear | Logarithmic): Self = {
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
    def withTextOrientation(value: js.Any): Self = {
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
    def withTickLabelPosition(value: ChartAxisTickLabelPosition | NextToAxis | High | Low | None): Self = {
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
    def withTickLabelSpacing(value: js.Any): Self = {
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
    def withTickMarkSpacing(value: Double): Self = {
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
    def withTitle(value: ChartAxisTitleUpdateData): Self = {
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
  }
  
}

