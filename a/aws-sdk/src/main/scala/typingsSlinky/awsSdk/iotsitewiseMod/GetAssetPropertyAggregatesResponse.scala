package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssetPropertyAggregatesResponse extends StObject {
  
  /**
    * The requested aggregated values.
    */
  var aggregatedValues: AggregatedValues = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetAssetPropertyAggregatesResponse {
  
  @scala.inline
  def apply(aggregatedValues: AggregatedValues): GetAssetPropertyAggregatesResponse = {
    val __obj = js.Dynamic.literal(aggregatedValues = aggregatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyAggregatesResponse]
  }
  
  @scala.inline
  implicit class GetAssetPropertyAggregatesResponseMutableBuilder[Self <: GetAssetPropertyAggregatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregatedValues(value: AggregatedValues): Self = StObject.set(x, "aggregatedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatedValuesVarargs(value: AggregatedValue*): Self = StObject.set(x, "aggregatedValues", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
