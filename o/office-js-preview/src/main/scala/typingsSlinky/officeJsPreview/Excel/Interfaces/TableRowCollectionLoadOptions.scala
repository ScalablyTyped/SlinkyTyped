package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the rows that are part of the table.
  
  Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
  a TableRow object represent the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableRowCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the index number of the row within the rows collection of the table. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.native
}
object TableRowCollectionLoadOptions {
  
  @scala.inline
  def apply(): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class TableRowCollectionLoadOptionsMutableBuilder[Self <: TableRowCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
