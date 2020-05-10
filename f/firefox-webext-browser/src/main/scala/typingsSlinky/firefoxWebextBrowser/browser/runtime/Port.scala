package typingsSlinky.firefoxWebextBrowser.browser.runtime

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime types */
/** An object which allows two way communication with other pages. */
@js.native
trait Port extends js.Object {
  var error: js.UndefOr[js.Error] = js.native
  var name: String = js.native
  var onDisconnect: WebExtEvent[js.Function1[/* port */ this.type, Unit]] = js.native
  var onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]] = js.native
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.native
  def disconnect(): Unit = js.native
  def postMessage(message: js.Object): Unit = js.native
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: WebExtEvent[js.Function1[Port, Unit]],
    onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]],
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
    def withOnDisconnect(value: WebExtEvent[js.Function1[Port, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMessage(value: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]): Self = {
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
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: MessageSender): Self = {
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

