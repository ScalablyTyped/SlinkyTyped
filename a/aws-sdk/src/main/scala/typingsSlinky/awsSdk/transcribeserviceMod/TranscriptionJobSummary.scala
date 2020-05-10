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
  def apply(): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
  @scala.inline
  implicit class TranscriptionJobSummaryOps[Self <: TranscriptionJobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRedaction(value: ContentRedaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRedaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentRedaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRedaction")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocationType(value: OutputLocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocationType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptionJobName(value: TranscriptionJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptionJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobName")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptionJobStatus(value: TranscriptionJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptionJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobStatus")(js.undefined)
        ret
    }
  }
  
}

