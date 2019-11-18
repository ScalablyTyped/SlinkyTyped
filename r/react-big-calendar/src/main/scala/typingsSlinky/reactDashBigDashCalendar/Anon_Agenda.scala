package typingsSlinky.reactDashBigDashCalendar

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.ViewStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Agenda extends js.Object {
  var agenda: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var day: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var month: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
  var work_week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.undefined
}

object Anon_Agenda {
  @scala.inline
  def apply(
    agenda: Boolean | (ReactComponentClass[_] with ViewStatic) = null,
    day: Boolean | (ReactComponentClass[_] with ViewStatic) = null,
    month: Boolean | (ReactComponentClass[_] with ViewStatic) = null,
    week: Boolean | (ReactComponentClass[_] with ViewStatic) = null,
    work_week: Boolean | (ReactComponentClass[_] with ViewStatic) = null
  ): Anon_Agenda = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (work_week != null) __obj.updateDynamic("work_week")(work_week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Agenda]
  }
}

