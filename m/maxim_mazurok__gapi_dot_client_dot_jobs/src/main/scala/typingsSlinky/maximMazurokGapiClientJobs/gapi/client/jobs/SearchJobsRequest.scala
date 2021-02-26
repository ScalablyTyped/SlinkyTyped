package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchJobsRequest extends StObject {
  
  /**
    * Optional. Controls whether to disable exact keyword match on Job.job_title, Job.description, Job.company_display_name, Job.locations, Job.qualifications. When disable keyword match
    * is turned off, a keyword match returns jobs that do not match given category filters when there are matching keywords. For example, the query "program manager," a result is returned
    * even if the job posting has the title "software developer," which does not fall into "program manager" ontology, but does have "program manager" appearing in its description. For
    * queries like "cloud" that does not contain title or location specific ontology, jobs with "cloud" keyword matches are returned regardless of this flag's value. Please use
    * Company.keyword_searchable_custom_fields or Company.keyword_searchable_custom_attributes if company specific globally matched custom field/attribute string values is needed.
    * Enabling keyword match improves recall of subsequent search requests. Defaults to false.
    */
  var disableKeywordMatch: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Controls whether highly similar jobs are returned next to each other in the search results. Jobs are identified as highly similar based on their titles, job categories,
    * and locations. Highly similar results are clustered so that only one representative job of the cluster is displayed to the job seeker higher up in the results, with the other jobs
    * being displayed lower down in the results. Defaults to DiversificationLevel.SIMPLE if no value is specified.
    */
  var diversificationLevel: js.UndefOr[String] = js.native
  
  /** Optional. Controls whether to broaden the search when it produces sparse results. Broadened queries append results to the end of the matching results list. Defaults to false. */
  var enableBroadening: js.UndefOr[Boolean] = js.native
  
  /** Optional. Histogram requests for jobs matching JobQuery. */
  var histogramFacets: js.UndefOr[HistogramFacets] = js.native
  
  /** Optional. Query used to search against jobs, such as keyword, location filters, etc. */
  var jobQuery: js.UndefOr[JobQuery] = js.native
  
  /** Optional. The desired job attributes returned for jobs in the search response. Defaults to JobView.SMALL if no value is specified. */
  var jobView: js.UndefOr[String] = js.native
  
  /**
    * Optional. An integer that specifies the current offset (that is, starting result location, amongst the jobs deemed by the API as relevant) in search results. This field is only
    * considered if page_token is unset. The maximum allowed value is 5000. Otherwise an error is thrown. For example, 0 means to return results starting from the first matching job, and
    * 10 means to return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and offset = 10 means to return from the second page).
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The criteria determining how search results are sorted. Default is "relevance desc". Supported options are: * `"relevance desc"`: By relevance descending, as determined by
    * the API algorithms. Relevance thresholding of query results is only available with this ordering. * `"posting_publish_time desc"`: By Job.posting_publish_time descending. *
    * `"posting_update_time desc"`: By Job.posting_update_time descending. * `"title"`: By Job.title ascending. * `"title desc"`: By Job.title descending. *
    * `"annualized_base_compensation"`: By job's CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base compensation is unspecified are put at the end
    * of search results. * `"annualized_base_compensation desc"`: By job's CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base compensation is
    * unspecified are put at the end of search results. * `"annualized_total_compensation"`: By job's CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized
    * base compensation is unspecified are put at the end of search results. * `"annualized_total_compensation desc"`: By job's CompensationInfo.annualized_total_compensation_range
    * descending. Jobs whose annualized base compensation is unspecified are put at the end of search results.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Optional. A limit on the number of jobs returned in the search results. Increasing this value above the default value of 10 can increase search response time. The value can be
    * between 1 and 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** Optional. The token specifying the current offset within search results. See SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query results. */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The meta information collected about the job searcher, used to improve the search quality of the service. The identifiers (such as `user_id`) are provided by users, and
    * must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
  
  /** This field is deprecated. */
  var requirePreciseResultSize: js.UndefOr[Boolean] = js.native
  
  /** Optional. Mode of a search. Defaults to SearchMode.JOB_SEARCH. */
  var searchMode: js.UndefOr[String] = js.native
}
object SearchJobsRequest {
  
  @scala.inline
  def apply(): SearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchJobsRequest]
  }
  
  @scala.inline
  implicit class SearchJobsRequestMutableBuilder[Self <: SearchJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableKeywordMatch(value: Boolean): Self = StObject.set(x, "disableKeywordMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableKeywordMatchUndefined: Self = StObject.set(x, "disableKeywordMatch", js.undefined)
    
    @scala.inline
    def setDiversificationLevel(value: String): Self = StObject.set(x, "diversificationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiversificationLevelUndefined: Self = StObject.set(x, "diversificationLevel", js.undefined)
    
    @scala.inline
    def setEnableBroadening(value: Boolean): Self = StObject.set(x, "enableBroadening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBroadeningUndefined: Self = StObject.set(x, "enableBroadening", js.undefined)
    
    @scala.inline
    def setHistogramFacets(value: HistogramFacets): Self = StObject.set(x, "histogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramFacetsUndefined: Self = StObject.set(x, "histogramFacets", js.undefined)
    
    @scala.inline
    def setJobQuery(value: JobQuery): Self = StObject.set(x, "jobQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueryUndefined: Self = StObject.set(x, "jobQuery", js.undefined)
    
    @scala.inline
    def setJobView(value: String): Self = StObject.set(x, "jobView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobViewUndefined: Self = StObject.set(x, "jobView", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRequestMetadata(value: RequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    @scala.inline
    def setRequirePreciseResultSize(value: Boolean): Self = StObject.set(x, "requirePreciseResultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePreciseResultSizeUndefined: Self = StObject.set(x, "requirePreciseResultSize", js.undefined)
    
    @scala.inline
    def setSearchMode(value: String): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
  }
}
