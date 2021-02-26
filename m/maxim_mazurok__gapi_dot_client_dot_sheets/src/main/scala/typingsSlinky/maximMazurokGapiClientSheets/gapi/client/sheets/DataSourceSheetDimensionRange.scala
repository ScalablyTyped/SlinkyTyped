package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSheetDimensionRange extends StObject {
  
  /** The columns on the data source sheet. */
  var columnReferences: js.UndefOr[js.Array[DataSourceColumnReference]] = js.native
  
  /** The ID of the data source sheet the range is on. */
  var sheetId: js.UndefOr[Double] = js.native
}
object DataSourceSheetDimensionRange {
  
  @scala.inline
  def apply(): DataSourceSheetDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSheetDimensionRange]
  }
  
  @scala.inline
  implicit class DataSourceSheetDimensionRangeMutableBuilder[Self <: DataSourceSheetDimensionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnReferences(value: js.Array[DataSourceColumnReference]): Self = StObject.set(x, "columnReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnReferencesUndefined: Self = StObject.set(x, "columnReferences", js.undefined)
    
    @scala.inline
    def setColumnReferencesVarargs(value: DataSourceColumnReference*): Self = StObject.set(x, "columnReferences", js.Array(value :_*))
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
