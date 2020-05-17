package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerLocale extends js.Object {
  var lang: Clear = js.native
  var timePickerLocale: PlaceholderString = js.native
}

object TimePickerLocale {
  @scala.inline
  def apply(lang: Clear, timePickerLocale: PlaceholderString): TimePickerLocale = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerLocale]
  }
  @scala.inline
  implicit class TimePickerLocaleOps[Self <: TimePickerLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: Clear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePickerLocale(value: PlaceholderString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

