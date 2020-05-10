package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyCalendar extends js.Object {
  /**
    * List of time ranges during which this calendar should be regarded as
    * busy.
    */
  var busy: js.UndefOr[js.Array[SchemaTimePeriod]] = js.native
  /**
    * Optional error(s) (if computation for the calendar failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
}

object SchemaFreeBusyCalendar {
  @scala.inline
  def apply(): SchemaFreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyCalendar]
  }
  @scala.inline
  implicit class SchemaFreeBusyCalendarOps[Self <: SchemaFreeBusyCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusy(value: js.Array[SchemaTimePeriod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[SchemaError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

