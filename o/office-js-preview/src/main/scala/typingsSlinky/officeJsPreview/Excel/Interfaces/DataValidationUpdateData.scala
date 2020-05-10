package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.DataValidationErrorAlert
import typingsSlinky.officeJsPreview.Excel.DataValidationPrompt
import typingsSlinky.officeJsPreview.Excel.DataValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataValidation object, for use in `dataValidation.set({ ... })`. */
@js.native
trait DataValidationUpdateData extends js.Object {
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.native
  /**
    *
    * Ignore blanks: no data validation will be performed on blank cells, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[Boolean] = js.native
  /**
    *
    * Prompt when users select a cell.
    *
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[DataValidationPrompt] = js.native
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[DataValidationRule] = js.native
}

object DataValidationUpdateData {
  @scala.inline
  def apply(): DataValidationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationUpdateData]
  }
  @scala.inline
  implicit class DataValidationUpdateDataOps[Self <: DataValidationUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorAlert(value: DataValidationErrorAlert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreBlanks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBlanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBlanks")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: DataValidationPrompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: DataValidationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

