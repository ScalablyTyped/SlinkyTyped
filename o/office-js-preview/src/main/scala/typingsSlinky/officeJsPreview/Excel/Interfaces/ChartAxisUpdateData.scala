package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartAxisCategoryType
import typingsSlinky.officeJsPreview.Excel.ChartAxisDisplayUnit
import typingsSlinky.officeJsPreview.Excel.ChartAxisPosition
import typingsSlinky.officeJsPreview.Excel.ChartAxisScaleType
import typingsSlinky.officeJsPreview.Excel.ChartAxisTickLabelPosition
import typingsSlinky.officeJsPreview.Excel.ChartAxisTickMark
import typingsSlinky.officeJsPreview.Excel.ChartAxisTimeUnit
import typingsSlinky.officeJsPreview.Excel.ChartTickLabelAlignment
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Billions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Cross
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Custom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DateAxis
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Days
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.High
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.HundredMillions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.HundredThousands
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hundreds
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inside
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Linear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Low
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Maximum
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Millions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Minimum
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Months
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextToAxis
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Outside
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TenMillions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TenThousands
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TextAxis
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thousands
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Trillions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxis object, for use in `chartAxis.set({ ... })`. */
@js.native
trait ChartAxisUpdateData extends js.Object {
  
  /**
    *
    * Specifies the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.native
  
  /**
    *
    * Specifies the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  
  /**
    *
    * Specifies the category axis type.
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
    * Specifies if the value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the base of the logarithm when using logarithmic scales.
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
    * Specifies the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  
  /**
    *
    * Specifies the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
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
    * Specifies the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  
  /**
    *
    * Specifies the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
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
    * Specifies if an axis is multilevel.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.native
  
  /**
    *
    * Specifies if Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.native
  
  /**
    *
    * Specifies if the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[js.Any] = js.native
  
  /**
    *
    * Specifies the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.native
  
  /**
    *
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.native
  
  /**
    *
    * Specifies the number of categories or series between tick marks.
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
    * Specifies if the axis is visible.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: ChartTickLabelAlignment | Center | Left | Right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBaseTimeUnit(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("baseTimeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTimeUnit: Self = this.set("baseTimeUnit", js.undefined)
    
    @scala.inline
    def setCategoryType(value: ChartAxisCategoryType | Automatic | TextAxis | DateAxis): Self = this.set("categoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryType: Self = this.set("categoryType", js.undefined)
    
    @scala.inline
    def setDisplayUnit(
      value: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
    ): Self = this.set("displayUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayUnit: Self = this.set("displayUnit", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartAxisFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIsBetweenCategories(value: Boolean): Self = this.set("isBetweenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBetweenCategories: Self = this.set("isBetweenCategories", js.undefined)
    
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = this.set("linkNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkNumberFormat: Self = this.set("linkNumberFormat", js.undefined)
    
    @scala.inline
    def setLogBase(value: Double): Self = this.set("logBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBase: Self = this.set("logBase", js.undefined)
    
    @scala.inline
    def setMajorGridlines(value: ChartGridlinesUpdateData): Self = this.set("majorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridlines: Self = this.set("majorGridlines", js.undefined)
    
    @scala.inline
    def setMajorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = this.set("majorTickMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTickMark: Self = this.set("majorTickMark", js.undefined)
    
    @scala.inline
    def setMajorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("majorTimeUnitScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTimeUnitScale: Self = this.set("majorTimeUnitScale", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: js.Any): Self = this.set("majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorUnit: Self = this.set("majorUnit", js.undefined)
    
    @scala.inline
    def setMaximum(value: js.Any): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: js.Any): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMinorGridlines(value: ChartGridlinesUpdateData): Self = this.set("minorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridlines: Self = this.set("minorGridlines", js.undefined)
    
    @scala.inline
    def setMinorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = this.set("minorTickMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickMark: Self = this.set("minorTickMark", js.undefined)
    
    @scala.inline
    def setMinorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("minorTimeUnitScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTimeUnitScale: Self = this.set("minorTimeUnitScale", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: js.Any): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    
    @scala.inline
    def setMultiLevel(value: Boolean): Self = this.set("multiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLevel: Self = this.set("multiLevel", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: ChartAxisPosition | Automatic | Maximum | Minimum | Custom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReversePlotOrder(value: Boolean): Self = this.set("reversePlotOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversePlotOrder: Self = this.set("reversePlotOrder", js.undefined)
    
    @scala.inline
    def setScaleType(value: ChartAxisScaleType | Linear | Logarithmic): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleType: Self = this.set("scaleType", js.undefined)
    
    @scala.inline
    def setShowDisplayUnitLabel(value: Boolean): Self = this.set("showDisplayUnitLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDisplayUnitLabel: Self = this.set("showDisplayUnitLabel", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: js.Any): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    
    @scala.inline
    def setTickLabelPosition(value: ChartAxisTickLabelPosition | NextToAxis | High | Low | None): Self = this.set("tickLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLabelPosition: Self = this.set("tickLabelPosition", js.undefined)
    
    @scala.inline
    def setTickLabelSpacing(value: js.Any): Self = this.set("tickLabelSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLabelSpacing: Self = this.set("tickLabelSpacing", js.undefined)
    
    @scala.inline
    def setTickMarkSpacing(value: Double): Self = this.set("tickMarkSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickMarkSpacing: Self = this.set("tickMarkSpacing", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartAxisTitleUpdateData): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
