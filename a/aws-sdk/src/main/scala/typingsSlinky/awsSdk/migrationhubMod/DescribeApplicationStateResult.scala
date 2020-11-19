package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationStateResult extends js.Object {
  
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var ApplicationStatus: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationStatus] = js.native
  
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
}
object DescribeApplicationStateResult {
  
  @scala.inline
  def apply(): DescribeApplicationStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationStateResult]
  }
  
  @scala.inline
  implicit class DescribeApplicationStateResultOps[Self <: DescribeApplicationStateResult] (val x: Self) extends AnyVal {
    
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
    def setApplicationStatus(value: ApplicationStatus): Self = this.set("ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationStatus: Self = this.set("ApplicationStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
  }
}
