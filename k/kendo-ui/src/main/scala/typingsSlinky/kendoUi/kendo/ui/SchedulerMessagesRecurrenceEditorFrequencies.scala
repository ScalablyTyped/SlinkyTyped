package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorFrequencies extends js.Object {
  var daily: js.UndefOr[String] = js.native
  var monthly: js.UndefOr[String] = js.native
  var never: js.UndefOr[String] = js.native
  var weekly: js.UndefOr[String] = js.native
  var yearly: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorFrequencies {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorFrequencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorFrequencies]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorFrequenciesOps[Self <: SchedulerMessagesRecurrenceEditorFrequencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: String): Self = {
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
    def withMonthly(value: String): Self = {
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
    def withNever(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNever: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekly(value: String): Self = {
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
    def withYearly(value: String): Self = {
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

