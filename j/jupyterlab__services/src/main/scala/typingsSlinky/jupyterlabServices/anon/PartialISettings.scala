package typingsSlinky.jupyterlabServices.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import typingsSlinky.std.global.Headers
import typingsSlinky.std.global.Request
import typingsSlinky.std.global.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
@js.native
trait PartialISettings extends js.Object {
  var Headers: js.UndefOr[Instantiable with Instantiable0[typingsSlinky.std.global.Headers]] = js.native
  var Request: js.UndefOr[
    InstantiableRequest with (Instantiable1[/* input */ RequestInfo, typingsSlinky.std.global.Request])
  ] = js.native
  var WebSocket: js.UndefOr[
    CLOSED with (Instantiable1[/* url */ String, typingsSlinky.std.global.WebSocket])
  ] = js.native
  var appUrl: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var fetch: js.UndefOr[
    js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ] = js.native
  var init: js.UndefOr[RequestInit] = js.native
  var token: js.UndefOr[String] = js.native
  var wsUrl: js.UndefOr[String] = js.native
}

object PartialISettings {
  @scala.inline
  def apply(): PartialISettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISettings]
  }
  @scala.inline
  implicit class PartialISettingsOps[Self <: PartialISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Instantiable with Instantiable0[Headers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: InstantiableRequest with (Instantiable1[/* input */ RequestInfo, Request])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocket(value: CLOSED with (Instantiable1[/* url */ String, WebSocket])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withAppUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: RequestInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withWsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsUrl")(js.undefined)
        ret
    }
  }
  
}

