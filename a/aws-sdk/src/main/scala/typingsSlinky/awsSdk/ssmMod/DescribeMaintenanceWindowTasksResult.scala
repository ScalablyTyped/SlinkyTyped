package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowTasksResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the tasks in the maintenance window.
    */
  var Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.native
}
object DescribeMaintenanceWindowTasksResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowTasksResultMutableBuilder[Self <: DescribeMaintenanceWindowTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTasks(value: MaintenanceWindowTaskList): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: MaintenanceWindowTask*): Self = StObject.set(x, "Tasks", js.Array(value :_*))
  }
}
