package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.DifferenceFrom
import typingsSlinky.officeJs.officeJsStrings.Index
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.PercentDifferenceFrom
import typingsSlinky.officeJs.officeJsStrings.PercentOf
import typingsSlinky.officeJs.officeJsStrings.PercentOfColumnTotal
import typingsSlinky.officeJs.officeJsStrings.PercentOfGrandTotal
import typingsSlinky.officeJs.officeJsStrings.PercentOfParentColumnTotal
import typingsSlinky.officeJs.officeJsStrings.PercentOfParentRowTotal
import typingsSlinky.officeJs.officeJsStrings.PercentOfParentTotal
import typingsSlinky.officeJs.officeJsStrings.PercentOfRowTotal
import typingsSlinky.officeJs.officeJsStrings.PercentRunningTotal
import typingsSlinky.officeJs.officeJsStrings.RankAscending
import typingsSlinky.officeJs.officeJsStrings.RankDecending
import typingsSlinky.officeJs.officeJsStrings.RunningTotal
import typingsSlinky.officeJs.officeJsStrings.Unknown_
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

