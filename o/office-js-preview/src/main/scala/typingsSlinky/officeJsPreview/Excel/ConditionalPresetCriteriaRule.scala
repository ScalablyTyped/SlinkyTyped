package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Blanks
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DuplicateValues
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EqualOrAboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EqualOrBelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Errors
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastSevenDays
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NonBlanks
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NonErrors
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OneStdDevAboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OneStdDevBelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeStdDevAboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeStdDevBelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Today
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TwoStdDevAboveAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TwoStdDevBelowAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.UniqueValues
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalPresetCriteriaRule extends StObject {
  
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues = js.native
}
object ConditionalPresetCriteriaRule {
  
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
  
  @scala.inline
  implicit class ConditionalPresetCriteriaRuleMutableBuilder[Self <: ConditionalPresetCriteriaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriterion(
      value: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
    ): Self = StObject.set(x, "criterion", value.asInstanceOf[js.Any])
  }
}
