package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.DifferenceFrom
import typingsSlinky.officeDashJs.officeDashJsStrings.Index
import typingsSlinky.officeDashJs.officeDashJsStrings.None
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentDifferenceFrom
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOf
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfColumnTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfGrandTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfParentColumnTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfParentRowTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfParentTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentOfRowTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.PercentRunningTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.RankAscending
import typingsSlinky.officeDashJs.officeDashJsStrings.RankDecending
import typingsSlinky.officeDashJs.officeDashJsStrings.RunningTotal
import typingsSlinky.officeDashJs.officeDashJsStrings.Unknown_
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

