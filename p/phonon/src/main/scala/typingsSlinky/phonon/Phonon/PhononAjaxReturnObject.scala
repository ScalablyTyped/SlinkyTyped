package typingsSlinky.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononAjaxReturnObject extends js.Object {
  def cancel(): Unit = js.native
}

object PhononAjaxReturnObject {
  @scala.inline
  def apply(cancel: () => Unit): PhononAjaxReturnObject = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[PhononAjaxReturnObject]
  }
  @scala.inline
  implicit class PhononAjaxReturnObjectOps[Self <: PhononAjaxReturnObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

