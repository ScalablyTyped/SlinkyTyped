package typingsSlinky.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait CalendarDayPhrases extends js.Object {
  def chooseAvailableDate(date: String): String = js.native
  def dateIsSelected(date: String): String = js.native
  def dateIsUnavailable(date: String): String = js.native
}

object CalendarDayPhrases {
  @scala.inline
  def apply(
    chooseAvailableDate: String => String,
    dateIsSelected: String => String,
    dateIsUnavailable: String => String
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal(chooseAvailableDate = js.Any.fromFunction1(chooseAvailableDate), dateIsSelected = js.Any.fromFunction1(dateIsSelected), dateIsUnavailable = js.Any.fromFunction1(dateIsUnavailable))
    __obj.asInstanceOf[CalendarDayPhrases]
  }
  @scala.inline
  implicit class CalendarDayPhrasesOps[Self <: CalendarDayPhrases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChooseAvailableDate(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseAvailableDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateIsSelected(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateIsUnavailable(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsUnavailable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

