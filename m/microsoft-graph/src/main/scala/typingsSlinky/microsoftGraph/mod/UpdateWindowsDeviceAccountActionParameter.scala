package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWindowsDeviceAccountActionParameter extends js.Object {
  
  // Not yet documented
  var calendarSyncEnabled: js.UndefOr[Boolean] = js.native
  
  // Not yet documented
  var deviceAccount: js.UndefOr[WindowsDeviceAccount] = js.native
  
  // Not yet documented
  var deviceAccountEmail: js.UndefOr[String] = js.native
  
  // Not yet documented
  var exchangeServer: js.UndefOr[String] = js.native
  
  // Not yet documented
  var passwordRotationEnabled: js.UndefOr[Boolean] = js.native
  
  // Not yet documented
  var sessionInitiationProtocalAddress: js.UndefOr[String] = js.native
}
object UpdateWindowsDeviceAccountActionParameter {
  
  @scala.inline
  def apply(): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
  
  @scala.inline
  implicit class UpdateWindowsDeviceAccountActionParameterOps[Self <: UpdateWindowsDeviceAccountActionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendarSyncEnabled(value: Boolean): Self = this.set("calendarSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarSyncEnabled: Self = this.set("calendarSyncEnabled", js.undefined)
    
    @scala.inline
    def setDeviceAccount(value: WindowsDeviceAccount): Self = this.set("deviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceAccount: Self = this.set("deviceAccount", js.undefined)
    
    @scala.inline
    def setDeviceAccountEmail(value: String): Self = this.set("deviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceAccountEmail: Self = this.set("deviceAccountEmail", js.undefined)
    
    @scala.inline
    def setExchangeServer(value: String): Self = this.set("exchangeServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeServer: Self = this.set("exchangeServer", js.undefined)
    
    @scala.inline
    def setPasswordRotationEnabled(value: Boolean): Self = this.set("passwordRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRotationEnabled: Self = this.set("passwordRotationEnabled", js.undefined)
    
    @scala.inline
    def setSessionInitiationProtocalAddress(value: String): Self = this.set("sessionInitiationProtocalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionInitiationProtocalAddress: Self = this.set("sessionInitiationProtocalAddress", js.undefined)
  }
}
