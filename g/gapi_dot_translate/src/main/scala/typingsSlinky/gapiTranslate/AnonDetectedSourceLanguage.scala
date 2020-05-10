package typingsSlinky.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetectedSourceLanguage extends js.Object {
  var detectedSourceLanguage: String = js.native
  var translatedText: String = js.native
}

object AnonDetectedSourceLanguage {
  @scala.inline
  def apply(detectedSourceLanguage: String, translatedText: String): AnonDetectedSourceLanguage = {
    val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectedSourceLanguage]
  }
  @scala.inline
  implicit class AnonDetectedSourceLanguageOps[Self <: AnonDetectedSourceLanguage] (val x: Self) extends AnyVal {
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

