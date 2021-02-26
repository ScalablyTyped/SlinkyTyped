package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRowStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowStyle` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The list of zero-based row indices whose style should be updated. If no indices are specified, all rows will be updated. */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /** The styles to be set on the rows. */
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.native
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.native
}
object UpdateTableRowStyleRequest {
  
  @scala.inline
  def apply(): UpdateTableRowStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRowStyleRequestMutableBuilder[Self <: UpdateTableRowStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    @scala.inline
    def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value :_*))
    
    @scala.inline
    def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
