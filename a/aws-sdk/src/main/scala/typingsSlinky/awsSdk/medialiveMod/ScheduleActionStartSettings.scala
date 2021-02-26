package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleActionStartSettings extends StObject {
  
  /**
    * Option for specifying the start time for an action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FixedModeScheduleActionStartSettings] = js.native
  
  /**
    * Option for specifying an action as relative to another action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FollowModeScheduleActionStartSettings] = js.native
  
  /**
    * Option for specifying an action that should be applied immediately.
    */
  var ImmediateModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ImmediateModeScheduleActionStartSettings] = js.native
}
object ScheduleActionStartSettings {
  
  @scala.inline
  def apply(): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit class ScheduleActionStartSettingsMutableBuilder[Self <: ScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedModeScheduleActionStartSettings(value: FixedModeScheduleActionStartSettings): Self = StObject.set(x, "FixedModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "FixedModeScheduleActionStartSettings", js.undefined)
    
    @scala.inline
    def setFollowModeScheduleActionStartSettings(value: FollowModeScheduleActionStartSettings): Self = StObject.set(x, "FollowModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "FollowModeScheduleActionStartSettings", js.undefined)
    
    @scala.inline
    def setImmediateModeScheduleActionStartSettings(value: ImmediateModeScheduleActionStartSettings): Self = StObject.set(x, "ImmediateModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "ImmediateModeScheduleActionStartSettings", js.undefined)
  }
}
