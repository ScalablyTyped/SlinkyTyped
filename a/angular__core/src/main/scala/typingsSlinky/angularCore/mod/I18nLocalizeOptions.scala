package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLocalizeOptions extends js.Object {
  var translations: StringDictionary[String]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTranslations(value: StringDictionary[String]): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

