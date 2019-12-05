package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.AboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.BelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.Blanks
import typingsSlinky.officeDashJs.officeDashJsStrings.DuplicateValues
import typingsSlinky.officeDashJs.officeDashJsStrings.EqualOrAboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.EqualOrBelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.Errors
import typingsSlinky.officeDashJs.officeDashJsStrings.Invalid
import typingsSlinky.officeDashJs.officeDashJsStrings.LastMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.LastSevenDays
import typingsSlinky.officeDashJs.officeDashJsStrings.LastWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.NextMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.NextWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.NonBlanks
import typingsSlinky.officeDashJs.officeDashJsStrings.NonErrors
import typingsSlinky.officeDashJs.officeDashJsStrings.OneStdDevAboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.OneStdDevBelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisMonth
import typingsSlinky.officeDashJs.officeDashJsStrings.ThisWeek
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeStdDevAboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeStdDevBelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.Today
import typingsSlinky.officeDashJs.officeDashJsStrings.Tomorrow
import typingsSlinky.officeDashJs.officeDashJsStrings.TwoStdDevAboveAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.TwoStdDevBelowAverage
import typingsSlinky.officeDashJs.officeDashJsStrings.UniqueValues
import typingsSlinky.officeDashJs.officeDashJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalPresetCriteriaRule extends js.Object {
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
}

object ConditionalPresetCriteriaRule {
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
}

