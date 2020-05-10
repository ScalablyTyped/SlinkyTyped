package typingsSlinky.baseui.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalState extends js.Object {
  var isVisible: Boolean = js.native
  var mounted: Boolean = js.native
}

object ModalState {
  @scala.inline
  def apply(isVisible: Boolean, mounted: Boolean): ModalState = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalState]
  }
  @scala.inline
  implicit class ModalStateOps[Self <: ModalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

