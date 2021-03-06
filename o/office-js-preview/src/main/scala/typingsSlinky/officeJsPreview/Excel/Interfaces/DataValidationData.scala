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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataValidation.toJSON()`. */
@js.native
trait DataValidationData extends StObject {
  
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.native
  
  /**
    *
    * Specifies if data validation will be performed on blank cells, it defaults to true.
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
  implicit class DataValidationDataMutableBuilder[Self <: DataValidationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorAlert(value: DataValidationErrorAlert): Self = StObject.set(x, "errorAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorAlertUndefined: Self = StObject.set(x, "errorAlert", js.undefined)
    
    @scala.inline
    def setIgnoreBlanks(value: Boolean): Self = StObject.set(x, "ignoreBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBlanksUndefined: Self = StObject.set(x, "ignoreBlanks", js.undefined)
    
    @scala.inline
    def setPrompt(value: DataValidationPrompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setType(
      value: DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
