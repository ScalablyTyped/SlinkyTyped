package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MedicalTranscriptionJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A timestamp that shows when the medical transcription job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * The language of the transcript in the source audio file.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * The name of a medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.native
  
  /**
    * Indicates the location of the transcription job's output. The CUSTOMER_BUCKET is the S3 location provided in the OutputBucketName field when the 
    */
  var OutputLocationType: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.OutputLocationType] = js.native
  
  /**
    * The medical specialty of the transcription job. Primary care is the only valid value.
    */
  var Specialty: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Specialty] = js.native
  
  /**
    * A timestamp that shows when the job began processing.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
  
  /**
    * The speech of the clinician in the input audio.
    */
  var Type: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Type] = js.native
}
object MedicalTranscriptionJobSummary {
  
  @scala.inline
  def apply(): MedicalTranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJobSummary]
  }
  
  @scala.inline
  implicit class MedicalTranscriptionJobSummaryMutableBuilder[Self <: MedicalTranscriptionJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobNameUndefined: Self = StObject.set(x, "MedicalTranscriptionJobName", js.undefined)
    
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialtyUndefined: Self = StObject.set(x, "Specialty", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
