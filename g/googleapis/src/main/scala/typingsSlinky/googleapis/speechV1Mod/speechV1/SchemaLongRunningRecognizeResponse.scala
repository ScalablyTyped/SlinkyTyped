package typingsSlinky.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The only message returned to the client by the `LongRunningRecognize`
  * method. It contains the result as zero or more sequential
  * `SpeechRecognitionResult` messages. It is included in the `result.response`
  * field of the `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaLongRunningRecognizeResponse extends StObject {
  
  /**
    * Output only. Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.native
}
object SchemaLongRunningRecognizeResponse {
  
  @scala.inline
  def apply(): SchemaLongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeResponse]
  }
  
  @scala.inline
  implicit class SchemaLongRunningRecognizeResponseMutableBuilder[Self <: SchemaLongRunningRecognizeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
