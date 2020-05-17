package typingsSlinky.nightmare.mod

import typingsSlinky.nightmare.anon.Downloads
import typingsSlinky.nightmare.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConstructorOptions extends js.Object {
  var cookiesFile: js.UndefOr[String] = js.native
  var electronPath: js.UndefOr[String] = js.native
  var executionTimeout: js.UndefOr[Double] = js.native
  //in ms
  var gotoTimeout: js.UndefOr[Double] = js.native
  var ignoreDownloads: js.UndefOr[Boolean] = js.native
  var ignoreSslErrors: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[js.Any] = js.native
  var loadImages: js.UndefOr[Boolean] = js.native
  var maxDownloadRequestWait: js.UndefOr[Double] = js.native
  var openDevTools: js.UndefOr[Mode] = js.native
  var paths: js.UndefOr[Downloads] = js.native
  var phantomPath: js.UndefOr[String] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
   // number | string;
  var port: js.UndefOr[Double] = js.native
  var proxy: js.UndefOr[String] = js.native
  var proxyAuth: js.UndefOr[String] = js.native
  var proxyType: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var sslProtocol: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[js.Any] = js.native
  var typeInterval: js.UndefOr[Double] = js.native
    // number | string;
  var waitTimeout: js.UndefOr[Double] = js.native
  var weak: js.UndefOr[Boolean] = js.native
  var webSecurity: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object IConstructorOptions {
  @scala.inline
  def apply(): IConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstructorOptions]
  }
  @scala.inline
  implicit class IConstructorOptionsOps[Self <: IConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookiesFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiesFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiesFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiesFile")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronPath")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withGotoTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGotoTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDownloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDownloads")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSslErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSslErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSslErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSslErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadImages")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDownloadRequestWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDownloadRequestWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDownloadRequestWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDownloadRequestWait")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenDevTools(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDevTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenDevTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDevTools")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: Downloads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantomPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSslProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

