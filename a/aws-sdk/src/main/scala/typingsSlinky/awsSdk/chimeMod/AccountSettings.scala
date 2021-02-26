package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSettings extends StObject {
  
  /**
    * Setting that stops or starts remote control of shared screens during meetings.
    */
  var DisableRemoteControl: js.UndefOr[Boolean] = js.native
  
  /**
    * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
    */
  var EnableDialOut: js.UndefOr[Boolean] = js.native
}
object AccountSettings {
  
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit class AccountSettingsMutableBuilder[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableRemoteControl(value: Boolean): Self = StObject.set(x, "DisableRemoteControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRemoteControlUndefined: Self = StObject.set(x, "DisableRemoteControl", js.undefined)
    
    @scala.inline
    def setEnableDialOut(value: Boolean): Self = StObject.set(x, "EnableDialOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDialOutUndefined: Self = StObject.set(x, "EnableDialOut", js.undefined)
  }
}
