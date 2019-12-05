package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.Automatic
import typingsSlinky.officeDashJs.officeDashJsStrings.Formula
import typingsSlinky.officeDashJs.officeDashJsStrings.HighestValue
import typingsSlinky.officeDashJs.officeDashJsStrings.Invalid
import typingsSlinky.officeDashJs.officeDashJsStrings.LowestValue
import typingsSlinky.officeDashJs.officeDashJsStrings.Number
import typingsSlinky.officeDashJs.officeDashJsStrings.Percent
import typingsSlinky.officeDashJs.officeDashJsStrings.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule-type for a Data Bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the databar rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile,
    formula: String = null
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
}

