package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait SchemaSearchJobsResponse extends js.Object {
  /**
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0, or if the field
    * isn&#39;t set, all the jobs in the jobs list are from the original
    * (without broadening) query. If this field is non-zero, subsequent
    * requests with offset after this result set should contain all broadened
    * results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.native
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results, see
    * enable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[Double] = js.native
  /**
    * The histogram results that match specified
    * SearchJobsRequest.histogram_facets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.native
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocation]] = js.native
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
    * The spell checking result, and correction.
    */
  var spellCorrection: js.UndefOr[SchemaSpellingCorrection] = js.native
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true`, or if the response is the last page
    * of results. Otherwise, the value is `-1`.
    */
  var totalSize: js.UndefOr[Double] = js.native
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
    def withBroadenedQueryJobsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadenedQueryJobsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadenedQueryJobsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadenedQueryJobsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTotalSize(value: Double): Self = {
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
    def withLocationFilters(value: js.Array[SchemaLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationFilters")(js.undefined)
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
    def withSpellCorrection(value: SchemaSpellingCorrection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCorrection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCorrection")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self = {
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

