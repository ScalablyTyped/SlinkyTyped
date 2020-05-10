package typingsSlinky.reactBigCalendar

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.mod.ViewStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAgenda extends js.Object {
  var agenda: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  var day: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  var month: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  var week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  var work_week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
}

object AnonAgenda {
  @scala.inline
  def apply(): AnonAgenda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAgenda]
  }
  @scala.inline
  implicit class AnonAgendaOps[Self <: AnonAgenda] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgenda(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agenda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgenda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agenda")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = {
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
    def withMonth(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = {
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
    @scala.inline
    def withWeek(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
    @scala.inline
    def withWork_week(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work_week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWork_week: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work_week")(js.undefined)
        ret
    }
  }
  
}

