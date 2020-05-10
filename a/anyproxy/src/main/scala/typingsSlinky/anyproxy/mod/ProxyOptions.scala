package typingsSlinky.anyproxy.mod

import typingsSlinky.anyproxy.anyproxyStrings.http
import typingsSlinky.anyproxy.anyproxyStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
  /** If ignore certificate error in request, default to false */
  var dangerouslyIgnoreUnauthorized: js.UndefOr[Boolean] = js.native
  /** Force intercept all https request, default to false */
  var forceProxyHttps: js.UndefOr[Boolean] = js.native
  /** Host name of the proxy server, required when this is an https proxy */
  var hostname: js.UndefOr[String] = js.native
  /** Port number of proxy server */
  var port: String | Double = js.native
  /** Recorder to use */
  var recorder: js.UndefOr[ProxyRecorder] = js.native
  /** Your rule module */
  var rule: js.UndefOr[String | RuleModule] = js.native
  /** If keep silent in console, false for default false */
  var silent: js.UndefOr[Boolean] = js.native
  /** Throttle in kb/s, unlimited for default */
  var throttle: js.UndefOr[Double] = js.native
  /** Type of the proxy server, could be 'http' or 'https'. */
  var `type`: js.UndefOr[http | https] = js.native
  /** Config for web interface */
  var webInterface: js.UndefOr[WebInterfaceOptions] = js.native
  /** Whether to intercept websocket, default to false */
  var wsIntercept: js.UndefOr[Boolean] = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(port: String | Double): ProxyOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDangerouslyIgnoreUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyIgnoreUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslyIgnoreUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyIgnoreUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withForceProxyHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProxyHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceProxyHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProxyHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withRecorder(value: ProxyRecorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: String | RuleModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: http | https): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebInterface(value: WebInterfaceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withWsIntercept(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsIntercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsIntercept")(js.undefined)
        ret
    }
  }
  
}

