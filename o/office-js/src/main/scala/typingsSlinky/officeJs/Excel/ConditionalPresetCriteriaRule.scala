package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.AboveAverage
import typingsSlinky.officeJs.officeJsStrings.BelowAverage
import typingsSlinky.officeJs.officeJsStrings.Blanks
import typingsSlinky.officeJs.officeJsStrings.DuplicateValues
import typingsSlinky.officeJs.officeJsStrings.EqualOrAboveAverage
import typingsSlinky.officeJs.officeJsStrings.EqualOrBelowAverage
import typingsSlinky.officeJs.officeJsStrings.Errors
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.LastMonth
import typingsSlinky.officeJs.officeJsStrings.LastSevenDays
import typingsSlinky.officeJs.officeJsStrings.LastWeek
import typingsSlinky.officeJs.officeJsStrings.NextMonth
import typingsSlinky.officeJs.officeJsStrings.NextWeek
import typingsSlinky.officeJs.officeJsStrings.NonBlanks
import typingsSlinky.officeJs.officeJsStrings.NonErrors
import typingsSlinky.officeJs.officeJsStrings.OneStdDevAboveAverage
import typingsSlinky.officeJs.officeJsStrings.OneStdDevBelowAverage
import typingsSlinky.officeJs.officeJsStrings.ThisMonth
import typingsSlinky.officeJs.officeJsStrings.ThisWeek
import typingsSlinky.officeJs.officeJsStrings.ThreeStdDevAboveAverage
import typingsSlinky.officeJs.officeJsStrings.ThreeStdDevBelowAverage
import typingsSlinky.officeJs.officeJsStrings.Today
import typingsSlinky.officeJs.officeJsStrings.Tomorrow
import typingsSlinky.officeJs.officeJsStrings.TwoStdDevAboveAverage
import typingsSlinky.officeJs.officeJsStrings.TwoStdDevBelowAverage
import typingsSlinky.officeJs.officeJsStrings.UniqueValues
import typingsSlinky.officeJs.officeJsStrings.Yesterday
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
