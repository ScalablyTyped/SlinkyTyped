package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Between
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NotBetween
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NotEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Basic Type data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait BasicDataValidation extends js.Object {
  /**
    *
    * Specifies the right-hand operand when the operator property is set to a binary operator such as GreaterThan (the left-hand operand is the value the user tries to enter in the cell). With the ternary operators Between and NotBetween, specifies the lower bound operand.
    For example, setting formula1 to 10 and operator to GreaterThan means that valid data for the range must be greater than 10.
    When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula1: String | Double | Range = js.native
  /**
    *
    * With the ternary operators Between and NotBetween, specifies the upper bound operand. Is not used with the binary operators, such as GreaterThan.
    When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula2: js.UndefOr[String | Double | Range] = js.native
  /**
    *
    * The operator to use for validating the data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo = js.native
}

object BasicDataValidation {
  @scala.inline
  def apply(
    formula1: String | Double | Range,
    operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
  ): BasicDataValidation = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicDataValidation]
  }
  @scala.inline
  implicit class BasicDataValidationOps[Self <: BasicDataValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormula1(value: String | Double | Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula2(value: String | Double | Range): Self = {
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

