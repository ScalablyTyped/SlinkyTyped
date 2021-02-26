package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscriptionJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The content redaction settings of the transcription job.
    */
  var ContentRedaction: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A higher score indicates that Amazon Transcribe is more confident in the language it identified.
    */
  var IdentifiedLanguageScore: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.IdentifiedLanguageScore] = js.native
  
  /**
    * Whether automatic language identification was enabled for a transcription job.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.native
  
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  var ModelSettings: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.ModelSettings] = js.native
  
  /**
    * Indicates the location of the output of the transcription job. If the value is CUSTOMER_BUCKET then the location is the S3 bucket specified in the outputBucketName field when the transcription job was started with the StartTranscriptionJob operation. If the value is SERVICE_BUCKET then the output is stored by Amazon Transcribe and can be retrieved using the URI in the GetTranscriptionJob response's TranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.OutputLocationType] = js.native
  
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.native
  
  /**
    * The status of the transcription job. When the status is COMPLETED, use the GetTranscriptionJob operation to get the results of the transcription.
    */
  var TranscriptionJobStatus: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
}
object TranscriptionJobSummary {
  
  @scala.inline
  def apply(): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
  
  @scala.inline
  implicit class TranscriptionJobSummaryMutableBuilder[Self <: TranscriptionJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setIdentifiedLanguageScore(value: IdentifiedLanguageScore): Self = StObject.set(x, "IdentifiedLanguageScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiedLanguageScoreUndefined: Self = StObject.set(x, "IdentifiedLanguageScore", js.undefined)
    
    @scala.inline
    def setIdentifyLanguage(value: Boolean): Self = StObject.set(x, "IdentifyLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifyLanguageUndefined: Self = StObject.set(x, "IdentifyLanguage", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobNameUndefined: Self = StObject.set(x, "TranscriptionJobName", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
  }
}
