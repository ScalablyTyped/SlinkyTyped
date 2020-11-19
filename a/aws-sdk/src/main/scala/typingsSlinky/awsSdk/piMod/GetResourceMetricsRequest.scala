package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceMetricsRequest extends js.Object {
  
  /**
    * The date and time specifiying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: js.Date = js.native
  
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: String = js.native
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.piMod.MaxResults] = js.native
  
  /**
    * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can optionally specify aggregation and filtering criteria.
    */
  var MetricQueries: MetricQueryList = js.native
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
    */
  var ServiceType: typingsSlinky.awsSdk.piMod.ServiceType = js.native
  
  /**
    * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
    */
  var StartTime: js.Date = js.native
}
object GetResourceMetricsRequest {
  
  @scala.inline
  def apply(
    EndTime: js.Date,
    Identifier: String,
    MetricQueries: MetricQueryList,
    ServiceType: ServiceType,
    StartTime: js.Date
  ): GetResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], MetricQueries = MetricQueries.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceMetricsRequest]
  }
  
  @scala.inline
  implicit class GetResourceMetricsRequestOps[Self <: GetResourceMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricQueriesVarargs(value: MetricQuery*): Self = this.set("MetricQueries", js.Array(value :_*))
    
    @scala.inline
    def setMetricQueries(value: MetricQueryList): Self = this.set("MetricQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = this.set("ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPeriodInSeconds(value: Integer): Self = this.set("PeriodInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodInSeconds: Self = this.set("PeriodInSeconds", js.undefined)
  }
}
