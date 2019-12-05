package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DifferenceFrom
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Index
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentDifferenceFrom
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOf
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfColumnTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfGrandTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentColumnTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentRowTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfRowTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentRunningTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RankAscending
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RankDecending
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RunningTotal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.8]
  */
trait ShowAsRule extends js.Object {
  /**
    *
    * The base PivotField to base the ShowAs calculation, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.undefined
  /**
    *
    * The base Item to base the ShowAs calculation on, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.undefined
  /**
    *
    * The ShowAs Calculation to use for the Data PivotField. See Excel.ShowAsCalculation for Details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
}

object ShowAsRule {
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index,
    baseField: PivotField = null,
    baseItem: PivotItem = null
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    if (baseField != null) __obj.updateDynamic("baseField")(baseField.asInstanceOf[js.Any])
    if (baseItem != null) __obj.updateDynamic("baseItem")(baseItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
}

