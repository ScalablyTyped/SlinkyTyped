package typingsSlinky.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for SPEECH_TRANSCRIPTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfig extends js.Object {
  /**
    * *Optional* For file formats, such as MXF or MKV, supporting multiple
    * audio tracks, specify up to two tracks. Default: track 0.
    */
  var audioTracks: js.UndefOr[js.Array[Double]] = js.native
  /**
    * *Optional* If set, specifies the estimated number of speakers in the
    * conversation. If not set, defaults to &#39;2&#39;. Ignored unless
    * enable_speaker_diarization is set to true.
    */
  var diarizationSpeakerCount: js.UndefOr[Double] = js.native
  /**
    * *Optional* If &#39;true&#39;, adds punctuation to recognition result
    * hypotheses. This feature is only available in select languages. Setting
    * this for requests in other languages has no effect at all. The default
    * &#39;false&#39; value does not add punctuation to result hypotheses.
    * NOTE: &quot;This is currently offered as an experimental service,
    * complimentary to all users. In the future this may be exclusively
    * available as a premium feature.&quot;
    */
  var enableAutomaticPunctuation: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo. Note: When this is true, we send
    * all the words from the beginning of the audio for the top alternative in
    * every consecutive responses. This is done in order to improve our speaker
    * tags as our models learn to identify the speakers in the conversation
    * over time.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* If `true`, the top result includes a list of words and the
    * confidence for those words. If `false`, no word-level confidence
    * information is returned. The default is `false`.
    */
  var enableWordConfidence: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered
    * word with asterisks, e.g. &quot;f***&quot;. If set to `false` or omitted,
    * profanities won&#39;t be filtered out.
    */
  var filterProfanity: js.UndefOr[Boolean] = js.native
  /**
    * *Required* The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: &quot;en-US&quot;. See [Language
    * Support](https://cloud.google.com/speech/docs/languages) for a list of
    * the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * *Optional* Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative`
    * messages within each `SpeechTranscription`. The server may return fewer
    * than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1`
    * will return a maximum of one. If omitted, will return a maximum of one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.native
  /**
    * *Optional* A means to provide context to assist the speech recognition.
    */
  var speechContexts: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechContext]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfigOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTracks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withDiarizationSpeakerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diarizationSpeakerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiarizationSpeakerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diarizationSpeakerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutomaticPunctuation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutomaticPunctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutomaticPunctuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutomaticPunctuation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSpeakerDiarization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpeakerDiarization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSpeakerDiarization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpeakerDiarization")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWordConfidence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWordConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterProfanity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProfanity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterProfanity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProfanity")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAlternatives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechContexts(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechContexts")(js.undefined)
        ret
    }
  }
  
}

