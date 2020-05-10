package typingsSlinky.emberComponent.actionSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSupport extends js.Object {
  def sendAction(action: String, params: js.Any*): Unit = js.native
}

object ActionSupport {
  @scala.inline
  def apply(sendAction: (String, /* repeated */ js.Any) => Unit): ActionSupport = {
    val __obj = js.Dynamic.literal(sendAction = js.Any.fromFunction2(sendAction))
    __obj.asInstanceOf[ActionSupport]
  }
  @scala.inline
  implicit class ActionSupportOps[Self <: ActionSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendAction(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAction")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

