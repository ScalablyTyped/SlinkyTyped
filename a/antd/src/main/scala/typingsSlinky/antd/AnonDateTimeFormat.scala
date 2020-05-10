package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateTimeFormat extends js.Object {
  var dateFormat: String = js.native
  var dateTimeFormat: String = js.native
  var lang: AnonClear = js.native
  var monthFormat: String = js.native
  var timePickerLocale: AnonPlaceholderString = js.native
  var weekFormat: String = js.native
}

object AnonDateTimeFormat {
  @scala.inline
  def apply(
    dateFormat: String,
    dateTimeFormat: String,
    lang: AnonClear,
    monthFormat: String,
    timePickerLocale: AnonPlaceholderString,
    weekFormat: String
  ): AnonDateTimeFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any], weekFormat = weekFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateTimeFormat]
  }
  @scala.inline
  implicit class AnonDateTimeFormatOps[Self <: AnonDateTimeFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: AnonClear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePickerLocale(value: AnonPlaceholderString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

