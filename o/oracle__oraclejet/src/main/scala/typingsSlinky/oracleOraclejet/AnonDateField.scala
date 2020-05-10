package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateField extends js.Object {
  var dateField: js.UndefOr[String] = js.native
  var dateOnly: js.UndefOr[Boolean] = js.native
  var formatUsing: js.UndefOr[String] = js.native
  var relativeTime: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object AnonDateField {
  @scala.inline
  def apply(): AnonDateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDateField]
  }
  @scala.inline
  implicit class AnonDateFieldOps[Self <: AnonDateField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateField")(js.undefined)
        ret
    }
    @scala.inline
    def withDateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatUsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUsing")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

