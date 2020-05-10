package typingsSlinky.jqueryJsonrpcclient

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebSocket
import typingsSlinky.jquery.JQuery_.AjaxSettings
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonRpcClientOptions
  extends AjaxSettings[js.Any] {
  var ajaxUrl: String = js.native
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[Unit], WebSocket]] = js.native
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var onclose: js.UndefOr[js.Function1[/* ev */ CloseEvent, Unit]] = js.native
  var onerror: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var onmessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, Unit]] = js.native
  var onopen: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var socketUrl: js.UndefOr[String] = js.native
}

object JsonRpcClientOptions {
  @scala.inline
  def apply(ajaxUrl: String): JsonRpcClientOptions = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcClientOptions]
  }
  @scala.inline
  implicit class JsonRpcClientOptionsOps[Self <: JsonRpcClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSockect(value: /* onmessageCb */ js.Function0[Unit] => WebSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSockect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSockect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSockect")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose(value: /* ev */ CloseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmessage(value: /* ev */ MessageEvent => Unit): Self = {
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
    @scala.inline
    def withOnopen(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketUrl")(js.undefined)
        ret
    }
  }
  
}

