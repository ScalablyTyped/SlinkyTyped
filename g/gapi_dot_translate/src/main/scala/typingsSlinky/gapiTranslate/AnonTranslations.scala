package typingsSlinky.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslations extends js.Object {
  var translations: js.Array[AnonDetectedSourceLanguage] = js.native
}

object AnonTranslations {
  @scala.inline
  def apply(translations: js.Array[AnonDetectedSourceLanguage]): AnonTranslations = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslations]
  }
  @scala.inline
  implicit class AnonTranslationsOps[Self <: AnonTranslations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: js.Array[AnonDetectedSourceLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

