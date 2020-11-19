package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.AggregationFunction
import typingsSlinky.officeJs.Excel.ShowAsRule
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.Average
import typingsSlinky.officeJs.officeJsStrings.Count
import typingsSlinky.officeJs.officeJsStrings.CountNumbers
import typingsSlinky.officeJs.officeJsStrings.Max
import typingsSlinky.officeJs.officeJsStrings.Min
import typingsSlinky.officeJs.officeJsStrings.Product
import typingsSlinky.officeJs.officeJsStrings.StandardDeviation
import typingsSlinky.officeJs.officeJsStrings.StandardDeviationP
import typingsSlinky.officeJs.officeJsStrings.Sum
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import typingsSlinky.officeJs.officeJsStrings.Variance
import typingsSlinky.officeJs.officeJsStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataPivotHierarchy object, for use in `dataPivotHierarchy.set({ ... })`. */
@js.native
trait DataPivotHierarchyUpdateData extends js.Object {
  
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldUpdateData] = js.native
  
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.native
  
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.native
}
object DataPivotHierarchyUpdateData {
  
  @scala.inline
  def apply(): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
  
  @scala.inline
  implicit class DataPivotHierarchyUpdateDataOps[Self <: DataPivotHierarchyUpdateData] (val x: Self) extends AnyVal {
    
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
    def setField(value: PivotFieldUpdateData): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowAs(value: ShowAsRule): Self = this.set("showAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAs: Self = this.set("showAs", js.undefined)
    
    @scala.inline
    def setSummarizeBy(
      value: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
    ): Self = this.set("summarizeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummarizeBy: Self = this.set("summarizeBy", js.undefined)
  }
}
