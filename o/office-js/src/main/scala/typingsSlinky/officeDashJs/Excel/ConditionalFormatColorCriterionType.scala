package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatColorCriterionType extends js.Object

/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends js.Object {
  @js.native
  sealed trait formula extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait highestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait invalid extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait lowestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait number extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percent extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percentile extends ConditionalFormatColorCriterionType
  
  /* "Formula" */ val formula: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.formula with String = js.native
  /* "HighestValue" */ val highestValue: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.highestValue with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.invalid with String = js.native
  /* "LowestValue" */ val lowestValue: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.lowestValue with String = js.native
  /* "Number" */ val number: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.number with String = js.native
  /* "Percent" */ val percent: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.percent with String = js.native
  /* "Percentile" */ val percentile: typingsSlinky.officeDashJs.Excel.ConditionalFormatColorCriterionType.percentile with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatColorCriterionType with String] = js.native
}

