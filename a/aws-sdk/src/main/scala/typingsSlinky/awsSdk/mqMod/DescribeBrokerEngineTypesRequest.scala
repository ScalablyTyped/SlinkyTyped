package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBrokerEngineTypesRequest extends StObject {
  
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of engine types that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.mqMod.MaxResults] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object DescribeBrokerEngineTypesRequest {
  
  @scala.inline
  def apply(): DescribeBrokerEngineTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerEngineTypesRequest]
  }
  
  @scala.inline
  implicit class DescribeBrokerEngineTypesRequestMutableBuilder[Self <: DescribeBrokerEngineTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineType(value: string): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
