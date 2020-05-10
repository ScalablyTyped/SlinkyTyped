package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesEditable extends js.Object {
  var confirmation: js.UndefOr[String] = js.native
}

object SchedulerMessagesEditable {
  @scala.inline
  def apply(): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
  @scala.inline
  implicit class SchedulerMessagesEditableOps[Self <: SchedulerMessagesEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation")(js.undefined)
        ret
    }
  }
  
}

