package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings._empty
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.numberOfMonths
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.today
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMonth extends js.Object {
  var changeMonth: select | none = js.native
  var changeYear: select | none = js.native
  var currentMonthPos: Double = js.native
  var daysOutsideMonth: hidden | visible | selectable = js.native
  var footerLayout: _empty | today = js.native
  var numberOfMonths: Double = js.native
  var showOn: focus | image = js.native
  var stepBigMonths: Double = js.native
  var stepMonths: numberOfMonths | Double = js.native
  var weekDisplay: number | none = js.native
  var yearRange: String = js.native
}

object ChangeMonth {
  @scala.inline
  def apply(
    changeMonth: select | none,
    changeYear: select | none,
    currentMonthPos: Double,
    daysOutsideMonth: hidden | visible | selectable,
    footerLayout: _empty | today,
    numberOfMonths: Double,
    showOn: focus | image,
    stepBigMonths: Double,
    stepMonths: numberOfMonths | Double,
    weekDisplay: number | none,
    yearRange: String
  ): ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonth]
  }
  @scala.inline
  implicit class ChangeMonthOps[Self <: ChangeMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeMonth(value: select | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeYear(value: select | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMonthPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMonthPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysOutsideMonth(value: hidden | visible | selectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOutsideMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterLayout(value: _empty | today): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOn(value: focus | image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepBigMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepBigMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepMonths(value: numberOfMonths | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekDisplay(value: number | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

