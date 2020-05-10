package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait SchemaSearchJobsResponse extends js.Object {
  /**
    * The commute filter the service applied to the specified query. This
    * information is only available when query has a valid CommutePreference.
    */
  var appliedCommuteFilter: js.UndefOr[SchemaCommutePreference] = js.native
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var appliedJobLocationFilters: js.UndefOr[js.Array[SchemaJobLocation]] = js.native
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results,
    * seenenable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[String] = js.native
  /**
    * The histogram results that match specified
    * SearchJobsRequest.HistogramFacets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.native
  /**
    * Corresponds to SearchJobsRequest.job_view.
    */
  var jobView: js.UndefOr[String] = js.native
  /**
    * The Job entities that match the specified SearchJobsRequest.
    */
  var matchingJobs: js.UndefOr[js.Array[SchemaMatchingJob]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * The token that specifies the starting position of the next page of
    * results. This field is empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0 means all the jobs
    * in the jobs list are from the original (without broadening) query. If
    * this field is non-zero, subsequent requests with offset after this result
    * set should contain all broadened results.
    */
  var numJobsFromBroadenedQuery: js.UndefOr[Double] = js.native
  /**
    * The spell checking result, and correction.
    */
  var spellResult: js.UndefOr[SchemaSpellingCorrection] = js.native
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true` or if the response is the last page
    * of results. Otherwise, the value will be `-1`.
    */
  var totalSize: js.UndefOr[String] = js.native
}

object SchemaSearchJobsResponse {
  @scala.inline
  def apply(): SchemaSearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsResponse]
  }
  @scala.inline
  implicit class SchemaSearchJobsResponseOps[Self <: SchemaSearchJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliedCommuteFilter(value: SchemaCommutePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedCommuteFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedCommuteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedCommuteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedJobLocationFilters(value: js.Array[SchemaJobLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedJobLocationFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedJobLocationFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedJobLocationFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTotalSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTotalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTotalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHistogramResults(value: SchemaHistogramResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogramResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramResults")(js.undefined)
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
    def withMatchingJobs(value: js.Array[SchemaMatchingJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNumJobsFromBroadenedQuery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numJobsFromBroadenedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumJobsFromBroadenedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numJobsFromBroadenedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellResult(value: SchemaSpellingCorrection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellResult")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
  }
  
}

