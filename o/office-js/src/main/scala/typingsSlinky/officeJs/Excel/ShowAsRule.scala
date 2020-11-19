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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ShowAsRule extends js.Object {
  
  /**
    *
    * The base PivotField to base the ShowAs calculation, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.native
  
  /**
    *
    * The base Item to base the ShowAs calculation on, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.native
  
  /**
    *
    * The ShowAs Calculation to use for the Data PivotField. See Excel.ShowAsCalculation for Details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index = js.native
}
object ShowAsRule {
  
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
  
  @scala.inline
  implicit class ShowAsRuleOps[Self <: ShowAsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculation(
      value: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
    ): Self = this.set("calculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseField(value: PivotField): Self = this.set("baseField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseField: Self = this.set("baseField", js.undefined)
    
    @scala.inline
    def setBaseItem(value: PivotItem): Self = this.set("baseItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseItem: Self = this.set("baseItem", js.undefined)
  }
}
