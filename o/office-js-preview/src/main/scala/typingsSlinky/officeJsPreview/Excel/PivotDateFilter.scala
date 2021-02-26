package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.After
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AfterOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruary
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
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Before
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BeforeOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Between
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Equals
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisYear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Today
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Yesterday
import org.scalablytyped.runtime.StObject
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
trait PivotDateFilter extends StObject {
  
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
  implicit class PivotDateFilterMutableBuilder[Self <: PivotDateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterDatetime): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setCondition(
      value: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setLowerBound(value: FilterDatetime): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: FilterDatetime): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
    
    @scala.inline
    def setWholeDays(value: Boolean): Self = StObject.set(x, "wholeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWholeDaysUndefined: Self = StObject.set(x, "wholeDays", js.undefined)
  }
}
