package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.Formula
import typingsSlinky.officeJs.officeJsStrings.HighestValue
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.LowestValue
import typingsSlinky.officeJs.officeJsStrings.Number
import typingsSlinky.officeJs.officeJsStrings.Percent
import typingsSlinky.officeJs.officeJsStrings.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule-type for a Data Bar.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalDataBarRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the databar rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile = js.native
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
  @scala.inline
  implicit class ConditionalDataBarRuleOps[Self <: ConditionalDataBarRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
  }
  
}

