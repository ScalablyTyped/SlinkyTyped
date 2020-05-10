package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if no
    * source language was passed within the initial request. If the source
    * language was passed, auto-detection of the language will not occur and
    * this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String] = js.native
  /**
    * The `model` type used for this translation. Valid values are listed in
    * public documentation. Can be different from requested `model`. Present
    * only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Text translated into the target language.
    */
  var translatedText: js.UndefOr[String] = js.native
}

object SchemaTranslationsResource {
  @scala.inline
  def apply(): SchemaTranslationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsResource]
  }
  @scala.inline
  implicit class SchemaTranslationsResourceOps[Self <: SchemaTranslationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

