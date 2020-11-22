package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceCompromised extends js.Object {
  
  /** The email of the user this alert was created for. */
  var email: js.UndefOr[String] = js.native
  
  /** Required. The list of security events. */
  var events: js.UndefOr[js.Array[DeviceCompromisedSecurityDetail]] = js.native
}
object DeviceCompromised {
  
  @scala.inline
  def apply(): DeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompromised]
  }
  
  @scala.inline
  implicit class DeviceCompromisedOps[Self <: DeviceCompromised] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: DeviceCompromisedSecurityDetail*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[DeviceCompromisedSecurityDetail]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
}
