package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTimeseriesList extends StandardParameters {
  
  /**
    * The alignment period for per-time series alignment. If present,
    * alignmentPeriod must be at least 60 seconds. After per-time series
    * alignment, each time series will contain data points only on the period
    * boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE,
    * then this field is ignored. If perSeriesAligner is specified and does not
    * equal ALIGN_NONE, then this field must be defined; otherwise an error is
    * returned.
    */
  @JSName("aggregation.alignmentPeriod")
  var aggregationDotalignmentPeriod: js.UndefOr[String] = js.native
  
  /**
    * The approach to be used to combine time series. Not all reducer functions
    * may be applied to all time series, depending on the metric type and the
    * value type of the original time series. Reduction may change the metric
    * type of value type of the time series.Time series data must be aligned in
    * order to perform cross-time series reduction. If crossSeriesReducer is
    * specified, then perSeriesAligner must be specified and not equal
    * ALIGN_NONE and alignmentPeriod must be specified; otherwise, an error is
    * returned.
    */
  @JSName("aggregation.crossSeriesReducer")
  var aggregationDotcrossSeriesReducer: js.UndefOr[String] = js.native
  
  /**
    * The set of fields to preserve when crossSeriesReducer is specified. The
    * groupByFields determine how the time series are partitioned into subsets
    * prior to applying the aggregation function. Each subset contains time
    * series that have the same value for each of the grouping fields. Each
    * individual time series is a member of exactly one subset. The
    * crossSeriesReducer is applied to each subset of time series. It is not
    * possible to reduce across different resource types, so this field
    * implicitly contains resource.type. Fields not specified in groupByFields
    * are aggregated away. If groupByFields is not specified and all the time
    * series have the same resource type, then the time series are aggregated
    * into a single output time series. If crossSeriesReducer is not defined,
    * this field is ignored.
    */
  @JSName("aggregation.groupByFields")
  var aggregationDotgroupByFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The approach to be used to align individual time series. Not all
    * alignment functions may be applied to all time series, depending on the
    * metric type and value type of the original time series. Alignment may
    * change the metric type or the value type of the time series.Time series
    * data must be aligned in order to perform cross-time series reduction. If
    * crossSeriesReducer is specified, then perSeriesAligner must be specified
    * and not equal ALIGN_NONE and alignmentPeriod must be specified;
    * otherwise, an error is returned.
    */
  @JSName("aggregation.perSeriesAligner")
  var aggregationDotperSeriesAligner: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A monitoring filter that specifies which time series should be returned.
    * The filter must specify a single metric type, and can additionally
    * specify metric labels and other information. For example: metric.type =
    * "compute.googleapis.com/instance/cpu/usage_time" AND
    * metric.label.instance_name = "my-instance-name"
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Required. The end of the time interval.
    */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The beginning of the time interval. The default value for the
    * start time is the end time. The start time must not be later than the end
    * time.
    */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.native
  
  /**
    * The project on which to execute the request. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Unsupported: must be left blank. The points in each time series are
    * returned in reverse time order.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * A positive number that is the maximum number of results to return. If
    * page_size is empty or more than 100,000 results, the effective page_size
    * is 100,000 results. If view is set to FULL, this is the maximum number of
    * Points returned. If view is set to HEADERS, this is the maximum number of
    * TimeSeries returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies which information is returned about the time series.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsTimeseriesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTimeseriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTimeseriesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTimeseriesListMutableBuilder[Self <: ParamsResourceProjectsTimeseriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationDotalignmentPeriod(value: String): Self = StObject.set(x, "aggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationDotalignmentPeriodUndefined: Self = StObject.set(x, "aggregation.alignmentPeriod", js.undefined)
    
    @scala.inline
    def setAggregationDotcrossSeriesReducer(value: String): Self = StObject.set(x, "aggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationDotcrossSeriesReducerUndefined: Self = StObject.set(x, "aggregation.crossSeriesReducer", js.undefined)
    
    @scala.inline
    def setAggregationDotgroupByFields(value: js.Array[String]): Self = StObject.set(x, "aggregation.groupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationDotgroupByFieldsUndefined: Self = StObject.set(x, "aggregation.groupByFields", js.undefined)
    
    @scala.inline
    def setAggregationDotgroupByFieldsVarargs(value: String*): Self = StObject.set(x, "aggregation.groupByFields", js.Array(value :_*))
    
    @scala.inline
    def setAggregationDotperSeriesAligner(value: String): Self = StObject.set(x, "aggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationDotperSeriesAlignerUndefined: Self = StObject.set(x, "aggregation.perSeriesAligner", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIntervalDotendTime(value: String): Self = StObject.set(x, "interval.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalDotendTimeUndefined: Self = StObject.set(x, "interval.endTime", js.undefined)
    
    @scala.inline
    def setIntervalDotstartTime(value: String): Self = StObject.set(x, "interval.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalDotstartTimeUndefined: Self = StObject.set(x, "interval.startTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
