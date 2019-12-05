package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatIconRuleType extends js.Object

/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatIconRuleType")
@js.native
object ConditionalFormatIconRuleType extends js.Object {
  @js.native
  sealed trait formula extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait invalid extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait number extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percent extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percentile extends ConditionalFormatIconRuleType
  
  /* "Formula" */ val formula: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatIconRuleType.formula with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatIconRuleType.invalid with String = js.native
  /* "Number" */ val number: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatIconRuleType.number with String = js.native
  /* "Percent" */ val percent: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatIconRuleType.percent with String = js.native
  /* "Percentile" */ val percentile: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatIconRuleType.percentile with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatIconRuleType with String] = js.native
}

