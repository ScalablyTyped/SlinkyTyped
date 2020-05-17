package typingsSlinky.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedSourceLanguage extends js.Object {
  var detectedSourceLanguage: String = js.native
  var translatedText: String = js.native
}

object DetectedSourceLanguage {
  @scala.inline
  def apply(detectedSourceLanguage: String, translatedText: String): DetectedSourceLanguage = {
    val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedSourceLanguage]
  }
  @scala.inline
  implicit class DetectedSourceLanguageOps[Self <: DetectedSourceLanguage] (val x: Self) extends AnyVal {
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
    def withTranslatedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatedText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

