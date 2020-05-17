package typingsSlinky.gapiClientCloudmonitoring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregator extends js.Object {
  /**
    * The aggregation function that will reduce the data points in each window to a single point. This parameter is only valid for non-cumulative metrics
    * with a value type of INT64 or DOUBLE.
    */
  var aggregator: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Maximum number of time series descriptors per page. Used for pagination. If not specified, count = 100. */
  var count: js.UndefOr[Double] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * A collection of labels for the matching time series, which are represented as:
    * - key==value: key equals the value
    * - key=~value: key regex matches the value
    * - key!=value: key does not equal the value
    * - key!~value: key regex does not match the value  For example, to list all of the time series descriptors for the region us-central1, you could
    * specify:
    * label=cloud.googleapis.com%2Flocation=~us-central1.&#42;
    */
  var labels: js.UndefOr[String] = js.native
  /** Metric names are protocol-free URLs as listed in the Supported Metrics page. For example, compute.googleapis.com/instance/disk/read_ops_count. */
  var metric: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Start of the time interval (exclusive), which is expressed as an RFC 3339 timestamp. If neither oldest nor timespan is specified, the default time
    * interval will be (youngest - 4 hours, youngest]
    */
  var oldest: js.UndefOr[String] = js.native
  /**
    * The pagination token, which is used to page through large result sets. Set this value to the value of the nextPageToken to retrieve the next page of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** The project ID to which this time series belongs. The value can be the numeric project ID or string-based project name. */
  var project: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Length of the time interval to query, which is an alternative way to declare the interval: (youngest - timespan, youngest]. The timespan and oldest
    * parameters should not be used together. Units:
    * - s: second
    * - m: minute
    * - h: hour
    * - d: day
    * - w: week  Examples: 2s, 3m, 4w. Only one unit is allowed, for example: 2w3d is not allowed; you should use 17d instead.
    *
    * If neither oldest nor timespan is specified, the default time interval will be (youngest - 4 hours, youngest].
    */
  var timespan: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /**
    * The sampling window. At most one data point will be returned for each window in the requested time interval. This parameter is only valid for
    * non-cumulative metric types. Units:
    * - m: minute
    * - h: hour
    * - d: day
    * - w: week  Examples: 3m, 4w. Only one unit is allowed, for example: 2w3d is not allowed; you should use 17d instead.
    */
  var window: js.UndefOr[String] = js.native
  /** End of the time interval (inclusive), which is expressed as an RFC 3339 timestamp. */
  var youngest: String = js.native
}

object Aggregator {
  @scala.inline
  def apply(metric: String, project: String, youngest: String): Aggregator = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], youngest = youngest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator]
  }
  @scala.inline
  implicit class AggregatorOps[Self <: Aggregator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYoungest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youngest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
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
    def withLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withOldest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
        ret
    }
    @scala.inline
    def withTimespan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimespan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timespan")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

