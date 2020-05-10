package typingsSlinky.restify.mod

import typingsSlinky.bunyan.mod.^
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var certificate: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var ciphers: js.UndefOr[String] = js.native
  var dtrace: js.UndefOr[Boolean] = js.native
  var formatters: js.UndefOr[Formatters_] = js.native
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.native
  var handleUpgrades: js.UndefOr[Boolean] = js.native
  var http2: js.UndefOr[js.Any] = js.native
  var httpsServerOptions: js.UndefOr[typingsSlinky.node.httpsMod.ServerOptions] = js.native
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var log: js.UndefOr[^] = js.native
  var maxParamLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var noWriteContinue: js.UndefOr[Boolean] = js.native
  var onceNext: js.UndefOr[Boolean] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var requestCert: js.UndefOr[Boolean] = js.native
  var router: js.UndefOr[Router] = js.native
  var secureOptions: js.UndefOr[Double] = js.native
  var socketio: js.UndefOr[Boolean] = js.native
  var spdy: js.UndefOr[typingsSlinky.spdy.mod.ServerOptions] = js.native
  var strictNext: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  var versions: js.UndefOr[js.Array[String]] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withDtrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtrace")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatters(value: Formatters_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleUncaughtExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUncaughtExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleUncaughtExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUncaughtExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleUpgrades(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUpgrades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleUpgrades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUpgrades")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsServerOptions(value: typingsSlinky.node.httpsMod.ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsServerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsServerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsServerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParamLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParamLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParamLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParamLength")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWriteContinue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWriteContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWriteContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWriteContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnceNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnceNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(js.undefined)
        ret
    }
    @scala.inline
    def withRouter(value: Router): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketio")(js.undefined)
        ret
    }
    @scala.inline
    def withSpdy(value: typingsSlinky.spdy.mod.ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spdy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpdy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spdy")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
  }
  
}

