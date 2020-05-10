package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceMessages extends js.Object {
  var deleteRecurring: js.UndefOr[String] = js.native
  var deleteWindowOccurrence: js.UndefOr[String] = js.native
  var deleteWindowSeries: js.UndefOr[String] = js.native
  var deleteWindowTitle: js.UndefOr[String] = js.native
  var editRecurring: js.UndefOr[String] = js.native
  var editWindowOccurrence: js.UndefOr[String] = js.native
  var editWindowSeries: js.UndefOr[String] = js.native
  var editWindowTitle: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceMessages {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceMessages]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceMessagesOps[Self <: SchedulerMessagesRecurrenceMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteRecurring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRecurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRecurring")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteWindowOccurrence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowOccurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteWindowOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowOccurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteWindowSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteWindowSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteWindowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteWindowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteWindowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRecurring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRecurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRecurring")(js.undefined)
        ret
    }
    @scala.inline
    def withEditWindowOccurrence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowOccurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditWindowOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowOccurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withEditWindowSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditWindowSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withEditWindowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditWindowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWindowTitle")(js.undefined)
        ret
    }
  }
  
}

