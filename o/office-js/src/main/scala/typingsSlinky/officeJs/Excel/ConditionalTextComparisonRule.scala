package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.BeginsWith
import typingsSlinky.officeJs.officeJsStrings.Contains
import typingsSlinky.officeJs.officeJsStrings.EndsWith
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.NotContains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Cell Value Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalTextComparisonRule extends js.Object {
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith = js.native
  /**
    *
    * The Text value of conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var text: String = js.native
}

object ConditionalTextComparisonRule {
  @scala.inline
  def apply(
    operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith,
    text: String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
  @scala.inline
  implicit class ConditionalTextComparisonRuleOps[Self <: ConditionalTextComparisonRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

