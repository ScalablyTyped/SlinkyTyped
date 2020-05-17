package typingsSlinky.gapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTranslate.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. 'en', 'ja'). In certain cases, BCP-47 codes including
    * language + region identifiers are returned (e.g. 'zh-TW' and 'zh-CH')
    */
  var language: js.UndefOr[String] = js.native
  /** Human readable name of the language localized to the target language. */
  var name: js.UndefOr[String] = js.native
  /** Returns a list of supported languages for translation. */
  def list(request: Accesstoken): Request[LanguagesListResponse] = js.native
}

object LanguagesResource {
  @scala.inline
  def apply(list: Accesstoken => Request[LanguagesListResponse]): LanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LanguagesResource]
  }
  @scala.inline
  implicit class LanguagesResourceOps[Self <: LanguagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Accesstoken => Request[LanguagesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

