package typingsSlinky.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationsListResponse extends js.Object {
  /** Translations contains list of translation results of given text */
  var translations: js.UndefOr[js.Array[TranslationsResource]] = js.native
}

object TranslationsListResponse {
  @scala.inline
  def apply(): TranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationsListResponse]
  }
  @scala.inline
  implicit class TranslationsListResponseOps[Self <: TranslationsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: js.Array[TranslationsResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

