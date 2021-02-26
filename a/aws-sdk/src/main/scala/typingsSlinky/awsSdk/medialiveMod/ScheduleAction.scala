package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleAction extends StObject {
  
  /**
    * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
    */
  var ActionName: string = js.native
  
  /**
    * Settings for this schedule action.
    */
  var ScheduleActionSettings: typingsSlinky.awsSdk.medialiveMod.ScheduleActionSettings = js.native
  
  /**
    * The time for the action to start in the channel.
    */
  var ScheduleActionStartSettings: typingsSlinky.awsSdk.medialiveMod.ScheduleActionStartSettings = js.native
}
object ScheduleAction {
  
  @scala.inline
  def apply(
    ActionName: string,
    ScheduleActionSettings: ScheduleActionSettings,
    ScheduleActionStartSettings: ScheduleActionStartSettings
  ): ScheduleAction = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], ScheduleActionSettings = ScheduleActionSettings.asInstanceOf[js.Any], ScheduleActionStartSettings = ScheduleActionStartSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleAction]
  }
  
  @scala.inline
  implicit class ScheduleActionMutableBuilder[Self <: ScheduleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: string): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionSettings(value: ScheduleActionSettings): Self = StObject.set(x, "ScheduleActionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionStartSettings(value: ScheduleActionStartSettings): Self = StObject.set(x, "ScheduleActionStartSettings", value.asInstanceOf[js.Any])
  }
}
