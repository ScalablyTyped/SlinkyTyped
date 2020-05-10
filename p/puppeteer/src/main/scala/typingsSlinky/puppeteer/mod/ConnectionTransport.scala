package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTransport extends js.Object {
  var onclose: js.UndefOr[js.Function0[Unit]] = js.native
  var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  def close(): Unit = js.native
  def send(message: String): Unit = js.native
}

object ConnectionTransport {
  @scala.inline
  def apply(close: () => Unit, send: String => Unit): ConnectionTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[ConnectionTransport]
  }
  @scala.inline
  implicit class ConnectionTransportOps[Self <: ConnectionTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnclose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmessage(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.undefined)
        ret
    }
  }
  
}

