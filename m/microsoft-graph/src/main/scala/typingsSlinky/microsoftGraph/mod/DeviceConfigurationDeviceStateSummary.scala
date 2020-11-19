package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfigurationDeviceStateSummary extends Entity {
  
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}
object DeviceConfigurationDeviceStateSummary {
  
  @scala.inline
  def apply(): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
  
  @scala.inline
  implicit class DeviceConfigurationDeviceStateSummaryOps[Self <: DeviceConfigurationDeviceStateSummary] (val x: Self) extends AnyVal {
    
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
    def setCompliantDeviceCount(value: Double): Self = this.set("compliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliantDeviceCount: Self = this.set("compliantDeviceCount", js.undefined)
    
    @scala.inline
    def setConflictDeviceCount(value: Double): Self = this.set("conflictDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictDeviceCount: Self = this.set("conflictDeviceCount", js.undefined)
    
    @scala.inline
    def setErrorDeviceCount(value: Double): Self = this.set("errorDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDeviceCount: Self = this.set("errorDeviceCount", js.undefined)
    
    @scala.inline
    def setNonCompliantDeviceCount(value: Double): Self = this.set("nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCompliantDeviceCount: Self = this.set("nonCompliantDeviceCount", js.undefined)
    
    @scala.inline
    def setNotApplicableDeviceCount(value: Double): Self = this.set("notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotApplicableDeviceCount: Self = this.set("notApplicableDeviceCount", js.undefined)
    
    @scala.inline
    def setRemediatedDeviceCount(value: Double): Self = this.set("remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediatedDeviceCount: Self = this.set("remediatedDeviceCount", js.undefined)
    
    @scala.inline
    def setUnknownDeviceCount(value: Double): Self = this.set("unknownDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownDeviceCount: Self = this.set("unknownDeviceCount", js.undefined)
  }
}
