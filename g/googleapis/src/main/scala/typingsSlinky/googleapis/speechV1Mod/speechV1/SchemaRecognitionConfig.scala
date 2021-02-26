package typingsSlinky.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information to the recognizer that specifies how to process the
  * request.
  */
@js.native
trait SchemaRecognitionConfig extends StObject {
  
  /**
    * *Optional* The number of channels in the input audio data. ONLY set this
    * for MULTI-CHANNEL recognition. Valid values for LINEAR16 and FLAC are
    * `1`-`8`. Valid values for OGG_OPUS are &#39;1&#39;-&#39;254&#39;. Valid
    * value for MULAW, AMR, AMR_WB and SPEEX_WITH_HEADER_BYTE is only `1`. If
    * `0` or omitted, defaults to one channel (mono). Note: We only recognize
    * the first channel by default. To perform independent recognition on each
    * channel set `enable_separate_recognition_per_channel` to &#39;true&#39;.
    */
  var audioChannelCount: js.UndefOr[Double] = js.native
  
  /**
    * *Optional* If &#39;true&#39;, adds punctuation to recognition result
    * hypotheses. This feature is only available in select languages. Setting
    * this for requests in other languages has no effect at all. The default
    * &#39;false&#39; value does not add punctuation to result hypotheses.
    * Note: This is currently offered as an experimental service, complimentary
    * to all users. In the future this may be exclusively available as a
    * premium feature.
    */
  var enableAutomaticPunctuation: js.UndefOr[Boolean] = js.native
  
  /**
    * This needs to be set to `true` explicitly and `audio_channel_count` &gt;
    * 1 to get each channel recognized separately. The recognition result will
    * contain a `channel_tag` field to state which channel that result belongs
    * to. If this is not true, we will only recognize the first channel. The
    * request is billed cumulatively for all channels recognized:
    * `audio_channel_count` multiplied by the length of the audio.
    */
  var enableSeparateRecognitionPerChannel: js.UndefOr[Boolean] = js.native
  
  /**
    * *Optional* If `true`, the top result includes a list of words and the
    * start and end time offsets (timestamps) for those words. If `false`, no
    * word-level time offset information is returned. The default is `false`.
    */
  var enableWordTimeOffsets: js.UndefOr[Boolean] = js.native
  
  /**
    * Encoding of audio data sent in all `RecognitionAudio` messages. This
    * field is optional for `FLAC` and `WAV` audio files and required for all
    * other audio formats. For details, see AudioEncoding.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * *Required* The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: &quot;en-US&quot;. See [Language
    * Support](/speech-to-text/docs/languages) for a list of the currently
    * supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * *Optional* Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative`
    * messages within each `SpeechRecognitionResult`. The server may return
    * fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0`
    * or `1` will return a maximum of one. If omitted, will return a maximum of
    * one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.native
  
  /**
    * *Optional* Metadata regarding this request.
    */
  var metadata: js.UndefOr[SchemaRecognitionMetadata] = js.native
  
  /**
    * *Optional* Which model to select for the given request. Select the model
    * best suited to your domain to get best results. If a model is not
    * explicitly specified, then we auto-select a model based on the parameters
    * in the RecognitionConfig. &lt;table&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
    * &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;   &lt;/tr&gt;
    * &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
    * &lt;td&gt;Best for short queries such as voice commands or voice
    * search.&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Best
    * for audio that originated from a phone call (typically     recorded at an
    * 8khz sampling rate).&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;     &lt;td&gt;Best
    * for audio that originated from from video or includes multiple speakers.
    * Ideally the audio is recorded at a 16khz or greater         sampling
    * rate. This is a premium model that costs more than the         standard
    * rate.&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;     &lt;td&gt;Best
    * for audio that is not one of the specific audio models.         For
    * example, long-form audio. Ideally the audio is high-fidelity, recorded at
    * a 16khz or greater sampling rate.&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt;
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * *Optional* If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered
    * word with asterisks, e.g. &quot;f***&quot;. If set to `false` or omitted,
    * profanities won&#39;t be filtered out.
    */
  var profanityFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Sample rate in Hertz of the audio data sent in all `RecognitionAudio`
    * messages. Valid values are: 8000-48000. 16000 is optimal. For best
    * results, set the sampling rate of the audio source to 16000 Hz. If
    * that&#39;s not possible, use the native sample rate of the audio source
    * (instead of re-sampling). This field is optional for FLAC and WAV audio
    * files, but is required for all other audio formats. For details, see
    * AudioEncoding.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  
  /**
    * *Optional* array of SpeechContext. A means to provide context to assist
    * the speech recognition. For more information, see [Phrase
    * Hints](/speech-to-text/docs/basics#phrase-hints).
    */
  var speechContexts: js.UndefOr[js.Array[SchemaSpeechContext]] = js.native
  
  /**
    * *Optional* Set to true to use an enhanced model for speech recognition.
    * If `use_enhanced` is set to true and the `model` field is not set, then
    * an appropriate enhanced model is chosen if: 1. project is eligible for
    * requesting enhanced models 2. an enhanced model exists for the audio  If
    * `use_enhanced` is true and an enhanced version of the specified model
    * does not exist, then the speech is recognized using the standard version
    * of the specified model.  Enhanced speech models require that you opt-in
    * to data logging using instructions in the
    * [documentation](/speech-to-text/docs/enable-data-logging). If you set
    * `use_enhanced` to true and you have not enabled audio logging, then you
    * will receive an error.
    */
  var useEnhanced: js.UndefOr[Boolean] = js.native
}
object SchemaRecognitionConfig {
  
  @scala.inline
  def apply(): SchemaRecognitionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionConfig]
  }
  
  @scala.inline
  implicit class SchemaRecognitionConfigMutableBuilder[Self <: SchemaRecognitionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioChannelCount(value: Double): Self = StObject.set(x, "audioChannelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioChannelCountUndefined: Self = StObject.set(x, "audioChannelCount", js.undefined)
    
    @scala.inline
    def setEnableAutomaticPunctuation(value: Boolean): Self = StObject.set(x, "enableAutomaticPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutomaticPunctuationUndefined: Self = StObject.set(x, "enableAutomaticPunctuation", js.undefined)
    
    @scala.inline
    def setEnableSeparateRecognitionPerChannel(value: Boolean): Self = StObject.set(x, "enableSeparateRecognitionPerChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSeparateRecognitionPerChannelUndefined: Self = StObject.set(x, "enableSeparateRecognitionPerChannel", js.undefined)
    
    @scala.inline
    def setEnableWordTimeOffsets(value: Boolean): Self = StObject.set(x, "enableWordTimeOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWordTimeOffsetsUndefined: Self = StObject.set(x, "enableWordTimeOffsets", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMaxAlternatives(value: Double): Self = StObject.set(x, "maxAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAlternativesUndefined: Self = StObject.set(x, "maxAlternatives", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaRecognitionMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setProfanityFilter(value: Boolean): Self = StObject.set(x, "profanityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfanityFilterUndefined: Self = StObject.set(x, "profanityFilter", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSpeechContexts(value: js.Array[SchemaSpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    @scala.inline
    def setSpeechContextsVarargs(value: SchemaSpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value :_*))
    
    @scala.inline
    def setUseEnhanced(value: Boolean): Self = StObject.set(x, "useEnhanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEnhancedUndefined: Self = StObject.set(x, "useEnhanced", js.undefined)
  }
}
