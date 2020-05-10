package typingsSlinky.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCallbackProperties extends js.Object {
  var activeStartDate: js.Date = js.native
  var view: Detail = js.native
}

object ViewCallbackProperties {
  @scala.inline
  def apply(activeStartDate: js.Date, view: Detail): ViewCallbackProperties = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCallbackProperties]
  }
  @scala.inline
  implicit class ViewCallbackPropertiesOps[Self <: ViewCallbackProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

