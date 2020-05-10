package typingsSlinky.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageChannel extends js.Object {
  def onMessage(message: Message): js.Any = js.native
  def sendMessage(message: Message): Unit = js.native
}

object IMessageChannel {
  @scala.inline
  def apply(onMessage: Message => js.Any, sendMessage: Message => Unit): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[IMessageChannel]
  }
  @scala.inline
  implicit class IMessageChannelOps[Self <: IMessageChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMessage(value: Message => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendMessage(value: Message => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

