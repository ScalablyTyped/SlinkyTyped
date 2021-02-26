package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationStateResult extends StObject {
  
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
  implicit class DescribeApplicationStateResultMutableBuilder[Self <: DescribeApplicationStateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatusUndefined: Self = StObject.set(x, "ApplicationStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
  }
}
