package typingsSlinky.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormatted extends js.Object {
  var formatted: Boolean = js.native
}

object AnonFormatted {
  @scala.inline
  def apply(formatted: Boolean): AnonFormatted = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatted]
  }
  @scala.inline
  implicit class AnonFormattedOps[Self <: AnonFormatted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

