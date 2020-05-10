package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLangTimePickerLocale extends js.Object {
  var lang: AnonBackToToday = js.native
  var timePickerLocale: AnonPlaceholderString = js.native
}

object AnonLangTimePickerLocale {
  @scala.inline
  def apply(lang: AnonBackToToday, timePickerLocale: AnonPlaceholderString): AnonLangTimePickerLocale = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLangTimePickerLocale]
  }
  @scala.inline
  implicit class AnonLangTimePickerLocaleOps[Self <: AnonLangTimePickerLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: AnonBackToToday): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePickerLocale(value: AnonPlaceholderString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

