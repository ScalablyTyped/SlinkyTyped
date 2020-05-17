package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelText extends js.Object {
  var cancelText: String = js.native
}

object CancelText {
  @scala.inline
  def apply(cancelText: String): CancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelText]
  }
  @scala.inline
  implicit class CancelTextOps[Self <: CancelText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

