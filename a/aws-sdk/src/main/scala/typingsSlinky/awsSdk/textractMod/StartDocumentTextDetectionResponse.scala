package typingsSlinky.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDocumentTextDetectionResponse extends StObject {
  
  /**
    * The identifier of the text detection job for the document. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.textractMod.JobId] = js.native
}
object StartDocumentTextDetectionResponse {
  
  @scala.inline
  def apply(): StartDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDocumentTextDetectionResponse]
  }
  
  @scala.inline
  implicit class StartDocumentTextDetectionResponseMutableBuilder[Self <: StartDocumentTextDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
