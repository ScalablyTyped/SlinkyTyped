package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodApril
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodAugust
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodDecember
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodFebruray
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJanuary
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJuly
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJune
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodMarch
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodMay
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodNovember
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodOctober
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter1
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter3
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter4
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodSeptember
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.And
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BottomItems
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BottomPercent
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CellColor
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Custom
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dynamic
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FontColor
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastQuarter
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastYear
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextQuarter
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextYear
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Or
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisQuarter
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisYear
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Today
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tomorrow
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TopItems
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TopPercent
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Values
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.YearToDate
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterCriteria extends js.Object {
  /**
    *
    * The HTML color string used to filter cells. Used with "cellColor" and "fontColor" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents. E.g. "5" for the top 5 items if filterOn is set to "topItems"
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.undefined
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.undefined
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.undefined
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Icon | Custom
  /**
    *
    * The icon used to filter cells. Used with "icon" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  /**
    *
    * The operator used to combine criterion 1 and 2 when using "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.undefined
  /**
    *
    * The property used by the filter to do rich filter on richvalues.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Icon | Custom,
    color: String = null,
    criterion1: String = null,
    criterion2: String = null,
    dynamicCriteria: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday = null,
    icon: Icon = null,
    operator: FilterOperator | And | Or = null,
    subField: String = null,
    values: js.Array[String | FilterDatetime] = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1.asInstanceOf[js.Any])
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2.asInstanceOf[js.Any])
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

