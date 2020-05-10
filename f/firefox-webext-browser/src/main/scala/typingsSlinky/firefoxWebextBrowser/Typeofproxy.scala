package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Please use `proxy.onError`.
    * @deprecated proxy.onProxyError has been deprecated and will be removed in Firefox 71\. Use proxy.onError instead.
    */
  val onProxyError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]] = js.native
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]] = js.native
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting = js.native
  /* proxy functions */
  /**
    * Registers the proxy script for the extension.
    * @deprecated proxy.register has been deprecated and will be removed in Firefox 71.
    */
  def register(url: String): js.Promise[Unit] = js.native
  /**
    * Registers the proxy script for the extension. This is an alias for proxy.register.
    * @deprecated proxy.registerProxyScript has been deprecated and will be removed in Firefox 71.
    */
  def registerProxyScript(url: String): js.Promise[_] = js.native
  /**
    * Unregisters the proxy script for the extension.
    * @deprecated proxy.unregister has been deprecated and will be removed in Firefox 71.
    */
  def unregister(): js.Promise[Unit] = js.native
}

object Typeofproxy {
  @scala.inline
  def apply(
    onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]],
    onProxyError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]],
    onRequest: ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]],
    register: String => js.Promise[Unit],
    registerProxyScript: String => js.Promise[_],
    settings: Setting,
    unregister: () => js.Promise[Unit]
  ): Typeofproxy = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onProxyError = onProxyError.asInstanceOf[js.Any], onRequest = onRequest.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), registerProxyScript = js.Any.fromFunction1(registerProxyScript), settings = settings.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister))
    __obj.asInstanceOf[Typeofproxy]
  }
  @scala.inline
  implicit class TypeofproxyOps[Self <: Typeofproxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: WebExtEvent[js.Function1[/* error */ js.Error, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnProxyError(value: WebExtEvent[js.Function1[/* error */ js.Error, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRequest(value: ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterProxyScript(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerProxyScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnregister(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

