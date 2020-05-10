package typingsSlinky.rrule

import typingsSlinky.rrule.rruleStrings.FR
import typingsSlinky.rrule.rruleStrings.MO
import typingsSlinky.rrule.rruleStrings.SA
import typingsSlinky.rrule.rruleStrings.SU
import typingsSlinky.rrule.rruleStrings.TH
import typingsSlinky.rrule.rruleStrings.TU
import typingsSlinky.rrule.rruleStrings.WE
import typingsSlinky.rrule.typesMod.ByWeekday
import typingsSlinky.rrule.typesMod.Frequency
import typingsSlinky.rrule.weekdayMod.Weekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonByeaster extends js.Object {
  var byeaster: js.UndefOr[Double | Null] = js.native
  var byhour: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var byminute: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var bymonth: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var bymonthday: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var bynmonthday: js.UndefOr[js.Array[Double] | Null] = js.native
  var bynweekday: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.native
  var bysecond: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var bysetpos: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var byweekday: js.UndefOr[Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday] | Null] = js.native
  var byweekno: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var byyearday: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  var count: js.UndefOr[Double | Null] = js.native
  var dtstart: js.UndefOr[js.Date | Null] = js.native
  var freq: js.UndefOr[Frequency] = js.native
  var interval: js.UndefOr[Double] = js.native
  var tzid: js.UndefOr[String | Null] = js.native
  var until: js.UndefOr[js.Date | Null] = js.native
  var wkst: js.UndefOr[Double | Weekday | Null] = js.native
}

object AnonByeaster {
  @scala.inline
  def apply(): AnonByeaster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonByeaster]
  }
  @scala.inline
  implicit class AnonByeasterOps[Self <: AnonByeaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByeaster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byeaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByeaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byeaster")(js.undefined)
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
    def withoutByhour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byhour")(js.undefined)
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
    def withoutByminute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byminute")(js.undefined)
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
    def withoutBymonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonth")(js.undefined)
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
    def withoutBymonthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonthday")(js.undefined)
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
    def withoutBynmonthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynmonthday")(js.undefined)
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
    def withoutBynweekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynweekday")(js.undefined)
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
    def withoutBysecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysecond")(js.undefined)
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
    def withoutBysetpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysetpos")(js.undefined)
        ret
    }
    @scala.inline
    def withBysetposNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysetpos")(null)
        ret
    }
    @scala.inline
    def withByweekday(value: Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByweekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekday")(js.undefined)
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
    def withoutByweekno: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekno")(js.undefined)
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
    def withoutByyearday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byyearday")(js.undefined)
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
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
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
    def withoutDtstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDtstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(null)
        ret
    }
    @scala.inline
    def withFreq(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withTzid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTzid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(js.undefined)
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
    def withoutUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(js.undefined)
        ret
    }
    @scala.inline
    def withUntilNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(null)
        ret
    }
    @scala.inline
    def withWkst(value: Double | Weekday): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWkst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkst")(js.undefined)
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

