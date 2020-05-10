package typingsSlinky.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  def perform(action: String, data: js.Object): Unit = js.native
  def send(data: js.Any): Boolean = js.native
  def unsubscribe(): Unit = js.native
}

object Channel {
  @scala.inline
  def apply(perform: (String, js.Object) => Unit, send: js.Any => Boolean, unsubscribe: () => Unit): Channel = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2(perform), send = js.Any.fromFunction1(send), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerform(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

