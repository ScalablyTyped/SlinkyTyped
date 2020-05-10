package typingsSlinky.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
@js.native
trait ClientOptions extends AuthOptions {
  /**
  		 * When true will automatically connect to Ably when library is instanced. This is true by default
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.native
  var closeOnUnload: js.UndefOr[Boolean] = js.native
  var defaultTokenParams: js.UndefOr[TokenParams] = js.native
  var disconnectedRetryTimeout: js.UndefOr[Double] = js.native
  /**
  		 * When true, messages published on channels by this client will be echoed back to this client.
  		 * This is true by default
  		 */
  var echoMessages: js.UndefOr[Boolean] = js.native
  /**
  		 * Use this only if you have been provided a dedicated environment by Ably
  		 */
  var environment: js.UndefOr[String] = js.native
  var fallbackHosts: js.UndefOr[js.Array[String]] = js.native
  var fallbackHostsUseDefault: js.UndefOr[Boolean] = js.native
  var idempotentRestPublishing: js.UndefOr[Boolean] = js.native
  /**
  		 * Logger configuration
  		 */
  var log: js.UndefOr[LogInfo] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
  		 * When true, messages will be queued whilst the connection is disconnected. True by default.
  		 */
  var queueMessages: js.UndefOr[Boolean] = js.native
  var realtimeHost: js.UndefOr[String] = js.native
  /**
  		 * Can be used to explicitly recover a connection.
  		 * See https://www.ably.io/documentation/realtime/connection#connection-state-recovery
  		 */
  var recover: js.UndefOr[standardCallback | String] = js.native
  var restHost: js.UndefOr[String] = js.native
  var suspendedRetryTimeout: js.UndefOr[Double] = js.native
  /**
  		 * Use a non-secure connection connection. By default, a TLS connection is used to connect to Ably
  		 */
  var tls: js.UndefOr[Boolean] = js.native
  var tlsPort: js.UndefOr[Double] = js.native
  var transportParams: js.UndefOr[StringDictionary[String]] = js.native
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
  		 * When true, the more efficient MsgPack binary encoding is used.
  		 * When false, JSON text encoding is used.
  		 */
  var useBinaryProtocol: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTokenParams(value: TokenParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTokenParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTokenParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTokenParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnectedRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectedRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnectedRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectedRetryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackHostsUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackHostsUseDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackHostsUseDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackHostsUseDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotentRestPublishing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotentRestPublishing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotentRestPublishing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotentRestPublishing")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: LogInfo): Self = {
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
    def withQueueMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtimeHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtimeHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeHost")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoverFunction2(value: (/* error */ ErrorInfo, /* results */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRecover(value: standardCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recover")(js.undefined)
        ret
    }
    @scala.inline
    def withRestHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendedRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendedRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendedRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendedRetryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBinaryProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBinaryProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBinaryProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBinaryProtocol")(js.undefined)
        ret
    }
  }
  
}

