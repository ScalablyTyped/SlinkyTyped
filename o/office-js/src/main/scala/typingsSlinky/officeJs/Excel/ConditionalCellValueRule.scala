package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Between
import typingsSlinky.officeJs.officeJsStrings.EqualTo
import typingsSlinky.officeJs.officeJsStrings.GreaterThan
import typingsSlinky.officeJs.officeJsStrings.GreaterThanOrEqual
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.LessThan
import typingsSlinky.officeJs.officeJsStrings.LessThanOrEqual
import typingsSlinky.officeJs.officeJsStrings.NotBetween
import typingsSlinky.officeJs.officeJsStrings.NotEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell value conditional format rule.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalCellValueRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.native
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual = js.native
}

object ConditionalCellValueRule {
  @scala.inline
  def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
  @scala.inline
  implicit class ConditionalCellValueRuleOps[Self <: ConditionalCellValueRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormula1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula2")(js.undefined)
        ret
    }
  }
  
}

