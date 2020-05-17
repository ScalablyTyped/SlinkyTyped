package typingsSlinky.pusherJs.mod

import typingsSlinky.pusherJs.anon.Authorize
import typingsSlinky.pusherJs.pusherJsStrings.ajax
import typingsSlinky.pusherJs.pusherJsStrings.jsonp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * After this time (in miliseconds) without any messages received from the server,
    * a ping message will be sent to check if the connection is still working.
    * Default value is is supplied by the server, low values will result in unnecessary traffic.
    */
  var activityTimeout: js.UndefOr[Double] = js.native
  /**
    * Allows passing additional data to authorizers. Supports query string params and headers (AJAX only).
    * For example, following will pass foo=bar via the query string and baz: boo via headers:
    */
  var auth: js.UndefOr[AuthConfig] = js.native
  /**
    * Endpoint on your server that will return the authentication signature needed for private channels.
    */
  var authEndpoint: js.UndefOr[String] = js.native
  /**
    * Defines how the authentication endpoint, defined using authEndpoint, will be called.
    * There are two options available: ajax and jsonp.
    */
  var authTransport: js.UndefOr[ajax | jsonp] = js.native
  /**
    * If you need custom authorization behavior you can provide your own authorizer function as follows:
    */
  var authorizer: js.UndefOr[Authorizer] = js.native
  /**
    * Allows connecting to a different datacenter by setting up correct hostnames and ports for the connection.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Disables stats collection, so that connection metrics are not submitted to Pusher’s servers. These stats
    * are used for internal monitoring only and they do not affect the account stats.
    */
  var disableStats: js.UndefOr[Boolean] = js.native
  /**
    * Specified which transports must not be used by Pusher to establish a connection.
    * This settings overwrites transports whitelisted via the enabledTransports options.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be enabled.
    */
  var disabledTransports: js.UndefOr[js.Array[Transport]] = js.native
  /**
    * Specifies which transports should be used by Pusher to establish a connection.
    * Useful for applications running in controlled, well-behaving environments.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be disabled.
    */
  var enabledTransports: js.UndefOr[js.Array[Transport]] = js.native
  /**
    * Forces the connection to use encrypted transports.
    * @deprecated
    */
  var encrypted: js.UndefOr[Boolean] = js.native
  /**
    * Forces the connection to use encrypted transports.
    */
  var forceTLS: js.UndefOr[Boolean] = js.native
  var httpHost: js.UndefOr[String] = js.native
  var httpPort: js.UndefOr[Double] = js.native
  var httpsPort: js.UndefOr[Double] = js.native
  /**
    * Ignores null origin checks for HTTP fallbacks. Use with care, it should be disabled only if necessary (i.e. PhoneGap).
    */
  var ignoreNullOrigin: js.UndefOr[Boolean] = js.native
  /**
    * Time before the connection is terminated after sending a ping message.
    * Default is 30000 (30s). Low values will cause false disconnections, if latency is high.
    */
  var pongTimeout: js.UndefOr[Double] = js.native
  var wsHost: js.UndefOr[String] = js.native
  var wsPath: js.UndefOr[String] = js.native
  var wsPort: js.UndefOr[Double] = js.native
  var wssPort: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: AuthConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthTransport(value: ajax | jsonp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTransport")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizer(value: (/* channel */ Channel, /* options */ Config) => Authorize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAuthorizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(js.undefined)
        ret
    }
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStats")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTransports(value: js.Array[Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTransports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTransports")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledTransports(value: js.Array[Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTransports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTransports")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withForceTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTLS")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHost")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsPort")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNullOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNullOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNullOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNullOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withPongTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pongTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPongTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pongTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWsHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsHost")(js.undefined)
        ret
    }
    @scala.inline
    def withWsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withWsPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsPort")(js.undefined)
        ret
    }
    @scala.inline
    def withWssPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wssPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWssPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wssPort")(js.undefined)
        ret
    }
  }
  
}

