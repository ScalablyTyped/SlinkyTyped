package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFormat extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var liveSearch: js.UndefOr[Boolean] = js.native
  var timezoneOffset: js.UndefOr[Double] = js.native
  var weekOffset: js.UndefOr[Double] = js.native
}

object DateFormat {
  @scala.inline
  def apply(): DateFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormat]
  }
  @scala.inline
  implicit class DateFormatOps[Self <: DateFormat] (val x: Self) extends AnyVal {
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
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezoneOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekOffset")(js.undefined)
        ret
    }
  }
  
}

