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
trait ConditionalCellValueRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.undefined
  /**
    *
    * The operator of the cell value conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
}

object ConditionalCellValueRule {
  @scala.inline
  def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual,
    formula2: String = null
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (formula2 != null) __obj.updateDynamic("formula2")(formula2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
}

