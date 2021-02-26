package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTranscriptionJobResponse extends StObject {
  
  /**
    * An object that contains the results of the transcription job.
    */
  var TranscriptionJob: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}
object GetTranscriptionJobResponse {
  
  @scala.inline
  def apply(): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class GetTranscriptionJobResponseMutableBuilder[Self <: GetTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranscriptionJob(value: TranscriptionJob): Self = StObject.set(x, "TranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobUndefined: Self = StObject.set(x, "TranscriptionJob", js.undefined)
  }
}
