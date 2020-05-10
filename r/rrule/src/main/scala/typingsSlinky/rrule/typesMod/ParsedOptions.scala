package typingsSlinky.rrule.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends Options {
  @JSName("byhour")
  var byhour_ParsedOptions: js.Array[Double] = js.native
  @JSName("byminute")
  var byminute_ParsedOptions: js.Array[Double] = js.native
  @JSName("bymonth")
  var bymonth_ParsedOptions: js.Array[Double] = js.native
  @JSName("bymonthday")
  var bymonthday_ParsedOptions: js.Array[Double] = js.native
  @JSName("bynmonthday")
  var bynmonthday_ParsedOptions: js.Array[Double] = js.native
  @JSName("bysecond")
  var bysecond_ParsedOptions: js.Array[Double] = js.native
  @JSName("bysetpos")
  var bysetpos_ParsedOptions: js.Array[Double] = js.native
  @JSName("byweekday")
  var byweekday_ParsedOptions: js.Array[Double] = js.native
  @JSName("byweekno")
  var byweekno_ParsedOptions: js.Array[Double] = js.native
  @JSName("byyearday")
  var byyearday_ParsedOptions: js.Array[Double] = js.native
  @JSName("dtstart")
  var dtstart_ParsedOptions: js.Date = js.native
  @JSName("wkst")
  var wkst_ParsedOptions: Double = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    byhour: js.Array[Double],
    byminute: js.Array[Double],
    bymonth: js.Array[Double],
    bymonthday: js.Array[Double],
    bynmonthday: js.Array[Double],
    bysecond: js.Array[Double],
    bysetpos: js.Array[Double],
    byweekday: js.Array[Double],
    byweekno: js.Array[Double],
    byyearday: js.Array[Double],
    dtstart: js.Date,
    freq: Frequency,
    interval: Double,
    wkst: Double
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(byhour = byhour.asInstanceOf[js.Any], byminute = byminute.asInstanceOf[js.Any], bymonth = bymonth.asInstanceOf[js.Any], bymonthday = bymonthday.asInstanceOf[js.Any], bynmonthday = bynmonthday.asInstanceOf[js.Any], bysecond = bysecond.asInstanceOf[js.Any], bysetpos = bysetpos.asInstanceOf[js.Any], byweekday = byweekday.asInstanceOf[js.Any], byweekno = byweekno.asInstanceOf[js.Any], byyearday = byyearday.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], wkst = wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByhour(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byhour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByminute(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byminute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBymonth(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBymonthday(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bymonthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBynmonthday(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bynmonthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBysecond(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBysetpos(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bysetpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByweekday(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByweekno(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byweekno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByyearday(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byyearday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtstart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWkst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

