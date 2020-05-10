package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsCallbackOptions extends js.Object {
  /**
    * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
    *
    * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
    */
  var connectionState: TMetricsCallback = js.native
  /**
    * Number of inflight requests pending in restify
    */
  var inflightRequests: Double = js.native
  /**
    * Request latency
    */
  var latency: Double = js.native
  /**
    * HTTP request verb
    */
  var method: String = js.native
  /**
    * req.path() value
    */
  var path: String = js.native
  /**
    * pre handlers latency
    */
  var preLatency: Double | Null = js.native
  /**
    * Status code of the response. Can be undefined in the case of an `uncaughtException`.
    * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
    */
  var statusCode: Double = js.native
  /**
    * latency includes both request is flushed and all handlers finished
    */
  var totalLatency: Double = js.native
  /**
    * Same as `inflightRequests`
    */
  var unfinishedRequests: Double = js.native
  /**
    * use handlers latency
    */
  var useLatency: Double | Null = js.native
}

object MetricsCallbackOptions {
  @scala.inline
  def apply(
    inflightRequests: Double,
    latency: Double,
    method: String,
    path: String,
    statusCode: Double,
    totalLatency: Double,
    unfinishedRequests: Double
  ): MetricsCallbackOptions = {
    val __obj = js.Dynamic.literal(inflightRequests = inflightRequests.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], totalLatency = totalLatency.asInstanceOf[js.Any], unfinishedRequests = unfinishedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
  @scala.inline
  implicit class MetricsCallbackOptionsOps[Self <: MetricsCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInflightRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflightRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfinishedRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfinishedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionState(value: TMetricsCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withPreLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreLatencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLatency")(null)
        ret
    }
    @scala.inline
    def withUseLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseLatencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLatency")(null)
        ret
    }
  }
  
}

