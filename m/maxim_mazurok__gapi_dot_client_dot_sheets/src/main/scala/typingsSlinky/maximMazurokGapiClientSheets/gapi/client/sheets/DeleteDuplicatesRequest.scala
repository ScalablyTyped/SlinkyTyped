package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDuplicatesRequest extends StObject {
  
  /** The columns in the range to analyze for duplicate values. If no columns are selected then all columns are analyzed for duplicates. */
  var comparisonColumns: js.UndefOr[js.Array[DimensionRange]] = js.native
  
  /** The range to remove duplicates rows from. */
  var range: js.UndefOr[GridRange] = js.native
}
object DeleteDuplicatesRequest {
  
  @scala.inline
  def apply(): DeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesRequest]
  }
  
  @scala.inline
  implicit class DeleteDuplicatesRequestMutableBuilder[Self <: DeleteDuplicatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonColumns(value: js.Array[DimensionRange]): Self = StObject.set(x, "comparisonColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonColumnsUndefined: Self = StObject.set(x, "comparisonColumns", js.undefined)
    
    @scala.inline
    def setComparisonColumnsVarargs(value: DimensionRange*): Self = StObject.set(x, "comparisonColumns", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
