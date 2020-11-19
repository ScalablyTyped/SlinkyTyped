package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.FilterData
import typingsSlinky.officeJsPreview.Excel.Interfaces.FilterLoadOptions
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.anon.Expand
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
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Manages the filtering of a table's column.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait Filter extends ClientObject {
  
  /**
    * Apply the given filter criteria on the given column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The criteria to apply.
    */
  @JSName("apply")
  def apply(criteria: FilterCriteria): Unit = js.native
  
  /**
    * Apply a "Bottom Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the bottom to show.
    */
  def applyBottomItemsFilter(count: Double): Unit = js.native
  
  /**
    * Apply a "Bottom Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the bottom to show.
    */
  def applyBottomPercentFilter(percent: Double): Unit = js.native
  
  /**
    * Apply a "Cell Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The background color of the cells to show.
    */
  def applyCellColorFilter(color: String): Unit = js.native
  
  /**
    * Apply an "Icon" filter to the column for the given criteria strings.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria1 The first criteria string.
    * @param criteria2 Optional. The second criteria string.
    * @param oper Optional. The operator that describes how the two criteria are joined.
    */
  def applyCustomFilter(criteria1: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: js.UndefOr[scala.Nothing], oper: FilterOperator): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String, oper: FilterOperator): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_And(criteria1: String, criteria2: js.UndefOr[scala.Nothing], oper: And): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_And(criteria1: String, criteria2: String, oper: And): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_Or(criteria1: String, criteria2: js.UndefOr[scala.Nothing], oper: Or): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_Or(criteria1: String, criteria2: String, oper: Or): Unit = js.native
  
  /**
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(criteria: DynamicFilterCriteria): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AboveAverage(criteria: AboveAverage): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodApril(criteria: AllDatesInPeriodApril): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodAugust(criteria: AllDatesInPeriodAugust): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodDecember(criteria: AllDatesInPeriodDecember): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodFebruray(criteria: AllDatesInPeriodFebruray): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodJanuary(criteria: AllDatesInPeriodJanuary): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodJuly(criteria: AllDatesInPeriodJuly): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodJune(criteria: AllDatesInPeriodJune): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodMarch(criteria: AllDatesInPeriodMarch): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodMay(criteria: AllDatesInPeriodMay): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodNovember(criteria: AllDatesInPeriodNovember): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodOctober(criteria: AllDatesInPeriodOctober): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodQuarter1(criteria: AllDatesInPeriodQuarter1): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodQuarter2(criteria: AllDatesInPeriodQuarter2): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodQuarter3(criteria: AllDatesInPeriodQuarter3): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodQuarter4(criteria: AllDatesInPeriodQuarter4): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_AllDatesInPeriodSeptember(criteria: AllDatesInPeriodSeptember): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_BelowAverage(criteria: BelowAverage): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_LastMonth(criteria: LastMonth): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_LastQuarter(criteria: LastQuarter): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_LastWeek(criteria: LastWeek): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_LastYear(criteria: LastYear): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_NextMonth(criteria: NextMonth): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_NextQuarter(criteria: NextQuarter): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_NextWeek(criteria: NextWeek): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_NextYear(criteria: NextYear): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_ThisMonth(criteria: ThisMonth): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_ThisQuarter(criteria: ThisQuarter): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_ThisWeek(criteria: ThisWeek): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_ThisYear(criteria: ThisYear): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_Today(criteria: Today): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_Tomorrow(criteria: Tomorrow): Unit = js.native
  /**
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_Unknown(criteria: Unknown_): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_YearToDate(criteria: YearToDate): Unit = js.native
  @JSName("applyDynamicFilter")
  def applyDynamicFilter_Yesterday(criteria: Yesterday): Unit = js.native
  
  /**
    * Apply a "Font Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The font color of the cells to show.
    */
  def applyFontColorFilter(color: String): Unit = js.native
  
  /**
    * Apply an "Icon" filter to the column for the given icon.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param icon The icons of the cells to show.
    */
  def applyIconFilter(icon: Icon): Unit = js.native
  
  /**
    * Apply a "Top Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the top to show.
    */
  def applyTopItemsFilter(count: Double): Unit = js.native
  
  /**
    * Apply a "Top Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the top to show.
    */
  def applyTopPercentFilter(percent: Double): Unit = js.native
  
  /**
    * Apply a "Values" filter to the column for the given values.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values The list of values to show. This must be an array of strings or an array of Excel.FilterDateTime objects.
    */
  def applyValuesFilter(values: js.Array[String | FilterDatetime]): Unit = js.native
  
  /**
    * Clear the filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Filter: RequestContext = js.native
  
  /**
    *
    * The currently applied filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  val criteria: FilterCriteria = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Filter = js.native
  def load(options: FilterLoadOptions): Filter = js.native
  def load(propertyNamesAndPaths: Expand): Filter = js.native
  def load(propertyNames: String): Filter = js.native
  def load(propertyNames: js.Array[String]): Filter = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Filter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FilterData = js.native
}
