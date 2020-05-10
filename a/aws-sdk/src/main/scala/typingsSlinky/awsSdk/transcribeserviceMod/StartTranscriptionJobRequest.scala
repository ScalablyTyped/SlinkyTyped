package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTranscriptionJobRequest extends js.Object {
  /**
    * An object that contains the request parameters for content redaction.
    */
  var ContentRedaction: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  /**
    * Provides information about how a transcription job is executed. Use this field to indicate that the job can be queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately run the job.
    */
  var JobExecutionSettings: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.native
  /**
    * The language code for the language used in the input media file.
    */
  var LanguageCode: typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode = js.native
  /**
    * An object that describes the input media for a transcription job.
    */
  var Media: typingsSlinky.awsSdk.transcribeserviceMod.Media = js.native
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  /**
    * The sample rate, in Hertz, of the audio track in the input media file.  If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the MediaSampleRateHertz field blank and let Amazon Transcribe determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  /**
    * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcript in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri. If you enable content redaction and choose to output an unredacted transcript, that transcript's location still appears in the TranscriptFileUri. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
    */
  var OutputBucketName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.OutputBucketName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartTranscriptionJob operation must have permission to use the specified KMS key. You can use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon S3 key (SSE-S3).  If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.native
  /**
    * A Settings object that provides optional settings for a transcription job.
    */
  var Settings: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Settings] = js.native
  /**
    * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account.
    */
  var TranscriptionJobName: typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}

object StartTranscriptionJobRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, Media: Media, TranscriptionJobName: TranscriptionJobName): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTranscriptionJobRequest]
  }
  @scala.inline
  implicit class StartTranscriptionJobRequestOps[Self <: StartTranscriptionJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscriptionJobName(value: TranscriptionJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobName")(value.asInstanceOf[js.Any])
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
    def withJobExecutionSettings(value: JobExecutionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobExecutionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobExecutionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobExecutionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaFormat(value: MediaFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaSampleRateHertz(value: MediaSampleRateHertz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaSampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaSampleRateHertz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaSampleRateHertz")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBucketName(value: OutputBucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputBucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputBucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputEncryptionKMSKeyId(value: KMSKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputEncryptionKMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputEncryptionKMSKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputEncryptionKMSKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
  }
  
}

