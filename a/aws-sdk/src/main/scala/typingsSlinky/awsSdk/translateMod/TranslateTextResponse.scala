package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateTextResponse extends js.Object {
  /**
    * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text response.
    */
  var AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.native
  /**
    * The language code for the language of the source text.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  /**
    * The language code for the language of the target text. 
    */
  var TargetLanguageCode: LanguageCodeString = js.native
  /**
    * The translated text.
    */
  var TranslatedText: String = js.native
}

object TranslateTextResponse {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    TranslatedText: String
  ): TranslateTextResponse = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], TranslatedText = TranslatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextResponse]
  }
  @scala.inline
  implicit class TranslateTextResponseOps[Self <: TranslateTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceLanguageCode(value: LanguageCodeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLanguageCode(value: LanguageCodeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslatedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslatedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppliedTerminologies(value: AppliedTerminologyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppliedTerminologies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedTerminologies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppliedTerminologies")(js.undefined)
        ret
    }
  }
  
}

