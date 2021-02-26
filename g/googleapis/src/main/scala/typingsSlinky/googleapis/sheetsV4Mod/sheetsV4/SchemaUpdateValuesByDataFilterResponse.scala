package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when updating a range of values by a data filter in a
  * spreadsheet.
  */
@js.native
trait SchemaUpdateValuesByDataFilterResponse extends StObject {
  
  /**
    * The data filter that selected the range that was updated.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
  
  /**
    * The number of cells updated.
    */
  var updatedCells: js.UndefOr[Double] = js.native
  
  /**
    * The number of columns where at least one cell in the column was updated.
    */
  var updatedColumns: js.UndefOr[Double] = js.native
  
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request&#39;s
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[SchemaValueRange] = js.native
  
  /**
    * The range (in A1 notation) that updates were applied to.
    */
  var updatedRange: js.UndefOr[String] = js.native
  
  /**
    * The number of rows where at least one cell in the row was updated.
    */
  var updatedRows: js.UndefOr[Double] = js.native
}
object SchemaUpdateValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): SchemaUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class SchemaUpdateValuesByDataFilterResponseMutableBuilder[Self <: SchemaUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilter(value: SchemaDataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    @scala.inline
    def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
    
    @scala.inline
    def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
    
    @scala.inline
    def setUpdatedData(value: SchemaValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
    
    @scala.inline
    def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
    
    @scala.inline
    def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
  }
}
