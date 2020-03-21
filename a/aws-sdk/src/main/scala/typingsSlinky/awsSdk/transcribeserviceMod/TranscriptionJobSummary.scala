package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscriptionJobSummary extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
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
  def apply(
    CompletionTime: js.Date = null,
    CreationTime: js.Date = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    OutputLocationType: OutputLocationType = null,
    StartTime: js.Date = null,
    TranscriptionJobName: TranscriptionJobName = null,
    TranscriptionJobStatus: TranscriptionJobStatus = null
  ): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (OutputLocationType != null) __obj.updateDynamic("OutputLocationType")(OutputLocationType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (TranscriptionJobName != null) __obj.updateDynamic("TranscriptionJobName")(TranscriptionJobName.asInstanceOf[js.Any])
    if (TranscriptionJobStatus != null) __obj.updateDynamic("TranscriptionJobStatus")(TranscriptionJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
}

