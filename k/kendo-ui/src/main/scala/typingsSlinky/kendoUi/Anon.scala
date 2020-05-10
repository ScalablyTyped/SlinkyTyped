package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon extends js.Object {
  var AM: js.Array[String] = js.native
  @JSName(":")
  var Colon: String = js.native
  var PM: js.Array[String] = js.native
  @JSName("/")
  var Slash: String = js.native
  var days: AnonNames = js.native
  var firstDay: Double = js.native
  var months: AnonNamesAbbr = js.native
  var patterns: AnonD = js.native
  var twoDigitYearMax: Double = js.native
}

object Anon {
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: AnonNames,
    firstDay: Double,
    months: AnonNamesAbbr,
    patterns: AnonD,
    twoDigitYearMax: Double
  ): Anon = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
  @scala.inline
  implicit class AnonOps[Self <: Anon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("/")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: AnonNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: AnonNamesAbbr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: AnonD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoDigitYearMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoDigitYearMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

