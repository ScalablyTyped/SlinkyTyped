package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceComplianceUserOverview extends Entity {
  
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.native
  
  // Number of error Users
  var errorCount: js.UndefOr[Double] = js.native
  
  // Number of failed Users
  var failedCount: js.UndefOr[Double] = js.native
  
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.native
  
  // Number of not applicable users
  var notApplicableCount: js.UndefOr[Double] = js.native
  
  // Number of pending Users
  var pendingCount: js.UndefOr[Double] = js.native
  
  // Number of succeeded Users
  var successCount: js.UndefOr[Double] = js.native
}
object DeviceComplianceUserOverview {
  
  @scala.inline
  def apply(): DeviceComplianceUserOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceUserOverview]
  }
  
  @scala.inline
  implicit class DeviceComplianceUserOverviewOps[Self <: DeviceComplianceUserOverview] (val x: Self) extends AnyVal {
    
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
    def setConfigurationVersion(value: Double): Self = this.set("configurationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationVersion: Self = this.set("configurationVersion", js.undefined)
    
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setFailedCount(value: Double): Self = this.set("failedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedCount: Self = this.set("failedCount", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: String): Self = this.set("lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateDateTime: Self = this.set("lastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setNotApplicableCount(value: Double): Self = this.set("notApplicableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotApplicableCount: Self = this.set("notApplicableCount", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Double): Self = this.set("pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingCount: Self = this.set("pendingCount", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: Double): Self = this.set("successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
  }
}
