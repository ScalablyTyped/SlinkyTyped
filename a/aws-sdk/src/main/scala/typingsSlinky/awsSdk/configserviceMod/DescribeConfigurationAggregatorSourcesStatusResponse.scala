package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationAggregatorSourcesStatusResponse extends StObject {
  
  /**
    * Returns an AggregatedSourceStatus object. 
    */
  var AggregatedSourceStatusList: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AggregatedSourceStatusList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigurationAggregatorSourcesStatusResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationAggregatorSourcesStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationAggregatorSourcesStatusResponseMutableBuilder[Self <: DescribeConfigurationAggregatorSourcesStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregatedSourceStatusList(value: AggregatedSourceStatusList): Self = StObject.set(x, "AggregatedSourceStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatedSourceStatusListUndefined: Self = StObject.set(x, "AggregatedSourceStatusList", js.undefined)
    
    @scala.inline
    def setAggregatedSourceStatusListVarargs(value: AggregatedSourceStatus*): Self = StObject.set(x, "AggregatedSourceStatusList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
