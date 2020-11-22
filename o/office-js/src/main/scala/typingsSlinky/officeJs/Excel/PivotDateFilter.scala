package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.After
import typingsSlinky.officeJs.officeJsStrings.AfterOrEqualTo
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodApril
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typingsSlinky.officeJs.officeJsStrings.AllDatesInPeriodFebruary
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
import typingsSlinky.officeJs.officeJsStrings.Before
import typingsSlinky.officeJs.officeJsStrings.BeforeOrEqualTo
import typingsSlinky.officeJs.officeJsStrings.Between
import typingsSlinky.officeJs.officeJsStrings.Equals
import typingsSlinky.officeJs.officeJsStrings.LastMonth
import typingsSlinky.officeJs.officeJsStrings.LastQuarter
import typingsSlinky.officeJs.officeJsStrings.LastWeek
import typingsSlinky.officeJs.officeJsStrings.LastYear
import typingsSlinky.officeJs.officeJsStrings.NextMonth
import typingsSlinky.officeJs.officeJsStrings.NextQuarter
import typingsSlinky.officeJs.officeJsStrings.NextWeek
import typingsSlinky.officeJs.officeJsStrings.NextYear
import typingsSlinky.officeJs.officeJsStrings.ThisMonth
import typingsSlinky.officeJs.officeJsStrings.ThisQuarter
import typingsSlinky.officeJs.officeJsStrings.ThisWeek
import typingsSlinky.officeJs.officeJsStrings.ThisYear
import typingsSlinky.officeJs.officeJsStrings.Today
import typingsSlinky.officeJs.officeJsStrings.Tomorrow
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import typingsSlinky.officeJs.officeJsStrings.YearToDate
import typingsSlinky.officeJs.officeJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Configurable template for a date filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotDateFilter extends js.Object {
  
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi 1.12]
    */
  var condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember = js.native
  
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The lower-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * The upper-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * For `Equals`, `Before`, `After`, and `Between` filter conditions, indicates if comparisons should be made as whole days.
    *
    * [Api set: ExcelApi 1.12]
    */
  var wholeDays: js.UndefOr[Boolean] = js.native
}
object PivotDateFilter {
  
  @scala.inline
  def apply(
    condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
  ): PivotDateFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDateFilter]
  }
  
  @scala.inline
  implicit class PivotDateFilterOps[Self <: PivotDateFilter] (val x: Self) extends AnyVal {
    
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
    def setCondition(
      value: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
    ): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparator(value: FilterDatetime): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setLowerBound(value: FilterDatetime): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: FilterDatetime): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
    
    @scala.inline
    def setWholeDays(value: Boolean): Self = this.set("wholeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWholeDays: Self = this.set("wholeDays", js.undefined)
  }
}
