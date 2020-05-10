package typingsSlinky.rrule.typesMod

import typingsSlinky.rrule.weekdayMod.Weekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var byeaster: Double | Null = js.native
  var byhour: Double | js.Array[Double] | Null = js.native
  var byminute: Double | js.Array[Double] | Null = js.native
  var bymonth: Double | js.Array[Double] | Null = js.native
  var bymonthday: Double | js.Array[Double] | Null = js.native
  var bynmonthday: js.Array[Double] | Null = js.native
  var bynweekday: js.Array[js.Array[Double]] | Null = js.native
  var bysecond: Double | js.Array[Double] | Null = js.native
  var bysetpos: Double | js.Array[Double] | Null = js.native
  var byweekday: ByWeekday | js.Array[ByWeekday] | Null = js.native
  var byweekno: Double | js.Array[Double] | Null = js.native
  var byyearday: Double | js.Array[Double] | Null = js.native
  var count: Double | Null = js.native
  var dtstart: js.Date | Null = js.native
  var freq: Frequency = js.native
  var interval: Double = js.native
  var tzid: String | Null = js.native
  var until: js.Date | Null = js.native
  var wkst: Weekday | Double | Null = js.native
}

object Options {
  @scala.inline
  def apply(freq: Frequency, interval: Double): Options = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreq(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByeaster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byeaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByeasterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byeaster")(null)
        ret
    }
    @scala.inline
    def withByhour(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byhour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByhourNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byhour")(null)
        ret
    }
    @scala.inline
    def withByminute(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byminute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByminuteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byminute")(null)
        ret
    }
    @scala.inline
    def withBymonth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBymonthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonth")(null)
        ret
    }
    @scala.inline
    def withBymonthday(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBymonthdayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonthday")(null)
        ret
    }
    @scala.inline
    def withBynmonthday(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynmonthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBynmonthdayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynmonthday")(null)
        ret
    }
    @scala.inline
    def withBynweekday(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynweekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBynweekdayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynweekday")(null)
        ret
    }
    @scala.inline
    def withBysecond(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBysecondNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysecond")(null)
        ret
    }
    @scala.inline
    def withBysetpos(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysetpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBysetposNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysetpos")(null)
        ret
    }
    @scala.inline
    def withByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByweekdayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekday")(null)
        ret
    }
    @scala.inline
    def withByweekno(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByweeknoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekno")(null)
        ret
    }
    @scala.inline
    def withByyearday(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byyearday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByyeardayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byyearday")(null)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(null)
        ret
    }
    @scala.inline
    def withDtstart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(null)
        ret
    }
    @scala.inline
    def withTzid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTzidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(null)
        ret
    }
    @scala.inline
    def withUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntilNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(null)
        ret
    }
    @scala.inline
    def withWkst(value: Weekday | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWkstNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkst")(null)
        ret
    }
  }
  
}

