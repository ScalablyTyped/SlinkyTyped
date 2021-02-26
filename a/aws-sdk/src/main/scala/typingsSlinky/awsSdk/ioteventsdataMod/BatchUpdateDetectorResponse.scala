package typingsSlinky.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDetectorResponse extends StObject {
  
  /**
    * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did not occur.)
    */
  var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.native
}
object BatchUpdateDetectorResponse {
  
  @scala.inline
  def apply(): BatchUpdateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDetectorResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateDetectorResponseMutableBuilder[Self <: BatchUpdateDetectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchUpdateDetectorErrorEntries(value: BatchUpdateDetectorErrorEntries): Self = StObject.set(x, "batchUpdateDetectorErrorEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUpdateDetectorErrorEntriesUndefined: Self = StObject.set(x, "batchUpdateDetectorErrorEntries", js.undefined)
    
    @scala.inline
    def setBatchUpdateDetectorErrorEntriesVarargs(value: BatchUpdateDetectorErrorEntry*): Self = StObject.set(x, "batchUpdateDetectorErrorEntries", js.Array(value :_*))
  }
}
