package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request body of the `SearchJobs` call.
  */
@js.native
trait SchemaSearchJobsRequest extends js.Object {
  /**
    * Optional.  Controls whether to disable relevance thresholding. Relevance
    * thresholding removes jobs that have low relevance in search results, for
    * example, removing &quot;Assistant to the CEO&quot; positions from the
    * search results of a search for &quot;CEO&quot;.  Disabling relevance
    * thresholding improves the accuracy of subsequent search requests.
    * Defaults to false.
    */
  var disableRelevanceThresholding: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Controls whether to broaden the search when it produces sparse
    * results. Broadened queries append results to the end of the matching
    * results list.  Defaults to false.
    */
  var enableBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Controls if the search job request requires the return of a
    * precise count of the first 300 results. Setting this to `true` ensures
    * consistency in the number of results per page. Best practice is to set
    * this value to true if a client allows users to jump directly to a
    * non-sequential search results page.  Enabling this flag may adversely
    * impact performance.  Defaults to false.
    */
  var enablePreciseResultSize: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the search request, such as filtering by location.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  /**
    * Optional.  Restrictions on what fields to perform histogram on, such as
    * `COMPANY_SIZE` etc.
    */
  var histogramFacets: js.UndefOr[SchemaHistogramFacets] = js.native
  /**
    * Optional.  The number of job attributes returned for jobs in the search
    * response. Defaults to JobView.SMALL if no value is specified.
    */
  var jobView: js.UndefOr[String] = js.native
  /**
    * Required.  Mode of a search.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Optional.  An integer that specifies the current offset (that is,
    * starting result location, amongst the jobs deemed by the API as relevant)
    * in search results. This field is only considered if page_token is unset.
    * For example, 0 means to  return results starting from the first matching
    * job, and 10 means to return from the 11th job. This can be used for
    * pagination, (for example, pageSize = 10 and offset = 10 means to return
    * from the second page).
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Deprecated. Use sort_by instead.  Optional.  The criteria determining how
    * search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no value
    * is specified.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional.  A limit on the number of jobs returned in the search results.
    * Increasing this value above the default value of 10 can increase search
    * response time. The value can be between 1 and 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The token specifying the current offset within search results.
    * See SearchJobsResponse.next_page_token for an explanation of how to
    * obtain the next set of query results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Required.  The meta information collected about the job searcher, used to
    * improve the search quality of the service. The identifiers, (such as
    * `user_id`) are provided by users, and must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Optional.  The criteria determining how search results are sorted.
    * Defaults to SortBy.RELEVANCE_DESC if no value is specified.
    */
  var sortBy: js.UndefOr[String] = js.native
}

object SchemaSearchJobsRequest {
  @scala.inline
  def apply(): SchemaSearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsRequest]
  }
  @scala.inline
  implicit class SchemaSearchJobsRequestOps[Self <: SchemaSearchJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableRelevanceThresholding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRelevanceThresholding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRelevanceThresholding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRelevanceThresholding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBroadening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBroadening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBroadening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBroadening")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePreciseResultSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePreciseResultSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePreciseResultSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePreciseResultSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: SchemaJobFilters): Self = {
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
    def withHistogramFacets(value: SchemaHistogramFacets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogramFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withJobView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobView")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
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
    def withQuery(value: SchemaJobQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadata(value: SchemaRequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
  }
  
}

