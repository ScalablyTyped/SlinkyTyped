package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangePickerMessages extends js.Object {
  var endLabel: js.UndefOr[String] = js.native
  var startLabel: js.UndefOr[String] = js.native
}

object DateRangePickerMessages {
  @scala.inline
  def apply(): DateRangePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerMessages]
  }
  @scala.inline
  implicit class DateRangePickerMessagesOps[Self <: DateRangePickerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLabel")(js.undefined)
        ret
    }
  }
  
}

