package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Blanks
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DuplicateValues
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualOrAboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualOrBelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Errors
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastSevenDays
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NonBlanks
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NonErrors
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OneStdDevAboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OneStdDevBelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisMonth
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisWeek
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStdDevAboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStdDevBelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Today
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tomorrow
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoStdDevAboveAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoStdDevBelowAverage
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.UniqueValues
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Yesterday
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

