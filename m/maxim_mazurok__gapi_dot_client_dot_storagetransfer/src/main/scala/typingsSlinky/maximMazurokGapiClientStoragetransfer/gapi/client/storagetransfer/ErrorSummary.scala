package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorSummary extends StObject {
  
  /** Required. */
  var errorCode: js.UndefOr[String] = js.native
  
  /** Required. Count of this type of error. */
  var errorCount: js.UndefOr[String] = js.native
  
  /** Error samples. At most 5 error log entries will be recorded for a given error code for a single transfer operation. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.native
}
object ErrorSummary {
  
  @scala.inline
  def apply(): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSummary]
  }
  
  @scala.inline
  implicit class ErrorSummaryMutableBuilder[Self <: ErrorSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setErrorLogEntries(value: js.Array[ErrorLogEntry]): Self = StObject.set(x, "errorLogEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLogEntriesUndefined: Self = StObject.set(x, "errorLogEntries", js.undefined)
    
    @scala.inline
    def setErrorLogEntriesVarargs(value: ErrorLogEntry*): Self = StObject.set(x, "errorLogEntries", js.Array(value :_*))
  }
}
