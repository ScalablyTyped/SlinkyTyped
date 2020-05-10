package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancel extends js.Object {
  var cancel: String = js.native
}

object AnonCancel {
  @scala.inline
  def apply(cancel: String): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
  @scala.inline
  implicit class AnonCancelOps[Self <: AnonCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

