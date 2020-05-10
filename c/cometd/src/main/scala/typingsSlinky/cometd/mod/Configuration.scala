package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
    * appended to the URL of the Bayeux server (see above).
    */
  var appendMessageTypeToURL: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether multiple publishes that get queued are sent as a batch on the first
    * occasion, without requiring explicit batching.
    */
  var autoBatch: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds that the backoff time increments every time a connection with the
    * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
    */
  var backoffIncrement: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
    * not apply to HTTP connections. A timeout value of 0 means to wait forever.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
    * available.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * The maximum number of milliseconds of the backoff time after which the backoff time is not
    * incremented further.
    */
  var maxBackoff: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connections used to connect to the Bayeux server. Change this value
    * only if you know exactly the client’s connection limit and what "request queued behind long
    * poll" means.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds to wait before considering a request to the Bayeux server
    * failed.
    */
  var maxNetworkDelay: js.UndefOr[Double] = js.native
  /**
    * The max length of the URI for a request made with the callback-polling transport. Microsoft
    * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
    * CometD may fail to remain within the max URI length when encoded in JSON.
    */
  var maxURILength: js.UndefOr[Double] = js.native
  /**
    * An object containing the request headers to be sent for every Bayeux request (for example,
    * `{"My-Custom-Header": "MyValue"}`).
    */
  var requestHeaders: js.UndefOr[js.Object] = js.native
  /**
    * Only applies to the websocket transport. Determines whether to stick using the websocket
    * transport when a websocket transport failure has been detected after the websocket transport
    * was able to successfully connect to the server.
    */
  var stickyReconnect: js.UndefOr[Boolean] = js.native
  /**
    * The URL of the Bayeux server this client will connect to.
    */
  var url: String = js.native
  /**
    * Uses the scheduler service available in Web Workers via Worker.setTimeout(fn, delay) rather
    * than using that available via Window.setTimeout(fn, delay). Browsers are now throttling the
    * Window scheduler in background tabs to save battery in mobile devices, so the Window scheduler
    * events are delayed by possibly several seconds, causing CometD sessions to timeout on the
    * server. The Worker scheduler is not throttled and guarantees that scheduler events happen
    * on time.
    */
  var useWorkerScheduler: js.UndefOr[Boolean] = js.native
}

object Configuration {
  @scala.inline
  def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendMessageTypeToURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMessageTypeToURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendMessageTypeToURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMessageTypeToURL")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBatch")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBackoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBackoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBackoff")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNetworkDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNetworkDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxURILength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxURILength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxURILength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxURILength")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWorkerScheduler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorkerScheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWorkerScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorkerScheduler")(js.undefined)
        ret
    }
  }
  
}

