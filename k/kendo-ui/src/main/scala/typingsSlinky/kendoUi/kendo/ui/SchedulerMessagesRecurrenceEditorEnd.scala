package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorEnd extends js.Object {
  var after: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var mobileLabel: js.UndefOr[String] = js.native
  var never: js.UndefOr[String] = js.native
  var occurrence: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorEnd {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorEnd]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorEndOps[Self <: SchedulerMessagesRecurrenceEditorEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileLabel")(js.undefined)
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
    def withOccurrence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
  }
  
}

