package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access data validation rules. To create a new rule, use SpreadsheetApp.newDataValidation() and DataValidationBuilder. You can use
  * Range.setDataValidation(rule) to set the validation rule for a range.
  *
  *     // Log information about the data validation rule for cell A1.
  *     var cell = SpreadsheetApp.getActive().getRange('A1');
  *     var rule = cell.getDataValidation();
  *     if (rule != null) {
  *       var criteria = rule.getCriteriaType();
  *       var args = rule.getCriteriaValues();
  *       Logger.log('The data validation rule is %s %s', criteria, args);
  *     } else {
  *       Logger.log('The cell does not have a data validation rule.')
  *     }
  */
@js.native
trait DataValidation extends js.Object {
  def copy(): DataValidationBuilder = js.native
  def getAllowInvalid(): Boolean = js.native
  def getCriteriaType(): DataValidationCriteria = js.native
  def getCriteriaValues(): js.Array[_] = js.native
  def getHelpText(): String = js.native
}

object DataValidation {
  @scala.inline
  def apply(
    copy: () => DataValidationBuilder,
    getAllowInvalid: () => Boolean,
    getCriteriaType: () => DataValidationCriteria,
    getCriteriaValues: () => js.Array[_],
    getHelpText: () => String
  ): DataValidation = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAllowInvalid = js.Any.fromFunction0(getAllowInvalid), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHelpText = js.Any.fromFunction0(getHelpText))
    __obj.asInstanceOf[DataValidation]
  }
  @scala.inline
  implicit class DataValidationOps[Self <: DataValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => DataValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllowInvalid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowInvalid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaType(value: () => DataValidationCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaValues(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHelpText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

