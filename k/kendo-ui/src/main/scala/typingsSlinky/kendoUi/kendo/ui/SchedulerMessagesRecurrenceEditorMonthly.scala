package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorMonthly extends js.Object {
  var day: js.UndefOr[String] = js.native
  var interval: js.UndefOr[String] = js.native
  var repeatEvery: js.UndefOr[String] = js.native
  var repeatOn: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorMonthly {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorMonthly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorMonthly]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorMonthlyOps[Self <: SchedulerMessagesRecurrenceEditorMonthly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String): Self = {
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
    def withInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatEvery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatEvery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatEvery")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatOn")(js.undefined)
        ret
    }
  }
  
}

