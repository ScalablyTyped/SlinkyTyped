package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationAggregatorSourcesStatusRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  
  /**
    * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Filters the status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.native
}
object DescribeConfigurationAggregatorSourcesStatusRequest {
  
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DescribeConfigurationAggregatorSourcesStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationAggregatorSourcesStatusRequestMutableBuilder[Self <: DescribeConfigurationAggregatorSourcesStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: AggregatedSourceStatusTypeList): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
    
    @scala.inline
    def setUpdateStatusVarargs(value: AggregatedSourceStatusType*): Self = StObject.set(x, "UpdateStatus", js.Array(value :_*))
  }
}
