package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowExecutionsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the maintenance window executions.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.native
}
object DescribeMaintenanceWindowExecutionsResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionsResultMutableBuilder[Self <: DescribeMaintenanceWindowExecutionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWindowExecutions(value: MaintenanceWindowExecutionList): Self = StObject.set(x, "WindowExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionsUndefined: Self = StObject.set(x, "WindowExecutions", js.undefined)
    
    @scala.inline
    def setWindowExecutionsVarargs(value: MaintenanceWindowExecution*): Self = StObject.set(x, "WindowExecutions", js.Array(value :_*))
  }
}
