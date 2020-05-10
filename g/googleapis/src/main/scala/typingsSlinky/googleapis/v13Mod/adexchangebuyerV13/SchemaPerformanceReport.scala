package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait SchemaPerformanceReport extends js.Object {
  /**
    * The number of bid responses with an ad.
    */
  var bidRate: js.UndefOr[Double] = js.native
  /**
    * The number of bid requests sent to your bidder.
    */
  var bidRequestRate: js.UndefOr[Double] = js.native
  /**
    * Rate of various prefiltering statuses per match. Please refer to the
    * callout-status-codes.txt file for different statuses.
    */
  var calloutStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * Average QPS for cookie matcher operations.
    */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rate of ads with a given status. Please refer to the
    * creative-status-codes.txt file for different statuses.
    */
  var creativeStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * The number of bid responses that were filtered due to a policy violation
    * or other errors.
    */
  var filteredBidRate: js.UndefOr[Double] = js.native
  /**
    * Average QPS for hosted match operations.
    */
  var hostedMatchStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * The number of potential queries based on your pretargeting settings.
    */
  var inventoryMatchRate: js.UndefOr[Double] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The 50th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency50thPercentile: js.UndefOr[Double] = js.native
  /**
    * The 85th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency85thPercentile: js.UndefOr[Double] = js.native
  /**
    * The 95th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency95thPercentile: js.UndefOr[Double] = js.native
  /**
    * Rate of various quota account statuses per quota check.
    */
  var noQuotaInRegion: js.UndefOr[Double] = js.native
  /**
    * Rate of various quota account statuses per quota check.
    */
  var outOfQuota: js.UndefOr[Double] = js.native
  /**
    * Average QPS for pixel match requests from clients.
    */
  var pixelMatchRequests: js.UndefOr[Double] = js.native
  /**
    * Average QPS for pixel match responses from clients.
    */
  var pixelMatchResponses: js.UndefOr[Double] = js.native
  /**
    * The configured quota limits for this account.
    */
  var quotaConfiguredLimit: js.UndefOr[Double] = js.native
  /**
    * The throttled quota limits for this account.
    */
  var quotaThrottledLimit: js.UndefOr[Double] = js.native
  /**
    * The trading location of this data.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The number of properly formed bid responses received by our servers
    * within the deadline.
    */
  var successfulRequestRate: js.UndefOr[Double] = js.native
  /**
    * The unix timestamp of the starting time of this performance data.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The number of bid responses that were unsuccessful due to timeouts,
    * incorrect formatting, etc.
    */
  var unsuccessfulRequestRate: js.UndefOr[Double] = js.native
}

object SchemaPerformanceReport {
  @scala.inline
  def apply(): SchemaPerformanceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReport]
  }
  @scala.inline
  implicit class SchemaPerformanceReportOps[Self <: SchemaPerformanceReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRate")(js.undefined)
        ret
    }
    @scala.inline
    def withBidRequestRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRequestRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidRequestRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRequestRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutStatusRate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutStatusRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieMatcherStatusRate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatcherStatusRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMatcherStatusRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatcherStatusRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeStatusRate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeStatusRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredBidRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredBidRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedMatchStatusRate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedMatchStatusRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedMatchStatusRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedMatchStatusRate")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryMatchRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryMatchRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryMatchRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryMatchRate")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency50thPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency50thPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency50thPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency50thPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency85thPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency85thPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency85thPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency85thPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency95thPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency95thPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency95thPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency95thPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withNoQuotaInRegion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noQuotaInRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoQuotaInRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noQuotaInRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfQuota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelMatchRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelMatchRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelMatchRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelMatchRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelMatchResponses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelMatchResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelMatchResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelMatchResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaConfiguredLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaConfiguredLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaConfiguredLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaConfiguredLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaThrottledLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaThrottledLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaThrottledLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaThrottledLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulRequestRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulRequestRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulRequestRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulRequestRate")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessfulRequestRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsuccessfulRequestRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessfulRequestRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsuccessfulRequestRate")(js.undefined)
        ret
    }
  }
  
}

