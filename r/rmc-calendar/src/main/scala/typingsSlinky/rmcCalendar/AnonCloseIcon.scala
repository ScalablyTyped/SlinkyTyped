package typingsSlinky.rmcCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseIcon extends js.Object {
  var closeIcon: String = js.native
}

object AnonCloseIcon {
  @scala.inline
  def apply(closeIcon: String): AnonCloseIcon = {
    val __obj = js.Dynamic.literal(closeIcon = closeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseIcon]
  }
  @scala.inline
  implicit class AnonCloseIconOps[Self <: AnonCloseIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

