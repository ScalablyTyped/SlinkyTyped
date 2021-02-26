package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowsForTargetRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: MaintenanceWindowResourceType = js.native
  
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: typingsSlinky.awsSdk.ssmMod.Targets = js.native
}
object DescribeMaintenanceWindowsForTargetRequest {
  
  @scala.inline
  def apply(ResourceType: MaintenanceWindowResourceType, Targets: Targets): DescribeMaintenanceWindowsForTargetRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowsForTargetRequestMutableBuilder[Self <: DescribeMaintenanceWindowsForTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaintenanceWindowSearchMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceType(value: MaintenanceWindowResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
