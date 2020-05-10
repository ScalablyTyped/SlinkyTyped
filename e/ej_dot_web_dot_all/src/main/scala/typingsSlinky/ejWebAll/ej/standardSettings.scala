package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait standardSettings extends js.Object {
  var AM: js.Array[String] = js.native
  var PM: js.Array[String] = js.native
  var days: daySettings = js.native
  var firstDay: Double = js.native
  var months: monthSettings = js.native
  var patterns: patternSettings = js.native
  var twoDigitYearMax: Double = js.native
}

object standardSettings {
  @scala.inline
  def apply(
    AM: js.Array[String],
    PM: js.Array[String],
    days: daySettings,
    firstDay: Double,
    months: monthSettings,
    patterns: patternSettings,
    twoDigitYearMax: Double
  ): standardSettings = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[standardSettings]
  }
  @scala.inline
  implicit class standardSettingsOps[Self <: standardSettings] (val x: Self) extends AnyVal {
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
    def withPM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: daySettings): Self = {
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
    def withMonths(value: monthSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: patternSettings): Self = {
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

