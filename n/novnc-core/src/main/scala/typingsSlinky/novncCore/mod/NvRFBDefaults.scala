package typingsSlinky.novncCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.novncCore.novncCoreStrings.error
import typingsSlinky.novncCore.novncCoreStrings.normal
import typingsSlinky.novncCore.novncCoreStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NvRFBDefaults extends js.Object {
  var disconnectTimeout: js.UndefOr[Double] = js.native
  var encrypt: js.UndefOr[Boolean] = js.native
  var focusContainer: js.UndefOr[HTMLElement] = js.native
  var local_cursor: js.UndefOr[Boolean] = js.native
  var onBell: js.UndefOr[js.Function1[/* rfb */ RFB, Unit]] = js.native
  var onClipboard: js.UndefOr[js.Function2[/* rfb */ RFB, /* text */ String, Unit]] = js.native
  var onDesktopName: js.UndefOr[js.Function2[/* rfb */ RFB, /* name */ String, Unit]] = js.native
  var onDisconnected: js.UndefOr[js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[String], Unit]] = js.native
  var onFBResize: js.UndefOr[js.Function3[/* rfb */ RFB, /* width */ Double, /* height */ Double, Unit]] = js.native
  var onFBUComplete: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.native
  var onFBUReceive: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.native
  var onNotification: js.UndefOr[
    js.Function4[
      /* rfb */ RFB, 
      /* msg */ String, 
      /* level */ normal | warn | error, 
      /* options */ js.UndefOr[StringDictionary[js.Any]], 
      Unit
    ]
  ] = js.native
  var onPasswordRequired: js.UndefOr[js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[String], Unit]] = js.native
  var onUpdateState: js.UndefOr[
    js.Function3[/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState, Unit]
  ] = js.native
  var onXvpInit: js.UndefOr[js.Function1[/* version */ Double, Unit]] = js.native
  var repeaterID: js.UndefOr[String] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[HTMLCanvasElement] = js.native
  var view_only: js.UndefOr[Boolean] = js.native
  var viewportDrag: js.UndefOr[Boolean] = js.native
  var wsProtocols: js.UndefOr[js.Array[String]] = js.native
  var xvp_password_sep: js.UndefOr[String] = js.native
}

object NvRFBDefaults {
  @scala.inline
  def apply(): NvRFBDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvRFBDefaults]
  }
  @scala.inline
  implicit class NvRFBDefaultsOps[Self <: NvRFBDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_cursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBell(value: /* rfb */ RFB => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClipboard(value: (/* rfb */ RFB, /* text */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClipboard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDesktopName(value: (/* rfb */ RFB, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDesktopName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDesktopName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDesktopName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnected(value: (/* rfb */ RFB, /* reason */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDisconnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFBResize(value: (/* rfb */ RFB, /* width */ Double, /* height */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFBResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFBUComplete(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBUComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFBUComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBUComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFBUReceive(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBUReceive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFBUReceive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFBUReceive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotification(
      value: (/* rfb */ RFB, /* msg */ String, /* level */ normal | warn | error, /* options */ js.UndefOr[StringDictionary[js.Any]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotification")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasswordRequired(value: (/* rfb */ RFB, /* msg */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasswordRequired")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPasswordRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasswordRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateState(value: (/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnUpdateState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnXvpInit(value: /* version */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onXvpInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnXvpInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onXvpInit")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeaterID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeaterID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeaterID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeaterID")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withView_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_only")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withWsProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withXvp_password_sep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xvp_password_sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXvp_password_sep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xvp_password_sep")(js.undefined)
        ret
    }
  }
  
}

