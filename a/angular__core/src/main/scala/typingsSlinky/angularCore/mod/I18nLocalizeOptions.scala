package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nLocalizeOptions extends js.Object {
  var translations: StringDictionary[String] = js.native
}

object I18nLocalizeOptions {
  @scala.inline
  def apply(translations: StringDictionary[String]): I18nLocalizeOptions = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nLocalizeOptions]
  }
  @scala.inline
  implicit class I18nLocalizeOptionsOps[Self <: I18nLocalizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

