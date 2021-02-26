package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEffectiveInstanceAssociationsRequest extends StObject {
  
  /**
    * The instance ID for which you want to view all associations.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeEffectiveInstanceAssociationsRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): DescribeEffectiveInstanceAssociationsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
  }
  
  @scala.inline
  implicit class DescribeEffectiveInstanceAssociationsRequestMutableBuilder[Self <: DescribeEffectiveInstanceAssociationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: EffectiveInstanceAssociationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
