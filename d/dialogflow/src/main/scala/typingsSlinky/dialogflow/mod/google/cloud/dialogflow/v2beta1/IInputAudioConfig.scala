package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InputAudioConfig. */
@js.native
trait IInputAudioConfig extends js.Object {
  /** InputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[AudioEncoding | Null] = js.native
  /** InputAudioConfig enableWordInfo */
  var enableWordInfo: js.UndefOr[Boolean | Null] = js.native
  /** InputAudioConfig languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** InputAudioConfig model */
  var model: js.UndefOr[String | Null] = js.native
  /** InputAudioConfig modelVariant */
  var modelVariant: js.UndefOr[SpeechModelVariant | Null] = js.native
  /** InputAudioConfig phraseHints */
  var phraseHints: js.UndefOr[js.Array[String] | Null] = js.native
  /** InputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.native
  /** InputAudioConfig singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.native
  /** InputAudioConfig speechContexts */
  var speechContexts: js.UndefOr[js.Array[ISpeechContext] | Null] = js.native
}

object IInputAudioConfig {
  @scala.inline
  def apply(): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputAudioConfig]
  }
  @scala.inline
  implicit class IInputAudioConfigOps[Self <: IInputAudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEncoding(value: AudioEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(null)
        ret
    }
    @scala.inline
    def withEnableWordInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWordInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWordInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordInfo")(null)
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
    def withLanguageCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(null)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withModelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(null)
        ret
    }
    @scala.inline
    def withModelVariant(value: SpeechModelVariant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVariantNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariant")(null)
        ret
    }
    @scala.inline
    def withPhraseHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phraseHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhraseHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phraseHints")(js.undefined)
        ret
    }
    @scala.inline
    def withPhraseHintsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phraseHints")(null)
        ret
    }
    @scala.inline
    def withSampleRateHertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRateHertz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRateHertzNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(null)
        ret
    }
    @scala.inline
    def withSingleUtterance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleUtterance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleUtteranceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(null)
        ret
    }
    @scala.inline
    def withSpeechContexts(value: js.Array[ISpeechContext]): Self = {
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
    @scala.inline
    def withSpeechContextsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechContexts")(null)
        ret
    }
  }
  
}

