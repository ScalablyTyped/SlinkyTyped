package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.DataValidationErrorAlert
import typingsSlinky.officeJsPreview.Excel.DataValidationPrompt
import typingsSlinky.officeJsPreview.Excel.DataValidationRule
import typingsSlinky.officeJsPreview.Excel.DataValidationType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Custom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Date
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Decimal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inconsistent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.List
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MixedCriteria
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TextLength
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Time
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WholeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataValidation.toJSON()`. */
@js.native
trait DataValidationData extends js.Object {
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
  /**
    *
    * Type of the data validation, see Excel.DataValidationType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
  ] = js.native
  /**
    *
    * Represents if all cell values are valid according to the data validation rules.
    Returns true if all cell values are valid, or false if all cell values are invalid.
    Returns null if there are both valid and invalid cell values within the range.
    *
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[Boolean] = js.native
}

object DataValidationData {
  @scala.inline
  def apply(): DataValidationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationData]
  }
  @scala.inline
  implicit class DataValidationDataOps[Self <: DataValidationData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withType(
      value: DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
  }
  
}

