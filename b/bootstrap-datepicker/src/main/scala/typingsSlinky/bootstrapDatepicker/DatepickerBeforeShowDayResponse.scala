package typingsSlinky.bootstrapDatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerBeforeShowDayResponse extends DatepickerBeforeShowResponse {
  var content: js.UndefOr[String] = js.native
}

object DatepickerBeforeShowDayResponse {
  @scala.inline
  def apply(): DatepickerBeforeShowDayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerBeforeShowDayResponse]
  }
  @scala.inline
  implicit class DatepickerBeforeShowDayResponseOps[Self <: DatepickerBeforeShowDayResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

