package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfirm extends js.Object {
  var confirm: Boolean = js.native
}

object AnonConfirm {
  @scala.inline
  def apply(confirm: Boolean): AnonConfirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirm]
  }
  @scala.inline
  implicit class AnonConfirmOps[Self <: AnonConfirm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

