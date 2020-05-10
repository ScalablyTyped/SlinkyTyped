package typingsSlinky.restifyPlugins.mod

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
    * Status code of the response. Can be undefined in the case of an `uncaughtException`.
    * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
    */
  var statusCode: Double = js.native
}

object MetricsCallbackOptions {
  @scala.inline
  def apply(latency: Double, method: String, path: String, statusCode: Double): MetricsCallbackOptions = {
    val __obj = js.Dynamic.literal(latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
  @scala.inline
  implicit class MetricsCallbackOptionsOps[Self <: MetricsCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

