package typingsSlinky.reactLazylog.lazyLogMod

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsocketOptions extends js.Object {
  var formatMessage: js.UndefOr[js.Function1[/* message */ js.Any, String]] = js.native
  var onClose: js.UndefOr[js.Function1[/* e */ CloseEvent, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onOpen: js.UndefOr[js.Function2[/* e */ Event, /* socket */ WebSocket, Unit]] = js.native
}

object WebsocketOptions {
  @scala.inline
  def apply(): WebsocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketOptions]
  }
  @scala.inline
  implicit class WebsocketOptionsOps[Self <: WebsocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatMessage(value: /* message */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* e */ CloseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* e */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: (/* e */ Event, /* socket */ WebSocket) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
  }
  
}

