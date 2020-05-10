package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesisTask extends js.Object {
  /**
    * Timestamp for the time the synthesis task was started.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Engine] = js.native
  /**
    * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.native
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: js.UndefOr[typingsSlinky.awsSdk.pollyMod.OutputFormat] = js.native
  /**
    * Pathway for the output speech file.
    */
  var OutputUri: js.UndefOr[typingsSlinky.awsSdk.pollyMod.OutputUri] = js.native
  /**
    * Number of billable characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typingsSlinky.awsSdk.pollyMod.RequestCharacters] = js.native
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SampleRate] = js.native
  /**
    * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
    */
  var SnsTopicArn: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SnsTopicArn] = js.native
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.native
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TaskId] = js.native
  /**
    * Current status of the individual speech synthesis task.
    */
  var TaskStatus: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TaskStatus] = js.native
  /**
    * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
    */
  var TaskStatusReason: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TaskStatusReason] = js.native
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TextType] = js.native
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: js.UndefOr[typingsSlinky.awsSdk.pollyMod.VoiceId] = js.native
}

object SynthesisTask {
  @scala.inline
  def apply(): SynthesisTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesisTask]
  }
  @scala.inline
  implicit class SynthesisTaskOps[Self <: SynthesisTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEngine(value: Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
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
    def withLexiconNames(value: LexiconNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexiconNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUri(value: OutputUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharacters(value: RequestCharacters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: SampleRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: SnsTopicArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechMarkTypes(value: SpeechMarkTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpeechMarkTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechMarkTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpeechMarkTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskId(value: TaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStatus(value: TaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStatusReason(value: TaskStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTextType(value: TextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextType")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceId(value: VoiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(js.undefined)
        ret
    }
  }
  
}

