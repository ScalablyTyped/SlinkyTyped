package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserSettingsResponse extends StObject {
  
  /**
    * The user settings.
    */
  var UserSettings: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserSettings] = js.native
}
object GetUserSettingsResponse {
  
  @scala.inline
  def apply(): GetUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserSettingsResponse]
  }
  
  @scala.inline
  implicit class GetUserSettingsResponseMutableBuilder[Self <: GetUserSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
