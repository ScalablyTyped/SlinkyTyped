package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDataGaGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A comma-separated list of Analytics dimensions. E.g.,
    * 'ga:browser,ga:city'.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * End date for fetching Analytics data. Request can should specify an end
    * date formatted as YYYY-MM-DD, or as a relative date (e.g., today,
    * yesterday, or 7daysAgo). The default value is yesterday.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * Analytics data.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Unique table ID for retrieving Analytics data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * The response will include empty rows if this parameter is set to true,
    * the default is true
    */
  var `include-empty-rows`: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of Analytics metrics. E.g.,
    * 'ga:sessions,ga:pageviews'. At least one metric must be specified.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * The selected format for the response. Default format is JSON.
    */
  var output: js.UndefOr[String] = js.native
  /**
    * The desired sampling level.
    */
  var samplingLevel: js.UndefOr[String] = js.native
  /**
    * An Analytics segment to be applied to data.
    */
  var segment: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for Analytics data.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * Start date for fetching Analytics data. Requests can specify a start date
    * formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday,
    * or 7daysAgo). The default value is 7daysAgo.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceDataGaGet {
  @scala.inline
  def apply(): ParamsResourceDataGaGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDataGaGet]
  }
  @scala.inline
  implicit class ParamsResourceDataGaGetOps[Self <: ParamsResourceDataGaGet] (val x: Self) extends AnyVal {
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
    def `withInclude-empty-rows`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include-empty-rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInclude-empty-rows`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include-empty-rows")(js.undefined)
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
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
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

