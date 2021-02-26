package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data in the grid, as well as metadata about the dimensions.
  */
@js.native
trait SchemaGridData extends StObject {
  
  /**
    * Metadata about the requested columns in the grid, starting with the
    * column in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.native
  
  /**
    * The data in the grid, one entry per row, starting with the row in
    * startRow. The values in RowData will correspond to columns starting at
    * start_column.
    */
  var rowData: js.UndefOr[js.Array[SchemaRowData]] = js.native
  
  /**
    * Metadata about the requested rows in the grid, starting with the row in
    * start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.native
  
  /**
    * The first column this GridData refers to, zero-based.
    */
  var startColumn: js.UndefOr[Double] = js.native
  
  /**
    * The first row this GridData refers to, zero-based.
    */
  var startRow: js.UndefOr[Double] = js.native
}
object SchemaGridData {
  
  @scala.inline
  def apply(): SchemaGridData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridData]
  }
  
  @scala.inline
  implicit class SchemaGridDataMutableBuilder[Self <: SchemaGridData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnMetadata(value: js.Array[SchemaDimensionProperties]): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    @scala.inline
    def setColumnMetadataVarargs(value: SchemaDimensionProperties*): Self = StObject.set(x, "columnMetadata", js.Array(value :_*))
    
    @scala.inline
    def setRowData(value: js.Array[SchemaRowData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    @scala.inline
    def setRowDataVarargs(value: SchemaRowData*): Self = StObject.set(x, "rowData", js.Array(value :_*))
    
    @scala.inline
    def setRowMetadata(value: js.Array[SchemaDimensionProperties]): Self = StObject.set(x, "rowMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMetadataUndefined: Self = StObject.set(x, "rowMetadata", js.undefined)
    
    @scala.inline
    def setRowMetadataVarargs(value: SchemaDimensionProperties*): Self = StObject.set(x, "rowMetadata", js.Array(value :_*))
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
