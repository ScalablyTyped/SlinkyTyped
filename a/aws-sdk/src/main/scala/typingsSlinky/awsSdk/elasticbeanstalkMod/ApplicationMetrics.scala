package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMetrics extends js.Object {
  /**
    * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (request_count) within the most recent time slice of 10 seconds (duration).
    */
  var Duration: js.UndefOr[NullableInteger] = js.native
  /**
    * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in seconds with one millisecond resolution.
    */
  var Latency: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Latency] = js.native
  /**
    * Average number of requests handled by the web server per second over the last 10 seconds.
    */
  var RequestCount: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.RequestCount] = js.native
  /**
    * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
    */
  var StatusCodes: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.StatusCodes] = js.native
}

object ApplicationMetrics {
  @scala.inline
  def apply(): ApplicationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationMetrics]
  }
  @scala.inline
  implicit class ApplicationMetricsOps[Self <: ApplicationMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Latency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latency")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCount(value: RequestCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: StatusCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCodes")(js.undefined)
        ret
    }
  }
  
}

