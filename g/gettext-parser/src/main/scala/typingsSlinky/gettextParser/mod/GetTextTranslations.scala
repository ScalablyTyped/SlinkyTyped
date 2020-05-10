package typingsSlinky.gettextParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextTranslations extends js.Object {
  var charset: String = js.native
  var headers: StringDictionary[String] = js.native
  var translations: StringDictionary[StringDictionary[GetTextTranslation]] = js.native
}

object GetTextTranslations {
  @scala.inline
  def apply(
    charset: String,
    headers: StringDictionary[String],
    translations: StringDictionary[StringDictionary[GetTextTranslation]]
  ): GetTextTranslations = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextTranslations]
  }
  @scala.inline
  implicit class GetTextTranslationsOps[Self <: GetTextTranslations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: StringDictionary[StringDictionary[GetTextTranslation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

