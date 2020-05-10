package typingsSlinky.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceReportsQuery extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The currency to which financial metrics should be converted. The default
    * is US Dollar (USD). If the result contains no financial metrics, this
    * flag will be ignored. Responds with an error if the specified currency is
    * not recognized.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or
    * ageGroup,gender. See the Available Reports document for a list of the
    * reports that you can retrieve and the dimensions used for those reports.
    * Also see the Dimensions document for definitions of those dimensions.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The end date for fetching YouTube Analytics data. The value should be in
    * YYYY-MM-DD format.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A list of filters that should be applied when retrieving YouTube
    * Analytics data. The Available Reports document identifies the dimensions
    * that can be used to filter each report, and the Dimensions document
    * defines those dimensions. If a request uses multiple filters, join them
    * together with a semicolon (;), and the returned result table will satisfy
    * both filters. For example, a filters parameter value of
    * video==dMH0bHeiRNg;country==IT restricts the result set to include data
    * for the given video in Italy.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Identifies the YouTube channel or content owner for which you are
    * retrieving YouTube Analytics data. - To request data for a YouTube user,
    * set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID
    * specifies the unique YouTube channel ID. - To request data for a YouTube
    * CMS content owner, set the ids parameter value to
    * contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content
    * owner.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * If set to true historical data (i.e. channel data from before the linking
    * of the channel to the content owner) will be retrieved.
    */
  var `include-historical-channel-data`: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or
    * likes,dislikes. See the Available Reports document for a list of the
    * reports that you can retrieve and the metrics available in each report,
    * and see the Metrics document for definitions of those metrics.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for YouTube Analytics data. By default the sort order is ascending.
    * The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The start date for fetching YouTube Analytics data. The value should be
    * in YYYY-MM-DD format.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter (one-based,
    * inclusive).
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceReportsQuery {
  @scala.inline
  def apply(): ParamsResourceReportsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsQuery]
  }
  @scala.inline
  implicit class ParamsResourceReportsQueryOps[Self <: ParamsResourceReportsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
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
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def `withEnd-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnd-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withInclude-historical-channel-data`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include-historical-channel-data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInclude-historical-channel-data`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include-historical-channel-data")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-results`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-results`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-results")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withStart-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStart-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(js.undefined)
        ret
    }
    @scala.inline
    def `withStart-index`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStart-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-index")(js.undefined)
        ret
    }
  }
  
}

