package typingsSlinky.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTypesBoolean extends js.Object {
  var color: Boolean = js.native
  var date: Boolean = js.native
  var datetime: Boolean = js.native
  var `datetime-local`: Boolean = js.native
  var email: Boolean = js.native
  var month: Boolean = js.native
  var number: Boolean = js.native
  var range: Boolean = js.native
  var search: Boolean = js.native
  var tel: Boolean = js.native
  var time: Boolean = js.native
  var url: Boolean = js.native
  var week: Boolean = js.native
}

object InputTypesBoolean {
  @scala.inline
  def apply(
    color: Boolean,
    date: Boolean,
    datetime: Boolean,
    `datetime-local`: Boolean,
    email: Boolean,
    month: Boolean,
    number: Boolean,
    range: Boolean,
    search: Boolean,
    tel: Boolean,
    time: Boolean,
    url: Boolean,
    week: Boolean
  ): InputTypesBoolean = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTypesBoolean]
  }
  @scala.inline
  implicit class InputTypesBooleanOps[Self <: InputTypesBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDatetime-local`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime-local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

