package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActionTargetsResponse extends StObject {
  
  /**
    * A list of ActionTarget objects. Each object includes the ActionTargetArn, Description, and Name of a custom action target available in Security Hub.
    */
  var ActionTargets: ActionTargetList = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
}
object DescribeActionTargetsResponse {
  
  @scala.inline
  def apply(ActionTargets: ActionTargetList): DescribeActionTargetsResponse = {
    val __obj = js.Dynamic.literal(ActionTargets = ActionTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActionTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeActionTargetsResponseMutableBuilder[Self <: DescribeActionTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTargets(value: ActionTargetList): Self = StObject.set(x, "ActionTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTargetsVarargs(value: ActionTarget*): Self = StObject.set(x, "ActionTargets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
