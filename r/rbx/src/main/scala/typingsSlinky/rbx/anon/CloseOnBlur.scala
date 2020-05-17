package typingsSlinky.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseOnBlur extends js.Object {
  var closeOnBlur: Boolean = js.native
  var closeOnEsc: Boolean = js.native
}

object CloseOnBlur {
  @scala.inline
  def apply(closeOnBlur: Boolean, closeOnEsc: Boolean): CloseOnBlur = {
    val __obj = js.Dynamic.literal(closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnBlur]
  }
  @scala.inline
  implicit class CloseOnBlurOps[Self <: CloseOnBlur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

