package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruray
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJanuary
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJuly
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJune
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMarch
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMay
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodNovember
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodOctober
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodSeptember
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.And
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BottomItems
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BottomPercent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CellColor
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Custom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dynamic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FontColor
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Or
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Today
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TopItems
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TopPercent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Values
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterCriteria extends js.Object {
  
  /**
    *
    * The HTML color string used to filter cells. Used with "cellColor" and "fontColor" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents (e.g., "5" for the top 5 items if filterOn is set to "topItems").
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.native
  
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.native
  
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.native
  
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon | Custom = js.native
  
  /**
    *
    * The icon used to filter cells. Used with "icon" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.native
  
  /**
    *
    * The operator used to combine criterion 1 and 2 when using "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.native
  
  /**
    *
    * The property used by the filter to do rich filter on richvalues.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.native
  
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.native
}
object FilterCriteria {
  
  @scala.inline
  def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon | Custom
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setFilterOn(
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon | Custom
    ): Self = this.set("filterOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCriterion1(value: String): Self = this.set("criterion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion1: Self = this.set("criterion1", js.undefined)
    
    @scala.inline
    def setCriterion2(value: String): Self = this.set("criterion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion2: Self = this.set("criterion2", js.undefined)
    
    @scala.inline
    def setDynamicCriteria(
      value: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
    ): Self = this.set("dynamicCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicCriteria: Self = this.set("dynamicCriteria", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOperator(value: FilterOperator | And | Or): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setSubField(value: String): Self = this.set("subField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubField: Self = this.set("subField", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (String | FilterDatetime)*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String | FilterDatetime]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
