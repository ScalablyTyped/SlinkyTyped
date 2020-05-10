package typingsSlinky.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Port extends js.Object {
  var name: String = js.native
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: typingsSlinky.chrome.chrome.runtime.PortDisconnectEvent = js.native
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: typingsSlinky.chrome.chrome.runtime.PortMessageEvent = js.native
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[typingsSlinky.chrome.chrome.runtime.MessageSender] = js.native
  def disconnect(): Unit = js.native
  def postMessage(message: js.Object): Unit = js.native
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: typingsSlinky.chrome.chrome.runtime.PortDisconnectEvent,
    onMessage: typingsSlinky.chrome.chrome.runtime.PortMessageEvent,
    postMessage: js.Object => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDisconnect(value: typingsSlinky.chrome.chrome.runtime.PortDisconnectEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMessage(value: typingsSlinky.chrome.chrome.runtime.PortMessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostMessage(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSender(value: typingsSlinky.chrome.chrome.runtime.MessageSender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
  }
  
}

