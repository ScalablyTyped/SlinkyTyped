package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedActionHistoryItem extends StObject {
  
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  
  /**
    * The type of the managed action.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  
  /**
    * The date and time that the action started executing.
    */
  var ExecutedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * If the action failed, a description of the failure.
    */
  var FailureDescription: js.UndefOr[String] = js.native
  
  /**
    * If the action failed, the type of failure.
    */
  var FailureType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.FailureType] = js.native
  
  /**
    * The date and time that the action finished executing.
    */
  var FinishedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionHistoryStatus] = js.native
}
object ManagedActionHistoryItem {
  
  @scala.inline
  def apply(): ManagedActionHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedActionHistoryItem]
  }
  
  @scala.inline
  implicit class ManagedActionHistoryItemMutableBuilder[Self <: ManagedActionHistoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDescription(value: String): Self = StObject.set(x, "ActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDescriptionUndefined: Self = StObject.set(x, "ActionDescription", js.undefined)
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    @scala.inline
    def setExecutedTime(value: js.Date): Self = StObject.set(x, "ExecutedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutedTimeUndefined: Self = StObject.set(x, "ExecutedTime", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: String): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    @scala.inline
    def setFailureType(value: FailureType): Self = StObject.set(x, "FailureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureTypeUndefined: Self = StObject.set(x, "FailureType", js.undefined)
    
    @scala.inline
    def setFinishedTime(value: js.Date): Self = StObject.set(x, "FinishedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedTimeUndefined: Self = StObject.set(x, "FinishedTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionHistoryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
