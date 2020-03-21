package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.AboveAverage
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodApril
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodFebruray
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodJanuary
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodJuly
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodJune
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodMarch
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodMay
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodNovember
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodOctober
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodQuarter1
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodQuarter2
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodQuarter3
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodQuarter4
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodSeptember
import typingsSlinky.officeJs.officeJsStrings.And
import typingsSlinky.officeJs.officeJsStrings.BelowAverage
import typingsSlinky.officeJs.officeJsStrings.BottomItems
import typingsSlinky.officeJs.officeJsStrings.BottomPercent
import typingsSlinky.officeJs.officeJsStrings.CellColor
import typingsSlinky.officeJs.officeJsStrings.Custom
import typingsSlinky.officeJs.officeJsStrings.Dynamic
import typingsSlinky.officeJs.officeJsStrings.FontColor
import typingsSlinky.officeJs.officeJsStrings.LastMonth
import typingsSlinky.officeJs.officeJsStrings.LastQuarter
import typingsSlinky.officeJs.officeJsStrings.LastWeek
import typingsSlinky.officeJs.officeJsStrings.LastYear
import typingsSlinky.officeJs.officeJsStrings.NextMonth
import typingsSlinky.officeJs.officeJsStrings.NextQuarter
import typingsSlinky.officeJs.officeJsStrings.NextWeek
import typingsSlinky.officeJs.officeJsStrings.NextYear
import typingsSlinky.officeJs.officeJsStrings.Or
import typingsSlinky.officeJs.officeJsStrings.ThisMonth
import typingsSlinky.officeJs.officeJsStrings.ThisQuarter
import typingsSlinky.officeJs.officeJsStrings.ThisWeek
import typingsSlinky.officeJs.officeJsStrings.ThisYear
import typingsSlinky.officeJs.officeJsStrings.Today
import typingsSlinky.officeJs.officeJsStrings.Tomorrow
import typingsSlinky.officeJs.officeJsStrings.TopItems
import typingsSlinky.officeJs.officeJsStrings.TopPercent
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import typingsSlinky.officeJs.officeJsStrings.Values
import typingsSlinky.officeJs.officeJsStrings.YearToDate
import typingsSlinky.officeJs.officeJsStrings.Yesterday
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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeJs.officeJsStrings.Icon | Custom
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeJs.officeJsStrings.Icon | Custom,
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

