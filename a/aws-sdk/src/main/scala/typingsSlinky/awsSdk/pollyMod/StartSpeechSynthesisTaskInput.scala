package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpeechSynthesisTaskInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Engine] = js.native
  /**
    * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.native
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: typingsSlinky.awsSdk.pollyMod.OutputFormat = js.native
  /**
    * Amazon S3 bucket name to which the output file will be saved.
    */
  var OutputS3BucketName: typingsSlinky.awsSdk.pollyMod.OutputS3BucketName = js.native
  /**
    * The Amazon S3 key prefix for the output speech file.
    */
  var OutputS3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.pollyMod.OutputS3KeyPrefix] = js.native
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
    * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
    */
  var Text: typingsSlinky.awsSdk.pollyMod.Text = js.native
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TextType] = js.native
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: typingsSlinky.awsSdk.pollyMod.VoiceId = js.native
}

object StartSpeechSynthesisTaskInput {
  @scala.inline
  def apply(OutputFormat: OutputFormat, OutputS3BucketName: OutputS3BucketName, Text: Text, VoiceId: VoiceId): StartSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(OutputFormat = OutputFormat.asInstanceOf[js.Any], OutputS3BucketName = OutputS3BucketName.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VoiceId = VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeechSynthesisTaskInput]
  }
  @scala.inline
  implicit class StartSpeechSynthesisTaskInputOps[Self <: StartSpeechSynthesisTaskInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputS3BucketName(value: OutputS3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceId(value: VoiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(value.asInstanceOf[js.Any])
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
    def withOutputS3KeyPrefix(value: OutputS3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(js.undefined)
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
  }
  
}

