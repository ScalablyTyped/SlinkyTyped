package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditor extends js.Object {
  var daily: js.UndefOr[SchedulerMessagesRecurrenceEditorDaily] = js.native
  var end: js.UndefOr[SchedulerMessagesRecurrenceEditorEnd] = js.native
  var frequencies: js.UndefOr[SchedulerMessagesRecurrenceEditorFrequencies] = js.native
  var monthly: js.UndefOr[SchedulerMessagesRecurrenceEditorMonthly] = js.native
  var offsetPositions: js.UndefOr[SchedulerMessagesRecurrenceEditorOffsetPositions] = js.native
  var recurrenceEditorTitle: js.UndefOr[String] = js.native
  var weekdays: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekdays] = js.native
  var weekly: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekly] = js.native
  var yearly: js.UndefOr[SchedulerMessagesRecurrenceEditorYearly] = js.native
}

object SchedulerMessagesRecurrenceEditor {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditor]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorOps[Self <: SchedulerMessagesRecurrenceEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: SchedulerMessagesRecurrenceEditorDaily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: SchedulerMessagesRecurrenceEditorEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencies(value: SchedulerMessagesRecurrenceEditorFrequencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencies")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthly(value: SchedulerMessagesRecurrenceEditorMonthly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthly")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetPositions(value: SchedulerMessagesRecurrenceEditorOffsetPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceEditorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceEditorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceEditorTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceEditorTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: SchedulerMessagesRecurrenceEditorWeekdays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekly(value: SchedulerMessagesRecurrenceEditorWeekly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekly")(js.undefined)
        ret
    }
    @scala.inline
    def withYearly(value: SchedulerMessagesRecurrenceEditorYearly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearly")(js.undefined)
        ret
    }
  }
  
}

