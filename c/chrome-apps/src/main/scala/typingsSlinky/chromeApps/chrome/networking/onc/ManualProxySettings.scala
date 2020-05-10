package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualProxySettings[M, P] extends js.Object {
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.native
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.native
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.native
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.native
}

object ManualProxySettings {
  @scala.inline
  def apply[M, P](): ManualProxySettings[M, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualProxySettings[M, P]]
  }
  @scala.inline
  implicit class ManualProxySettingsOps[Self[m, p] <: ManualProxySettings[m, p], M, P] (val x: Self[M, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, P]) with Other]
    @scala.inline
    def withFTPProxy(value: P): Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FTPProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFTPProxy: Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FTPProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHTTPProxy(value: P): Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPProxy: Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSOCKS(value: P): Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOCKS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSOCKS: Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOCKS")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureHTTPProxy(value: P): Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureHTTPProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureHTTPProxy: Self[M, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureHTTPProxy")(js.undefined)
        ret
    }
  }
  
}

