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
trait DataValidationData extends js.Object {
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.undefined
  /**
    *
    * Ignore blanks: no data validation will be performed on blank cells, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Prompt when users select a cell.
    *
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[DataValidationPrompt] = js.undefined
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[DataValidationRule] = js.undefined
  /**
    *
    * Type of the data validation, see Excel.DataValidationType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
  ] = js.undefined
  /**
    *
    * Represents if all cell values are valid according to the data validation rules.
    Returns true if all cell values are valid, or false if all cell values are invalid.
    Returns null if there are both valid and invalid cell values within the range.
    *
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[Boolean] = js.undefined
}

object DataValidationData {
  @scala.inline
  def apply(
    errorAlert: DataValidationErrorAlert = null,
    ignoreBlanks: js.UndefOr[Boolean] = js.undefined,
    prompt: DataValidationPrompt = null,
    rule: DataValidationRule = null,
    `type`: DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): DataValidationData = {
    val __obj = js.Dynamic.literal()
    if (errorAlert != null) __obj.updateDynamic("errorAlert")(errorAlert.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBlanks)) __obj.updateDynamic("ignoreBlanks")(ignoreBlanks.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationData]
  }
}

