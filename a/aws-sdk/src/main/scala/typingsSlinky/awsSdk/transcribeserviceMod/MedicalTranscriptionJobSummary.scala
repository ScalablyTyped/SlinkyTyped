package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedicalTranscriptionJobSummary extends js.Object {
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
  def apply(
    CompletionTime: js.Date = null,
    CreationTime: js.Date = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    MedicalTranscriptionJobName: TranscriptionJobName = null,
    OutputLocationType: OutputLocationType = null,
    Specialty: Specialty = null,
    StartTime: js.Date = null,
    TranscriptionJobStatus: TranscriptionJobStatus = null,
    Type: Type = null
  ): MedicalTranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (MedicalTranscriptionJobName != null) __obj.updateDynamic("MedicalTranscriptionJobName")(MedicalTranscriptionJobName.asInstanceOf[js.Any])
    if (OutputLocationType != null) __obj.updateDynamic("OutputLocationType")(OutputLocationType.asInstanceOf[js.Any])
    if (Specialty != null) __obj.updateDynamic("Specialty")(Specialty.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (TranscriptionJobStatus != null) __obj.updateDynamic("TranscriptionJobStatus")(TranscriptionJobStatus.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicalTranscriptionJobSummary]
  }
}

