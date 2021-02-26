package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecuteSubsetParams extends StObject {
  
  var batchIndex: Double = js.native
  
  var ownerUri: String = js.native
  
  var resultSetIndex: Double = js.native
  
  var rowsCount: Double = js.native
  
  var rowsStartIndex: Double = js.native
}
object QueryExecuteSubsetParams {
  
  @scala.inline
  def apply(
    batchIndex: Double,
    ownerUri: String,
    resultSetIndex: Double,
    rowsCount: Double,
    rowsStartIndex: Double
  ): QueryExecuteSubsetParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], rowsStartIndex = rowsStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetParams]
  }
  
  @scala.inline
  implicit class QueryExecuteSubsetParamsMutableBuilder[Self <: QueryExecuteSubsetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchIndex(value: Double): Self = StObject.set(x, "batchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetIndex(value: Double): Self = StObject.set(x, "resultSetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsStartIndex(value: Double): Self = StObject.set(x, "rowsStartIndex", value.asInstanceOf[js.Any])
  }
}
