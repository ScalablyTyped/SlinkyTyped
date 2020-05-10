package typingsSlinky.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveListener extends js.Object {
  def removeListener(): Unit = js.native
}

object AnonRemoveListener {
  @scala.inline
  def apply(removeListener: () => Unit): AnonRemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[AnonRemoveListener]
  }
  @scala.inline
  implicit class AnonRemoveListenerOps[Self <: AnonRemoveListener] (val x: Self) extends AnyVal {
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

