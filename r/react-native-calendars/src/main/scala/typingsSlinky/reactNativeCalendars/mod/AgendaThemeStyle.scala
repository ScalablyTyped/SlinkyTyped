package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaThemeStyle extends CalendarTheme {
  var agendaDayNumColor: js.UndefOr[String] = js.native
  var agendaDayTextColor: js.UndefOr[String] = js.native
  var agendaKnobColor: js.UndefOr[String] = js.native
  var agendaTodayColor: js.UndefOr[String] = js.native
}

object AgendaThemeStyle {
  @scala.inline
  def apply(): AgendaThemeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaThemeStyle]
  }
  @scala.inline
  implicit class AgendaThemeStyleOps[Self <: AgendaThemeStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaDayNumColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDayNumColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaDayNumColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDayNumColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaDayTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDayTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaDayTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDayTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaKnobColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaKnobColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaKnobColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaKnobColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaTodayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTodayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaTodayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTodayColor")(js.undefined)
        ret
    }
  }
  
}

