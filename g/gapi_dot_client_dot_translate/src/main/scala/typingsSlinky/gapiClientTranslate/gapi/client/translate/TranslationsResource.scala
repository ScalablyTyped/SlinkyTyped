package typingsSlinky.gapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTranslate.anon.Alt
import typingsSlinky.gapiClientTranslate.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if
    * no source language was passed within the initial request. If the
    * source language was passed, auto-detection of the language will not
    * occur and this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String] = js.native
  /**
    * The `model` type used for this translation. Valid values are
    * listed in public documentation. Can be different from requested `model`.
    * Present only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.native
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[String] = js.native
  /** Translates input text, returning translated text. */
  def list(request: Alt): Request[TranslationsListResponse] = js.native
  /** Translates input text, returning translated text. */
  def translate(request: Bearertoken): Request[TranslationsListResponse] = js.native
}

object TranslationsResource {
  @scala.inline
  def apply(
    list: Alt => Request[TranslationsListResponse],
    translate: Bearertoken => Request[TranslationsListResponse]
  ): TranslationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[TranslationsResource]
  }
  @scala.inline
  implicit class TranslationsResourceOps[Self <: TranslationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Alt => Request[TranslationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate(value: Bearertoken => Request[TranslationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetectedSourceLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedSourceLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedSourceLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedSourceLanguage")(js.undefined)
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
    def withTranslatedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslatedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatedText")(js.undefined)
        ret
    }
  }
  
}

