package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLabelDetectionResponse extends StObject {
  
  /**
    * The identifier for the label detection job. Use JobId to identify the job in a subsequent call to GetLabelDetection. 
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobId] = js.native
}
object StartLabelDetectionResponse {
  
  @scala.inline
  def apply(): StartLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLabelDetectionResponse]
  }
  
  @scala.inline
  implicit class StartLabelDetectionResponseMutableBuilder[Self <: StartLabelDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
