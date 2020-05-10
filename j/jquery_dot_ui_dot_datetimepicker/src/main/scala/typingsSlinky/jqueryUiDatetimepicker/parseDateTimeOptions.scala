package typingsSlinky.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait parseDateTimeOptions extends js.Object {
  var dateFormat: String = js.native
  var dateSettings: String = js.native
  var dateTimeString: String = js.native
  var timeFormat: String = js.native
  var timeSettings: String = js.native
}

object parseDateTimeOptions {
  @scala.inline
  def apply(
    dateFormat: String,
    dateSettings: String,
    dateTimeString: String,
    timeFormat: String,
    timeSettings: String
  ): parseDateTimeOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateSettings = dateSettings.asInstanceOf[js.Any], dateTimeString = dateTimeString.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeSettings = timeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseDateTimeOptions]
  }
  @scala.inline
  implicit class parseDateTimeOptionsOps[Self <: parseDateTimeOptions] (val x: Self) extends AnyVal {
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
    def withDateSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

