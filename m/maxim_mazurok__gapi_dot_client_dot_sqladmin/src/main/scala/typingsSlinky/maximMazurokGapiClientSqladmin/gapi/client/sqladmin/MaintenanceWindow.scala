package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends js.Object {
  
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[Double] = js.native
  
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[Double] = js.native
  
  /** This is always *sql#maintenanceWindow*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Maintenance timing setting: *canary* (Earlier) or *stable* (Later). Learn more. */
  var updateTrack: js.UndefOr[String] = js.native
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowOps[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUpdateTrack(value: String): Self = this.set("updateTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTrack: Self = this.set("updateTrack", js.undefined)
  }
}
