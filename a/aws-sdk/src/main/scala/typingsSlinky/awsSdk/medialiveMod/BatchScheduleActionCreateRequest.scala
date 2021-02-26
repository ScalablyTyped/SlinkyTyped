package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchScheduleActionCreateRequest extends StObject {
  
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}
object BatchScheduleActionCreateRequest {
  
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
  
  @scala.inline
  implicit class BatchScheduleActionCreateRequestMutableBuilder[Self <: BatchScheduleActionCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value :_*))
  }
}
