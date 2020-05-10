package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDismiss extends js.Object {
  def dismiss(): Unit = js.native
}

object AnonDismiss {
  @scala.inline
  def apply(dismiss: () => Unit): AnonDismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[AnonDismiss]
  }
  @scala.inline
  implicit class AnonDismissOps[Self <: AnonDismiss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

