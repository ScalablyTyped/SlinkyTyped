package typingsSlinky.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cable extends js.Object {
  var subscriptions: Subscriptions = js.native
  def connect(): Unit = js.native
  def disconnect(): Unit = js.native
  def ensureActiveConnection(): Unit = js.native
  def send(data: js.Any): Unit = js.native
}

object Cable {
  @scala.inline
  def apply(
    connect: () => Unit,
    disconnect: () => Unit,
    ensureActiveConnection: () => Unit,
    send: js.Any => Unit,
    subscriptions: Subscriptions
  ): Cable = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), ensureActiveConnection = js.Any.fromFunction0(ensureActiveConnection), send = js.Any.fromFunction1(send), subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cable]
  }
  @scala.inline
  implicit class CableOps[Self <: Cable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnsureActiveConnection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureActiveConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscriptions(value: Subscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

