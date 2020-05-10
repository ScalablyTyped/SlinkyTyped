package typingsSlinky.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForward extends js.Object {
  var Cancel: Boolean = js.native
  val Forward: js.Any = js.native
}

object AnonForward {
  @scala.inline
  def apply(Cancel: Boolean, Forward: js.Any): AnonForward = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForward]
  }
  @scala.inline
  implicit class AnonForwardOps[Self <: AnonForward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

