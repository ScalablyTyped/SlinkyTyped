package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstancesResponse extends StObject {
  
  /**
    * Information about the instances.
    */
  var InstanceSummaryList: js.UndefOr[typingsSlinky.awsSdk.connectMod.InstanceSummaryList] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}
object ListInstancesResponse {
  
  @scala.inline
  def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  @scala.inline
  implicit class ListInstancesResponseMutableBuilder[Self <: ListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceSummaryList(value: InstanceSummaryList): Self = StObject.set(x, "InstanceSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSummaryListUndefined: Self = StObject.set(x, "InstanceSummaryList", js.undefined)
    
    @scala.inline
    def setInstanceSummaryListVarargs(value: InstanceSummary*): Self = StObject.set(x, "InstanceSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
