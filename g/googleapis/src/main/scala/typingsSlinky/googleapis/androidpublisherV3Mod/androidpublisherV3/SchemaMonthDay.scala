package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMonthDay extends js.Object {
  /**
    * Day of a month, value in [1, 31] range. Valid range depends on the
    * specified month.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Month of a year. e.g. 1 = JAN, 2 = FEB etc.
    */
  var month: js.UndefOr[Double] = js.native
}

object SchemaMonthDay {
  @scala.inline
  def apply(): SchemaMonthDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonthDay]
  }
  @scala.inline
  implicit class SchemaMonthDayOps[Self <: SchemaMonthDay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
  }
  
}

