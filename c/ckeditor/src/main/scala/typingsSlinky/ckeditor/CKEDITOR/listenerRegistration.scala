package typingsSlinky.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait listenerRegistration extends js.Object {
  def removeListener(): Unit = js.native
}

object listenerRegistration {
  @scala.inline
  def apply(removeListener: () => Unit): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[listenerRegistration]
  }
  @scala.inline
  implicit class listenerRegistrationOps[Self <: listenerRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveListener(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

