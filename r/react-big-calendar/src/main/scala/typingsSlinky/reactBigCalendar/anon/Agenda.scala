package typingsSlinky.reactBigCalendar.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.mod.ViewStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agenda extends js.Object {
  var agenda: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var day: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var month: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var work_week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
}

object Agenda {
  @scala.inline
  def apply(): Agenda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agenda]
  }
  @scala.inline
  implicit class AgendaOps[Self <: Agenda] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgenda(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = this.set("agenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    @scala.inline
    def setDay(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMonth(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setWeek(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setWork_week(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = this.set("work_week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWork_week: Self = this.set("work_week", js.undefined)
  }
  
}

