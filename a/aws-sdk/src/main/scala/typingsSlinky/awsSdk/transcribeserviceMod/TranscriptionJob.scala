package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscriptionJob extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.native
  /**
    * An object that describes content redaction settings for the transcription job.
    */
  var ContentRedaction: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field can contain one of the following values:    Unsupported media format - The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format - The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure that the two values match.    Invalid sample rate for audio file - The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate - The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large - The size of your audio file is larger than Amazon Transcribe can process. For more information, see Limits in the Amazon Transcribe Developer Guide.    Invalid number of channels: number of channels too large - Your audio contains more channels than Amazon Transcribe is configured to process. To request additional channels, see Amazon Transcribe Limits in the Amazon Web Services General Reference.  
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * Provides information about how a transcription job is executed.
    */
  var JobExecutionSettings: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.native
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * An object that describes the input media for the transcription job.
    */
  var Media: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Media] = js.native
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. 
    */
  var MediaSampleRateHertz: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  /**
    * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing the transcription job.
    */
  var Settings: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Settings] = js.native
  /**
    * A timestamp that shows with the job was started processing.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * An object that describes the output of the transcription job.
    */
  var Transcript: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Transcript] = js.native
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.native
  /**
    * The status of the transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
}

object TranscriptionJob {
  @scala.inline
  def apply(): TranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJob]
  }
  @scala.inline
  implicit class TranscriptionJobOps[Self <: TranscriptionJob] (val x: Self) extends AnyVal {
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
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Media")(js.undefined)
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
    def withTranscript(value: Transcript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transcript")(js.undefined)
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

