package typingsSlinky.globalTunnelNg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.globalTunnelNg.globalTunnelNgStrings.both
import typingsSlinky.globalTunnelNg.globalTunnelNgStrings.httpColon
import typingsSlinky.globalTunnelNg.globalTunnelNgStrings.https
import typingsSlinky.globalTunnelNg.globalTunnelNgStrings.httpsColon
import typingsSlinky.globalTunnelNg.globalTunnelNgStrings.neither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var connect: js.UndefOr[neither | https | both] = js.native
  var host: String = js.native
  var originHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[httpColon | httpsColon] = js.native
  var proxyAuth: js.UndefOr[String] = js.native
  var proxyHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var sockets: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(host: String, port: Double): Options = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: neither | https | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginHttpsOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHttpsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginHttpsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHttpsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: httpColon | httpsColon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
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
    def withProxyHttpsOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHttpsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyHttpsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHttpsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(js.undefined)
        ret
    }
  }
  
}

