package typingsSlinky.eggMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentDate extends js.Object {
  var currentDate: js.UndefOr[String | Double | js.Date] = js.native
  var endDate: js.UndefOr[String | Double | js.Date] = js.native
  var iterator: js.UndefOr[Boolean] = js.native
  var tz: js.UndefOr[String] = js.native
  var utc: js.UndefOr[Boolean] = js.native
}

object AnonCurrentDate {
  @scala.inline
  def apply(): AnonCurrentDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrentDate]
  }
  @scala.inline
  implicit class AnonCurrentDateOps[Self <: AnonCurrentDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDate(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIterator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator")(js.undefined)
        ret
    }
    @scala.inline
    def withTz(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(js.undefined)
        ret
    }
    @scala.inline
    def withUtc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(js.undefined)
        ret
    }
  }
  
}

