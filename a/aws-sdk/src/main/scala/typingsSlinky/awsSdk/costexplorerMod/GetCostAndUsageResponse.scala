package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCostAndUsageResponse extends StObject {
  
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.GroupDefinitions] = js.native
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResultsByTime] = js.native
}
object GetCostAndUsageResponse {
  
  @scala.inline
  def apply(): GetCostAndUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostAndUsageResponse]
  }
  
  @scala.inline
  implicit class GetCostAndUsageResponseMutableBuilder[Self <: GetCostAndUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupDefinitions(value: GroupDefinitions): Self = StObject.set(x, "GroupDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDefinitionsUndefined: Self = StObject.set(x, "GroupDefinitions", js.undefined)
    
    @scala.inline
    def setGroupDefinitionsVarargs(value: GroupDefinition*): Self = StObject.set(x, "GroupDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setResultsByTime(value: ResultsByTime): Self = StObject.set(x, "ResultsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsByTimeUndefined: Self = StObject.set(x, "ResultsByTime", js.undefined)
    
    @scala.inline
    def setResultsByTimeVarargs(value: ResultByTime*): Self = StObject.set(x, "ResultsByTime", js.Array(value :_*))
  }
}
