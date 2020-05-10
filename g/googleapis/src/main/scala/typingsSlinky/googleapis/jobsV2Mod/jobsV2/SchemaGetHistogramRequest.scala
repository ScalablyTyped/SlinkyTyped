package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Input only.  A request for the
  * `GetHistogram` method.
  */
@js.native
trait SchemaGetHistogramRequest extends js.Object {
  /**
    * Optional.  Controls whether to broaden the search to avoid too few
    * results for a given query in instances where a search has sparse results.
    * Results from a broadened query is a superset of the results from the
    * original query.  Defaults to false.
    */
  var allowBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the histogram.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Meta information, such as `user_id`, collected from the job searcher or
    * other entity conducting a job search, is used to improve the
    * service&#39;s search quality. Users determine identifier values, which
    * must be unique and consist.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Required.  A list of facets that specify the histogram data to be
    * calculated against and returned.  Histogram response times can be slow,
    * and counts can be approximations. This call may be temporarily or
    * permanently removed prior to the production release of Cloud Talent
    * Solution.
    */
  var searchTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGetHistogramRequest {
  @scala.inline
  def apply(): SchemaGetHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramRequest]
  }
  @scala.inline
  implicit class SchemaGetHistogramRequestOps[Self <: SchemaGetHistogramRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowBroadening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBroadening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBroadening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBroadening")(js.undefined)
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
    def withSearchTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTypes")(js.undefined)
        ret
    }
  }
  
}

