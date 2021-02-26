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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataPivotHierarchy.toJSON()`. */
@js.native
trait DataPivotHierarchyData extends StObject {
  
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldData] = js.native
  
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.native
  
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
object DataPivotHierarchyData {
  
  @scala.inline
  def apply(): DataPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyData]
  }
  
  @scala.inline
  implicit class DataPivotHierarchyDataMutableBuilder[Self <: DataPivotHierarchyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: PivotFieldData): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowAs(value: ShowAsRule): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    @scala.inline
    def setSummarizeBy(
      value: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
    ): Self = StObject.set(x, "summarizeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummarizeByUndefined: Self = StObject.set(x, "summarizeBy", js.undefined)
  }
}
