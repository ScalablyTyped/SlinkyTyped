package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.AboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodApril
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodAugust
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodDecember
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodFebruray
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodJanuary
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodJuly
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodJune
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodMarch
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodMay
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodNovember
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodOctober
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter1
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter2
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter3
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter4
import typingsSlinky.officeDashJs.officeDashJsStrings.AllDatesInPeriodSeptember
import typingsSlinky.officeDashJs.officeDashJsStrings.And
import typingsSlinky.officeDashJs.officeDashJsStrings.BelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.BottomItems
import typingsSlinky.officeDashJs.officeDashJsStrings.BottomPercent
import typingsSlinky.officeDashJs.officeDashJsStrings.CellColor
import typingsSlinky.officeDashJs.officeDashJsStrings.Custom
import typingsSlinky.officeDashJs.officeDashJsStrings.Dynamic
import typingsSlinky.officeDashJs.officeDashJsStrings.FontColor
import typingsSlinky.officeDashJs.officeDashJsStrings.LastMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.LastQuarter
import typingsSlinky.officeDashJs.officeDashJsStrings.LastWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.LastYear
import typingsSlinky.officeDashJs.officeDashJsStrings.NextMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.NextQuarter
import typingsSlinky.officeDashJs.officeDashJsStrings.NextWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.NextYear
import typingsSlinky.officeDashJs.officeDashJsStrings.Or
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisQuarter
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisYear
import typingsSlinky.officeDashJs.officeDashJsStrings.Today
import typingsSlinky.officeDashJs.officeDashJsStrings.Tomorrow
import typingsSlinky.officeDashJs.officeDashJsStrings.TopItems
import typingsSlinky.officeDashJs.officeDashJsStrings.TopPercent
import typingsSlinky.officeDashJs.officeDashJsStrings.Unknown_
import typingsSlinky.officeDashJs.officeDashJsStrings.Values
import typingsSlinky.officeDashJs.officeDashJsStrings.YearToDate
import typingsSlinky.officeDashJs.officeDashJsStrings.Yesterday
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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeDashJs.officeDashJsStrings.Icon | Custom
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeDashJs.officeDashJsStrings.Icon | Custom,
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

