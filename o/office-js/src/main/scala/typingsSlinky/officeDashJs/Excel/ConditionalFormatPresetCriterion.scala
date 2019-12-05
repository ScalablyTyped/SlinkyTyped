package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatPresetCriterion extends js.Object

/**
  *
  * Represents the criteria for the Preset Criteria conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatPresetCriterion")
@js.native
object ConditionalFormatPresetCriterion extends js.Object {
  @js.native
  sealed trait aboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait belowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait blanks extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait duplicateValues extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait errors extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait invalid extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastSevenDays extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonBlanks extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonErrors extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait today extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait tomorrow extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait uniqueValues extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait yesterday extends ConditionalFormatPresetCriterion
  
  /* "AboveAverage" */ val aboveAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.aboveAverage with String = js.native
  /* "BelowAverage" */ val belowAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.belowAverage with String = js.native
  /* "Blanks" */ val blanks: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.blanks with String = js.native
  /* "DuplicateValues" */ val duplicateValues: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.duplicateValues with String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.equalOrAboveAverage with String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.equalOrBelowAverage with String = js.native
  /* "Errors" */ val errors: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.errors with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.invalid with String = js.native
  /* "LastMonth" */ val lastMonth: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastMonth with String = js.native
  /* "LastSevenDays" */ val lastSevenDays: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastSevenDays with String = js.native
  /* "LastWeek" */ val lastWeek: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastWeek with String = js.native
  /* "NextMonth" */ val nextMonth: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.nextMonth with String = js.native
  /* "NextWeek" */ val nextWeek: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.nextWeek with String = js.native
  /* "NonBlanks" */ val nonBlanks: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.nonBlanks with String = js.native
  /* "NonErrors" */ val nonErrors: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.nonErrors with String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.oneStdDevAboveAverage with String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.oneStdDevBelowAverage with String = js.native
  /* "ThisMonth" */ val thisMonth: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.thisMonth with String = js.native
  /* "ThisWeek" */ val thisWeek: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.thisWeek with String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.threeStdDevAboveAverage with String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.threeStdDevBelowAverage with String = js.native
  /* "Today" */ val today: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.tomorrow with String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.twoStdDevAboveAverage with String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.twoStdDevBelowAverage with String = js.native
  /* "UniqueValues" */ val uniqueValues: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.uniqueValues with String = js.native
  /* "Yesterday" */ val yesterday: typingsSlinky.officeDashJs.Excel.ConditionalFormatPresetCriterion.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
}

